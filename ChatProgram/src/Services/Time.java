package Services;

import java.sql.Timestamp;

public class Time{
    public static Timestamp timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }
}

