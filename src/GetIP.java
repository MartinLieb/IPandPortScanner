import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {

    public static void main(String[] args) throws UnknownHostException {

                InetAddress inetAddress = InetAddress.getByName("discord.gg");
                System.out.println("IP Address:- " + inetAddress.getHostAddress());
                System.out.println("Host Name:- " + inetAddress.getHostName());
            }
        }
