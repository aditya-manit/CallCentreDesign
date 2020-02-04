package com.aditya.callcentre;
import java.util.*;
import static com.aditya.callcentre.Status.*;

public class CallDistributingSystem {
    private List<Respondent> ListOfRespondents = new ArrayList<Respondent>();
    private List<Manager> ListOfManagers = new ArrayList<Manager>();
    private List<Director> ListOfDirectors = new ArrayList<Director>();
    private HashMap<String ,Employee> map = new HashMap<String, Employee> ();


    //Constructor
    public CallDistributingSystem() {
        System.out.println("Call Distributing System is Deployed Now !!");
    }

    //Getters
    public List<Respondent> getListOfRespondents() {
        return ListOfRespondents;
    }

    public List<Manager> getListOfManagers() {
        return ListOfManagers;
    }

    public List<Director> getListOfDirectors() {
        return ListOfDirectors;
    }

    //Setters
    public void addNewRespondent(Respondent respondent) {
        ListOfRespondents.add(respondent);
    }

    public void addNewManager (Manager manager) {
        ListOfManagers.add(manager);
    }

    public void addNewDirector (Director director) {
        ListOfDirectors.add(director);
    }

    public void handleCall(boolean dispatchCallToSomeone, String name)
    {
        if(dispatchCallToSomeone) {
            System.out.println("Hi " + name +" we are connecting you to one of our employeee !!");
            if (transferCall(name)) return;
            System.out.println("All Operators are busy Right now !! Please try again later !!");
            beautifyOnCallStart();
        }
        else
        {
            if(freeCall(name)) return;
            System.out.println("Make a Call First !!");
            beautifyOnCallEnd();
        }

    }









    //ENCAPSULATION: CUSTOMER NEED NOT TO KNOW HOW HANDLE CALL IS IMPLEMENTED !!
    private boolean transferCall(String name) {
        if (transferCallToRespondence(name)) return true;
        System.out.println("All Respondent are busy !!");

        if (transferCallToManager(name)) return true;
        System.out.println("All Managers are busy !!");

        return transferCallToDirector(name);
    }

    private boolean transferCallToDirector(String name) {
        for(Director director : ListOfDirectors)
        {
            if(Objects.equals(director.getStatus(),FREE))
            {
                director.attendCall();
                director.setStatus(BUSY);
                map.put(name,director);
                beautifyOnCallStart();
                return true;
            }
        }
        return false;
    }

    private boolean transferCallToManager(String name) {
        for(Manager manager : ListOfManagers)
        {
            if(Objects.equals(manager.getStatus(), FREE))
            {
                manager.attendCall();
                manager.setStatus(BUSY);
                map.put(name,manager);
                beautifyOnCallStart();
                return true;
            }
        }
        return false;
    }

    private boolean transferCallToRespondence(String name) {
        for(Respondent respondent : ListOfRespondents)
        {
            if(Objects.equals(respondent.getStatus(), FREE))
            {
                respondent.attendCall();
                respondent.setStatus(BUSY);
                map.put(name,respondent);
                beautifyOnCallStart();
                return true;
            }
        }
        return false;
    }


    private boolean freeCall(String name)
    {
        if(map.containsKey(name))
        {
            System.out.println("Hi " + name +" your call will be disconnected now.......");
            Employee employee= map.get(name);
            employee.cancleCall();
            employee.setStatus(FREE);
            map.remove(name);
            beautifyOnCallEnd();
            return true;
        }

        return false;
    }

    private void beautifyOnCallStart() {
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
    }

    private void beautifyOnCallEnd() {
        System.out.println("*********************************************");
    }

}
