package com.aditya.callcentre;
import static com.aditya.callcentre.Position.*;

public class Director extends Employee {
    Position position = DIRECTOR;

    public Director(String name, int empID) {
        super(name, empID, DIRECTOR);
    }
}
