import java.io.*;
import java.net.Socket;

public class FileClient {
    private static final String SERVER_IP = "10.0.10.31";
    private static final int PORT = 3344;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, PORT);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
             
            writer.write("/opt/VIL/test/");  // Directory path
            writer.newLine();
            writer.write("123");  // Case number
            writer.newLine();
            writer.flush();

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Unable to connect to server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
