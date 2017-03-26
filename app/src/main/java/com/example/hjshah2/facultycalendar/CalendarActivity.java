package com.example.hjshah2.facultycalendar;

/**
 * Created by hjshah2 on 3/26/2017.
 */

public class CalendarActivity {
    private String name;
    private int hours;
    private String days;

    public CalendarActivity(String n, int h, String d)
    {
        name=n;
        hours=h;
        days=d;
    }

    public String getName()
    {
        return name;
    }

    public int getHours()
    {
        return hours;
    }

    public String getDays()
    {
        return days;
    }

    public String toString()
    {
        return getName()+"\nHours: "+Integer.toString(getHours())+"\nSMTWTFS: "+getDays();
    }
}
