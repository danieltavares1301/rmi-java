package rmiclient;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import rmicomum.Mensageiro;
import rmicomum.MensageiroImpl;

public class MensageiroCliente{
    public static void main(String args[]){
        try{
            Mensageiro m = (Mensageiro) Naming.lookup(MensageiroImpl.getUri());
            System.out.println(m.lerMessagem());
            if (args.length==1){
                m.enviarMensagem(args[0]);
            } else{
                m.enviarMensagem("Mensagem do cliente enviada ao servidor");
            }
        }catch(MalformedURLException e){
            System.out.println();
            System.out.println("MalformedURLException: "+e.toString());
        }catch(RemoteException e){
            System.out.println();
            System.out.println("RemoteException: "+e.toString());
        }catch(NotBoundException e){
            System.out.println();
            System.out.println("NotBoundException: "+e.toString());
        }catch(Exception e){
            System.out.println();
            System.out.println("Exception: "+e.toString());
        }
    }
}
