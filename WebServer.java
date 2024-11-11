import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.Desktop;
import java.net.URI;

public class WebServer {
    public static void main(String[] args) {
        int port = 8080;
        
        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port + "...");
            
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI("http://localhost:" + port));
            }

            while (true) {
                try (Socket socket = server.accept()) {
                    String response = "HTTP/1.1 200 OK\r\n" +
                                      "Content-Type: text/html\r\n" +
                                      "\r\n" +
                                      "<html><body><h1>Hello World</h1></body></html>";

                    OutputStream output = socket.getOutputStream();
                    output.write(response.getBytes());
                    output.flush();
                } catch (Exception e) {
                    System.out.println("Error handling the connection: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error starting the server: " + e.getMessage());
        }
    }
}
