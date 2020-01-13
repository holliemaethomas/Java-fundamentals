package basiclibrary;
import java.util.*;
import java.util.HashSet;

public class AnalyzingWeatherData {
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


}