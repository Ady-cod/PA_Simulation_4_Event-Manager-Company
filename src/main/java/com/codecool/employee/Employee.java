package com.codecool.employee;

import java.util.UUID;

public abstract class Employee {
    private UUID id;

    public Employee() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
