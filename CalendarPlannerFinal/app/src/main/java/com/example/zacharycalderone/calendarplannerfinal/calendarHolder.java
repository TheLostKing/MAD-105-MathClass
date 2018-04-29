package com.example.zacharycalderone.calendarplannerfinal;

public class calendarHolder {
    CalendarActivity cal = new CalendarActivity();
    String name;

    public calendarHolder(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
