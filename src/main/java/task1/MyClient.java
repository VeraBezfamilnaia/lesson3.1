package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 9000);
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        out.println("GET / HTTP/1.1");

        String resp = in.readLine();
        System.out.println(resp);
    }
}
