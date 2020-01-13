package basiclibrary;
import java.util.*;
import java.util.HashSet;

public class LabThree {
    public static String weatherData(int[][] weatherArr) {
        HashSet<Integer> weatherDataList = new HashSet<>();
        for (int[] temperatures: weatherArr) {
            for (int day: temperatures) {
                weatherDataList.add(day);
            }
        }
        if (weatherDataList.isEmpty()) return "0";

        int lowestTemp = Collections.min(weatherDataList);
        int highestTemp = Collections.max(weatherDataList);
        StringBuilder response = new StringBuilder();

        response.append("Low: ").append(lowestTemp).append("\n");
        response.append("High: ").append(highestTemp).append("\n");

        for (int i = lowestTemp; i < highestTemp; i++){
            if (!weatherDataList.contains(i)) response.append(i).append(" temperature never occured").append("\n");
        }
        return response.toString();
    }

    public static String voteCount (List<String> votes) {
        if (votes.isEmpty()) return "0";

        HashSet<String> ballot = new HashSet<>();
        ballot.addAll(votes);

        int timesVoted = 0;
        String winner = null;

        for (String item : ballot) {
            int count = Collections.frequency(votes, item);
            if (timesVoted < count) {
                timesVoted = count;
                winner = String.format("%s received the most votes!", item);
            } else if (timesVoted == count) {
                winner = "No winner can be declared";
            }
        }
        return winner;
    }
}