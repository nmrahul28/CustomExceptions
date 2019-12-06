package com.cusom.exceptions;

public class Main {

    public static void main(String[] args)  {
        Verify verify = new Verify("Raj", 1234567);
        try {
            verify.checkName();
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            verify.checkPincode();
        } catch (InvalidPincodeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is final block");
        }
    }
}
