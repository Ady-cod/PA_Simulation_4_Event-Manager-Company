package com.codecool.employee.helper;

import com.codecool.employee.Employee;
import com.codecool.time.Clock;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Helper extends Employee {
    private boolean onBreak;


    public Helper() {
        this.onBreak = false;
    }
    public void takeBreak(Clock clock, LocalDateTime startEvent){
        LocalDateTime currentTime = clock.getCurrentTime();
        long minutesOfWork = ChronoUnit.MINUTES.between(startEvent, currentTime);

        if (minutesOfWork >= 120 && minutesOfWork % 120 == 0){
            this.onBreak=true;
            breakActivity();
        }
    }

    public boolean isOnBreak() {
        return onBreak;
    }
    protected abstract void breakActivity();

    public void setOnBreak(boolean onBreak) {
        this.onBreak = onBreak;
    }
}
