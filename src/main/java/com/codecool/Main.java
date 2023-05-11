package com.codecool;

import com.codecool.company.EventCompany;
import com.codecool.employee.Manager;
import com.codecool.employee.helper.CoffeeDrinkHelper;
import com.codecool.employee.helper.Helper;
import com.codecool.employee.helper.SmokerHelper;
import com.codecool.event.Conference;
import com.codecool.event.Event;
import com.codecool.event.CocktailParty;
import com.codecool.event.Wedding;
import com.codecool.time.Clock;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Manager chiefOrganizer1 = new Manager();
        Manager organizer1 = new Manager();
        Manager organizer2 = new Manager();
        Helper helper1 = new SmokerHelper();
        Helper helper2 = new SmokerHelper();
        Helper helper3 = new SmokerHelper();
        Helper helper4 = new SmokerHelper();
        Helper helper5 = new SmokerHelper();
        Helper helper6 = new CoffeeDrinkHelper();
        Helper helper7 = new CoffeeDrinkHelper();
        Helper helper8 = new CoffeeDrinkHelper();
        Helper helper9 = new CoffeeDrinkHelper();
        Helper helper10 = new CoffeeDrinkHelper();

        Manager chiefOrganizer2 = new Manager();
        Manager organizer3 = new Manager();
        Manager organizer4 = new Manager();
        Helper helper11 = new SmokerHelper();
        Helper helper12 = new SmokerHelper();
        Helper helper13 = new SmokerHelper();
        Helper helper14 = new SmokerHelper();
        Helper helper15 = new SmokerHelper();
        Helper helper16 = new CoffeeDrinkHelper();
        Helper helper17 = new CoffeeDrinkHelper();
        Helper helper18 = new CoffeeDrinkHelper();
        Helper helper19 = new CoffeeDrinkHelper();
        Helper helper20 = new CoffeeDrinkHelper();

        EventCompany eventCompany = new EventCompany();
        eventCompany.addEmployee(chiefOrganizer1);
        eventCompany.addEmployee(chiefOrganizer2);
        eventCompany.addEmployee(organizer1);
        eventCompany.addEmployee(organizer2);
        eventCompany.addEmployee(organizer3);
        eventCompany.addEmployee(organizer4);
        eventCompany.addEmployee(helper1);
        eventCompany.addEmployee(helper2);
        eventCompany.addEmployee(helper3);
        eventCompany.addEmployee(helper4);
        eventCompany.addEmployee(helper5);
        eventCompany.addEmployee(helper6);
        eventCompany.addEmployee(helper7);
        eventCompany.addEmployee(helper8);
        eventCompany.addEmployee(helper9);
        eventCompany.addEmployee(helper10);
        eventCompany.addEmployee(helper11);
        eventCompany.addEmployee(helper12);
        eventCompany.addEmployee(helper13);
        eventCompany.addEmployee(helper14);
        eventCompany.addEmployee(helper15);
        eventCompany.addEmployee(helper16);
        eventCompany.addEmployee(helper17);
        eventCompany.addEmployee(helper18);
        eventCompany.addEmployee(helper19);
        eventCompany.addEmployee(helper20);
        Event event1 = new Wedding(chiefOrganizer1);
        event1.addOrganizer(organizer1);
        event1.addOrganizer(organizer2);
        event1.addHelper(helper1);
        event1.addHelper(helper2);
        event1.addHelper(helper3);
        event1.addHelper(helper4);
        event1.addHelper(helper5);
        event1.addHelper(helper6);
        event1.addHelper(helper7);
        event1.addHelper(helper8);
        event1.addHelper(helper9);
        event1.addHelper(helper10);
        Event event2 = new CocktailParty(chiefOrganizer2);
        event2.addOrganizer(organizer3);
        event2.addOrganizer(organizer4);
        event2.addHelper(helper11);
        event2.addHelper(helper12);
        event2.addHelper(helper13);
        event2.addHelper(helper14);
        event2.addHelper(helper15);
        event2.addHelper(helper16);
        event2.addHelper(helper17);
        event2.addHelper(helper18);
        event2.addHelper(helper19);
        event2.addHelper(helper20);
        eventCompany.addEvent(event1);
        eventCompany.addEvent(event2);

        Clock clock = new Clock(LocalDateTime.now());
        eventCompany.processEvent(clock,event1);
        eventCompany.processEvent(clock,event2);
    }
}