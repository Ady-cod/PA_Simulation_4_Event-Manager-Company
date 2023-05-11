package com.codecool.time;

import java.time.LocalDateTime;

public class Clock {
    private LocalDateTime currentTime;

    public Clock(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void advanceTime(int minutes) {
        currentTime = currentTime.plusMinutes(minutes);
    }
}
