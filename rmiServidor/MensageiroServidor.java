package rmiServidor;

import java.rmi.Naming;
import rmicomum.Mensageiro;
import rmicomum.MensageiroImpl;

public class MensageiroServidor {
    public MensageiroServidor(){
        try{
            Mensageiro m = new MensageiroImpl();
            Naming.rebind(MensageiroImpl.getUri(), m);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

    public static void main(String[] args){
        new MensageiroServidor();
    }
}
