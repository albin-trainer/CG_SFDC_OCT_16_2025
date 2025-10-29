package comcg.exceptions;

import java.util.Scanner;
public class ThrowEx1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("Yes, u r eligible for vote");
        }
        else
        //throw new ArithmeticException();
        try{
        throw new InvalidAgeException("Age should alteast 18 ");
        }
        catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }

        System.out.println("********THANK YOU*********");
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}