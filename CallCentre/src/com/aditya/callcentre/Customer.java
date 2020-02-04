package com.aditya.callcentre;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  makeCall(CallDistributingSystem callDistributingSystem)
    {
        callDistributingSystem.handleCall(true,this.name);
    }

    public  void  endCall(CallDistributingSystem callDistributingSystem)
    {
        callDistributingSystem.handleCall(false,this.name);
    }
}
