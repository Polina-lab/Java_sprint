package sprint;

import java.util.*;
import java.io.*;

public class WeatherStation {
    private static final LinkedHashMap<Integer, String> ID_TO_KEY = new LinkedHashMap<>();
    static {
        ID_TO_KEY.put(1, "airTemp");
        ID_TO_KEY.put(2, "airPressure");
        ID_TO_KEY.put(7, "precipitation");
        ID_TO_KEY.put(11, "windSpeed");
        ID_TO_KEY.put(12, "windDirection");
        ID_TO_KEY.put(13, "humidity");
        ID_TO_KEY.put(14, "dewPoint");
        ID_TO_KEY.put(15, "soilMoisture");
        ID_TO_KEY.put(22, "cloudCover");
    }
    
    private final Map<String, Object> state;

    public WeatherStation() {
        state = new LinkedHashMap<>();
        initializeState();
    }
    
    private void initializeState() {
        for (String key : ID_TO_KEY.values()) {
            state.put(key, "NULL");
        }
    }
    
    public void updateState(String message) {
        String[] lines = message.split("\\n");
        for (String line : lines) {
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0]);
            if (ID_TO_KEY.containsKey(id)) {
                if(parts[1].equals("NULL")){
                    state.put(ID_TO_KEY.get(id), "NULL");
                } else {
                    Float value = Float.parseFloat(parts[1]);
                    state.put(ID_TO_KEY.get(id), value);
                }
            }
        }
    }
    
    public String getState() {
        StringBuilder result = new StringBuilder();
        for (Integer id : ID_TO_KEY.keySet()) {
            String key = ID_TO_KEY.get(id);
            result.append(key).append(":").append(state.get(key)).append("\n");
        }
        return result.toString();
    }
    
    public void clearState() {
        initializeState();
    }
}
