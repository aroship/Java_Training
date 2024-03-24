import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


class NotamProcessor {
    private final NotamParser notamParser;
    private final NotamOrganizer notamOrganizer;
    private final NotamWriter notamWriter;

    public NotamProcessor() {
        this.notamParser = new NotamParser();
        this.notamOrganizer = new NotamOrganizer();
        this.notamWriter = new NotamWriter();
    }

    public void processNotams(String inputFile, String outputFile) {
        List<String> lines = readLinesFromFile(inputFile);
        List<Notam> notams = notamParser.parseNotams(lines);
        Map<String, List<String>> obstacleNotamMap = notamOrganizer.organizeNotams(notams);
        notamWriter.writeOutput(obstacleNotamMap, outputFile);
    }

    private List<String> readLinesFromFile(String inputFile) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}