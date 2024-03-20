package mysnippets.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (DatagramSocket ds = new DatagramSocket()) {
            // Step 1:Create the socket object for carrying the data.
            InetAddress ip = InetAddress.getLocalHost();
            byte[] buf = null;

            // loop while user not enters "quit"
            while (true) {
                String input = sc.nextLine();

                // convert the String input into the byte array.
                buf = input.getBytes();

                // Step 2 : Create the datagramPacket for sending the data.
                DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 6969);

                // Step 3 : invoke the send call to actually send the data.
                ds.send(DpSend);

                // break the loop if user enters "bye"
                if (input.equals("quit"))
                    break;
            }
        } catch (Throwable throwable) {
            // Catches SocketException,UnknownHostException,IOException.
            System.out.println("Error Message" + throwable.getMessage());
            throw new RuntimeException(throwable);
        }
    }
}
