package com.codecool.employee.helper;

public class CoffeeDrinkHelper extends Helper{

    @Override
    protected void breakActivity() {
        System.out.println("The helper with the ID " + this.getId() + " is drinking coffee...");
        System.out.println();
    }
}
