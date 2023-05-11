package com.codecool.event;

import com.codecool.employee.Manager;
import com.codecool.employee.helper.Helper;
import com.codecool.time.Clock;

import java.util.ArrayList;
import java.util.List;

public abstract class Event {
    private int ORGANIZERS_NUMBER = 2;
    private int HELPERS_NUMBER = 10;
    private int duration;
    private Manager chiefOrganizer;
    private List<Manager>organizers;
    private List<Helper> helpers;

    public Event(int duration, Manager chiefOrganizer) {
        this.duration = duration;
        this.chiefOrganizer = chiefOrganizer;
        this.organizers = new ArrayList<>();
        this.helpers = new ArrayList<>();
    }
    public void addOrganizer(Manager manager){
        organizers.add(manager);
    }
    public void addHelper(Helper helper){
        helpers.add(helper);
    }

    public int getORGANIZERS_NUMBER() {
        return ORGANIZERS_NUMBER;
    }

    public int getHELPERS_NUMBER() {
        return HELPERS_NUMBER;
    }

    public int getDuration() {
        return duration;
    }

    public Manager getChiefOrganizer() {
        return chiefOrganizer;
    }

    public List<Manager> getOrganizers() {
        return organizers;
    }

    public List<Helper> getHelpers() {
        return helpers;
    }
    public abstract void serve(Clock clock);
}
