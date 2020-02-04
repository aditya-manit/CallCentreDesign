package com.aditya.callcentre;
import static com.aditya.callcentre.Position.*;

public class Respondent extends Employee {
    Position position = RESPONDENT;

    public Respondent(String name, int empID) {
        super(name, empID, RESPONDENT);
    }
}
