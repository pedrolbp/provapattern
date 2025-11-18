import java.io.FileWriter;
import java.io.IOException;

public enum Logger {
    INSTANCE;

    private Logger() {
        // Initialization if needed
    }

    public void log(String message) {
        // Log to file
        try (FileWriter writer = new FileWriter("logs.txt", true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Send to external server (simulated)
        System.out.println("Sending to external server: " + message);
    }
}
