package com.aditya.callcentre;

import static com.aditya.callcentre.Status.*;

public abstract class Employee {
    protected String name;
    protected int empID;
    protected Position position;
    protected Status status =  FREE;
    protected boolean canHandleCall = true;  // This Feature is yet to be implemented --> ESCALATION OF CALLS !!

    public Employee(String name, int empID, Position position) {
        this.name = name;
        this.empID = empID;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isCanHandleCall() {
        return canHandleCall;
    }

    public void setCanHandleCall(boolean canHandleCall) {
        this.canHandleCall = canHandleCall;
    }

    //PLOYMORPHISM IN ACTION !!
    public void attendCall()
    {
        System.out.println("Hi, this is " + this.getName() + " a  " + this.getPosition() + " Employee ID= " + this.getEmpID() +'\n' +"How may I assist You !!");

    }

    public void cancleCall()
    {
        System.out.println("This is " + this.getName() + " Thank You for Calling !!");
    }

}
