import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestingReachability {

    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName(args[0]);
            System.out.println("Hostname:" +args[0]);
            System.out.println("Ip Address:" +address.getHostAddress());
            System.out.println("Hostname:" +(address.isReachable(Integer.parseInt(args[1]))?"Reachable":"Not Reachable"));
        }
        catch(IOException exception){
           if(exception instanceof UnknownHostException)
           {
            System.out.println("Unknown host exception : unable to resolve host");
           }
           else{
            System.out.println("Something went wrong");
           }
        }
    }
}