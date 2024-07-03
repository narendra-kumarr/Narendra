import java.io.IOException;
import java.net.InetAddress;

public class Lab {
    public static void main(String[] args) {
        String ipAddress = "142.250.205.228"; // Example IP address

        try {
            InetAddress address = InetAddress.getByName(ipAddress);
            System.out.println("IP address: " + address.getHostAddress());
            System.out.println("Hostname: " + address.getHostName());
            System.out.println("Canonical Hostname: " + address.getCanonicalHostName());

            // Check if the address is reachable
            boolean isReachable = address.isReachable(5000); // Timeout in milliseconds
            System.out.println("Is reachable: " + isReachable);

            // Check if the address is a loopback address
            boolean isLoopback = address.isLoopbackAddress();
            System.out.println("Is loopback address: " + isLoopback);

            // Check if the address is an IPv4 or IPv6 address
            if (address instanceof java.net.Inet4Address) {
                System.out.println("The IP address is IPv4");
            } else if (address instanceof java.net.Inet6Address) {
                System.out.println("The IP address is IPv6");
            } else {
                System.out.println("Unknown IP address type");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

