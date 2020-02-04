package com.aditya.callcentre;

public class CallCentreApplication {


    public static void main(String[] args) {

        //CallDistributingSystem will act as an helpline number !!
        CallDistributingSystem callDistributingSystem = new CallDistributingSystem();
        System.out.println();


        //3 Respondents
        callDistributingSystem.addNewRespondent(new Respondent("Ram",101));
        callDistributingSystem.addNewRespondent(new Respondent("Lakshman",102));
        callDistributingSystem.addNewRespondent(new Respondent("Bharat",103));
        //2 Managers
        callDistributingSystem.addNewManager(new Manager("Sita",201));
        callDistributingSystem.addNewManager(new Manager("Gita",202));
        //1 Director
        callDistributingSystem.addNewDirector(new Director("Hanuman",301));


        Customer ravan= new Customer("Ravan");
        ravan.makeCall(callDistributingSystem);


        Customer surpnakha= new Customer("Surpnakha");
        surpnakha.makeCall(callDistributingSystem);


        Customer indrajeet= new Customer("Indrajeet");
        indrajeet.makeCall(callDistributingSystem);


        Customer vibishan= new Customer("Vibishan");
        vibishan.makeCall(callDistributingSystem);




        ravan.endCall(callDistributingSystem);




    }
}
