package bimbimbambam;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = new Socket("localhost", 1900);

        try {
            PrintWriter out = new PrintWriter(
                new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
                ), true
            );

            sleep(1000);
            String message = "M-am conectat la server!";
            out.println(message);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}
