import java.net.InetSocketAddress;
import java.net.Socket;

public class PortScanner {

    public static void main(String[] args) {

        boolean isOpen = portIsOpen("162.159.134.234", 80, 200);

        if (isOpen == true) {
            System.out.println("Denne port er åben");
        }
        else {
            System.out.println("Denne port er lukket");
        }





    }

    public static boolean portIsOpen(String ip, int port, int timeout) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), timeout);
            socket.close();
            return true;


        } catch (Exception ex) {
            return false;
        }


    }
}
