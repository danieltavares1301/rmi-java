package rmicomum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mensageiro extends Remote {
    public void enviarMensagem(String msg) throws RemoteException; //envia mensagem
    public String lerMessagem() throws RemoteException; // lê messagem
}
