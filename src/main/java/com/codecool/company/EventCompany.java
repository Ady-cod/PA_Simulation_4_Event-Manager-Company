package com.codecool.company;

import com.codecool.employee.Employee;
import com.codecool.employee.Manager;
import com.codecool.event.Event;
import com.codecool.time.Clock;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventCompany {
    private List<Employee> employees;
    private List<Event>events;

    public EventCompany() {
        this.employees = new ArrayList<>();
        this.events = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void addEvent(Event event){
        events.add(event);
    }
    public void processEvent(Clock clock,Event event){
        System.out.println();
        System.out.println("-------------------------------------------------------------------" +
                "--------------------------");
        System.out.println("A new Event is about to start!");
        System.out.println();

        System.out.println("The Event Company is checking the status of the staff, to prepare the beginning " +
                "of the event.");
        System.out.println("The Chief Organizer with the ID: " +  event.getChiefOrganizer().getId() +
                " is giving all the necessary orders");
        System.out.println("The organizers in turn are monitoring the activity.");
        System.out.println("There are a total of " + event.getOrganizers().size()
                + " organizers and that is according to the required " + event.getORGANIZERS_NUMBER() + " number.");
        System.out.println("The organizers are giving directives to the " + event.getHelpers().size()
                + " helpers present on site and their number is according to the required " +
               event.getHELPERS_NUMBER() + " number.") ;
        for (Manager manager : event.getOrganizers()){
            System.out.println("The organizer with the ID " + manager.getId() + " is present and active.");
        }
        System.out.println();
        System.out.println("The guests are welcomed and everything is ready to start");

        event.serve(clock);
    }
}
