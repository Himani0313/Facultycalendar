package com.example.hjshah2.facultycalendar;

/**
 * Created by hjshah2 on 3/26/2017.
 */

public class FilledTimes {
    private long startTime;
    private long endTime;

    public FilledTimes(long s, long e)
    {
        startTime=s;
        endTime=e;
    }

    public long getStart()
    {
        return startTime;
    }

    public long getEnd()
    {
        return endTime;
    }
}
