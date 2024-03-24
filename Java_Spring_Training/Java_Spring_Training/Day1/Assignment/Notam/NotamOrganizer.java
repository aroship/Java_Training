import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class NotamOrganizer {
    public Map<String, List<String>> organizeNotams(List<Notam> notams) {
        Map<String, List<String>> obstacleNotamMap = new HashMap<>();

        for (Notam notam : notams) {
            String obstacle = notam.getObstacle();
            String message = notam.getMessage();

            if (obstacleNotamMap.containsKey(obstacle)) {
                obstacleNotamMap.get(obstacle).add(message);
            }
            else {
                List<String> messageList = new ArrayList<>();
                messageList.add(message);
                obstacleNotamMap.put(obstacle, messageList);
            }
        }

        return obstacleNotamMap;
    }
}