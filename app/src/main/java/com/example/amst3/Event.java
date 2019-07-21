package com.example.amst3;

public class Event {
    private String hour;
    private String timeRequired;
    private String description;
    private String place;

    public Event(String hour, String timeRequired, String description, String place){
        this.hour = hour;
        this.timeRequired = timeRequired;
        this.description = description;
        this.place = place;
    }

    public String getHour(){
        return hour;
    }

    public String getTimeRequired() {
        return timeRequired;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }
}
