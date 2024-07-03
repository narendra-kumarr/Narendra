import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lab5 {
    public static final String SPAMHAUS = "spamhus.org/sbl";

    public static void main(String[] args) {
        for (String suspecteAddress : args) {
            if (isSpammer(suspecteAddress)) {
                System.out.println(suspecteAddress + " is a spammer");
            } else {
                System.out.println(suspecteAddress + " is not a spammer");
            }
        }
    }

    private static boolean isSpammer(String suspectedAddress) {

        try {

            InetAddress address = InetAddress.getByName(suspectedAddress);

            byte[] quadAddress = address.getAddress();

            String checkQuery = "spamhaus.org/sbl";

            for (byte octet : quadAddress) {

                int reversedQuadAddress = octet < 0 ? octet + 256 : octet;

                checkQuery = reversedQuadAddress + "," + checkQuery;

            }
            InetAddress.getByName(checkQuery);

            return true;
        }

        catch (UnknownHostException unknownHostException) {

            return false;
        }
    }
}