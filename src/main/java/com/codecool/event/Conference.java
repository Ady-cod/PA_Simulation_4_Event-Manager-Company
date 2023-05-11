package com.codecool.event;

import com.codecool.employee.Manager;
import com.codecool.employee.helper.Helper;
import com.codecool.time.Clock;

import java.time.LocalDateTime;
import java.util.List;

public class Conference extends Event{
    public Conference(Manager chiefOrganizer) {
        super(10, chiefOrganizer);
    }

    @Override
    public void serve(Clock clock) {
        LocalDateTime startEvent = clock.getCurrentTime();
        LocalDateTime endEvent = startEvent.plusHours(this.getDuration());
        LocalDateTime currentTime = clock.getCurrentTime();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("The Conference Event is starting...");
        System.out.println("------------------------------------");
        System.out.println("The time is now: " + currentTime);
        System.out.println("-------------------------------------");

        List<Helper> helpers = this.getHelpers();
        for (Helper helper : helpers){

            System.out.println("The helper with the ID " + helper.getId() +
                    " is saying: please do notice the place allocated for snacks...");
            System.out.println();
        }
        while(currentTime.isBefore(endEvent) ){

            System.out.println("--------------------------------");
            System.out.println("The time is now: " + currentTime);
            System.out.println("--------------------------------");

            for (Helper helper : helpers){
                helper.takeBreak(clock,startEvent);
                if ( helper.isOnBreak()){
                    helper.setOnBreak(false);
                }

            }
            clock.advanceTime(30);
            currentTime = clock.getCurrentTime();
        }
        System.out.println("-------------------------------");
        System.out.println("The Conference Event has ended.");
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("The time is now: " + currentTime);
        System.out.println("--------------------------------");
    }
}
