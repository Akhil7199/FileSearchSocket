import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileServer {
    private static final int PORT = 3344;
    
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server listening on all interfaces on port " + PORT);

        while (true) {
            try (Socket clientSocket = serverSocket.accept();
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
                System.out.println("Client connected");

                String directoryPath = "/opt/VIL/test/";
                String caseNumber = "123";
                System.out.println("Searching in: " + directoryPath + " for case number: " + caseNumber);

                Files.walk(Paths.get(directoryPath))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".json"))
                    .forEach(path -> {
                        try {
                            String content = new String(Files.readAllBytes(path));
                            if (searchForExactCaseNumber(content, caseNumber)) {
                                writer.write("Case number found in file: " + path.getFileName());
                                writer.newLine();
                            }
                        } catch (IOException e) {
                            System.out.println("Error reading file: " + path.getFileName());
                        }
                    });
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean searchForExactCaseNumber(String jsonString, String caseNumber) {
        String patternString = "\"caseNumber\"\\s*:\\s*\"" + caseNumber + "\"\\s*(,|\\s*})";
        Pattern pattern = Pattern.compile(patternString, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(jsonString);
        return matcher.find();
    }
}
