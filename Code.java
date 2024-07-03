// Program to find the Ipaddres and Host name of a website
import java.io.IOException;
import java.net.InetAddress;
public class Code{
    public static void main(String[]args){
    try{
        //printing Ip address using Hostname 
       InetAddress address = InetAddress.getByName("www.google.com");
       System.out.println(address);

       //printing hostname using Ip address
       InetAddress host = InetAddress.getByName("142.250.205.228");
       System.out.println(host);
    }  catch (IOException e){
        System.out.println(e.getMessage());
    }
}}