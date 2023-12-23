package bimbimbambam;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1900);

        try {
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );

            PrintWriter out = new PrintWriter(
                new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
                ), true
            );

            InetSocketAddress remoteAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
            String remoteHost = remoteAddress.getHostName();
            int remotePort = remoteAddress.getPort();

            System.out.println("Client nou conectat: " + remoteHost + ":" + remotePort);
            System.out.println(in.readLine());
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
            socket.close();
        }
    }
}
