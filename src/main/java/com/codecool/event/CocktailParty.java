package com.codecool.event;

import com.codecool.employee.Manager;
import com.codecool.employee.helper.Helper;
import com.codecool.time.Clock;

import java.time.LocalDateTime;
import java.util.List;

public class CocktailParty extends Event{
    public CocktailParty( Manager chiefOrganizer) {
        super(5,chiefOrganizer);

    }

    @Override
    public void serve(Clock clock) {
        LocalDateTime startEvent = clock.getCurrentTime();
        LocalDateTime endEvent = startEvent.plusHours(this.getDuration());
        LocalDateTime currentTime = clock.getCurrentTime();
        List<Helper> helpers = this.getHelpers();

        System.out.println("---------------------------------------");
        System.out.println("The Cocktail Party Event is starting...");
        System.out.println("----------------------------------------");

        while(currentTime.isBefore(endEvent) ){

            System.out.println("--------------------------------");
            System.out.println("The time is now: " + currentTime);
            System.out.println("--------------------------------");

            for (Helper helper : helpers){
                helper.takeBreak(clock,startEvent);
                if (! helper.isOnBreak()) {

                    System.out.println("The helper with the ID " + helper.getId() +
                            " is saying: do you want one more cocktail please?");
                    System.out.println();

                } else {
                    helper.setOnBreak(false);
                }
            }
            clock.advanceTime(5);
            currentTime = clock.getCurrentTime();
        }
        System.out.println("----------------------------------");
        System.out.println("The Cocktail Party event has ended.");
        System.out.println("-----------------------------------");

        System.out.println("--------------------------------");
        System.out.println("The time is now: " + currentTime);
        System.out.println("--------------------------------");
    }
}
