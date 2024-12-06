import java.util.ArrayList;
import java.util.Vector;

public class ChatInfo {
    private Vector <Integer> connectedClients;
    private String clientMessage;

    // This method will set the message to be sent
    public void setMessage(String newMessage)
    {
        this.clientMessage = newMessage;
    }

    // This method will append a newly connected client
    public void addClient(Integer newClient)
    {
        connectedClients.add(newClient);
    }

    // This method will return the list of connected clients
    public Vector<Integer> getClientList()
    {
        return this.connectedClients;
    }
}
