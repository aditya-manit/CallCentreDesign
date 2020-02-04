package com.aditya.callcentre;
import static com.aditya.callcentre.Position.*;

public class Manager extends Employee {
    Position psoition = MANAGER;

    public Manager(String name, int empID) {
        super(name, empID, MANAGER);
    }
}
