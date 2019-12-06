package com.cusom.exceptions;

public class Verify {
    private String name;
    private int pinCode;
    public Verify(String name, int pinCode){
        this.name=name;
        this.pinCode=pinCode;
    }
    public void checkName() throws InvalidNameException {
        if(name.length()<5 || name.length()>20){
             throw new InvalidNameException("Name is Invalid");
        }
    }
    public void checkPincode() throws InvalidPincodeException {
        if(Integer.toString(pinCode).length()!=6){
             throw new InvalidPincodeException("Invalid Pincode");
        }
    }
}
