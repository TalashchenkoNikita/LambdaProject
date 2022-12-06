package homework;

import java.util.List;

public class DaysOfWeek {
    private final static List<String> listDaysOfWeek = List.of("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
            "FRIDAY", "SATURDAY", "SUNDAY");
    public static String getDay () {
        return listDaysOfWeek.get((int)(Math.random() * listDaysOfWeek.size()-1));
    }

}
