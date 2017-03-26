package com.example.hjshah2.facultycalendar;

/**
 * Created by hjshah2 on 3/26/2017.
 */
public class CalendarEvent {
    private String name;
    private long startTime;
    private long endTime;

    public CalendarEvent(String n, long s, long e) {
        name = n;
        startTime = s;
        endTime = e;
    }

    public String getName() {
        return name;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime()
    {
        return endTime;
    }
}

