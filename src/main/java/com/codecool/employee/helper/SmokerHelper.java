package com.codecool.employee.helper;

public class SmokerHelper extends Helper{

    @Override
    protected void breakActivity() {
        System.out.println("The helper with the ID " + this.getId() + " is smoking...");
        System.out.println();
    }
}
