import client.ui.ClientUI;
import server.ui.ServerWindow;

public class App {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientUI(serverWindow);
        new ClientUI(serverWindow);
    }
}