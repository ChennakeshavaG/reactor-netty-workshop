package mysnippets.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    // A demo class for creating an HTTP Server
    public static void main(String[] args) {
        // Step 1 : Create a socket to listen at port 1234
        try (DatagramSocket ds = new DatagramSocket(6969)) {
            byte[] receive = new byte[65535];

            while (true) {
                // Step 2 : create a DatagramPacket to receive the data.
                DatagramPacket DpReceive = new DatagramPacket(receive, receive.length);

                // Step 3 : receive the data in byte buffer.
                ds.receive(DpReceive);

                System.out.println("Client:-" + data(receive));

                // Exit the server if the client sends "quit"
                if (data(receive).toString().equals("quit")) {
                    System.out.println("Client sent bye.....EXITING");
                    break;
                }

                // Clear the buffer after every message.
                receive = new byte[65535];
            }
        } catch (Throwable throwable) {
            // Catches SocketException,UnknownHostException,IOException.
            System.out.println("Error Message" + throwable.getMessage());
            throwable.printStackTrace();
            throw new RuntimeException(throwable);
        }

    }

    // A utility method to convert the byte array
    // data into a string representation.
    public static StringBuilder data(byte[] a) {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
