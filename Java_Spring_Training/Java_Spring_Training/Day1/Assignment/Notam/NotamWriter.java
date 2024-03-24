import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

class NotamWriter {
    public void writeOutput(Map<String, List<String>> obstacleNotamMap, String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, List<String>> entry : obstacleNotamMap.entrySet()) {
                writer.write(entry.getKey());
                writer.newLine();
                writer.write("-----");
                writer.newLine();
                for (String notam : entry.getValue()) {
                    writer.write(notam);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}