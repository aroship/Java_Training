import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NotamParser {
    public List<Notam> parseNotams(List<String> lines) {
        return lines.stream()
                .filter(line -> line.contains("OBST "))
//                .map(line -> parseNotam(line))
                .map(this::parseNotam)
                .toList();
    }

    private Notam parseNotam(String line) {
        String obstacle = null;
        String latLong = "";

        Pattern obstaclePattern = Pattern.compile("OBST (.+)");
        Matcher matcher = obstaclePattern.matcher(line);
        if (matcher.find()) {
            obstacle = matcher.group(1).split(" ")[0];
        }

        Pattern latLongPattern = Pattern.compile("\\b[0-9]+\\.?[0-9]*[NS]\\s[0-9]+\\.?[0-9]*[EW]\\b");
        matcher = latLongPattern.matcher(line);
        if (matcher.find()) {
            latLong = matcher.group();
        }

        if (obstacle != null) {
            return new Notam(obstacle, latLong, line);
        }
        return null;
    }
}