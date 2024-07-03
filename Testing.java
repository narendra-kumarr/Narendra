import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Testing {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName(args[0]);
            System.out.println("Hostname:" +args[0]);
            System.out.println("Ip Address:" +address.getHostAddress());
            System.out.println("Hostname:" + (address.isReachable(Integer.parseInt(args[1]))? "Reachable" : "Not Reachable"));
        }
        catch(UnknownHostException exception){
            System.out.println("Unknown host exception : unable to resolve host");
        }
        catch(IOException exception){
            System.out.println("Something went wrong");
        }
    }
}