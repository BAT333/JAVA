package org.example.Oexception;

import org.example.Oexception.domain.CreateException;
import org.example.Oexception.domain.ExceptionsTest;

public class main {
    public static void main(String[] args)throws CreateException{
        ExceptionsTest test = new ExceptionsTest();
        int result = 0;
        try {
            result =  test.division(1,5);
        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }
        System.out.println(result);

        //TEST
        if(result == 0){
            try {
                throw new CreateException();
            } catch (CreateException e) {
                e.printStackTrace();
            }
        }
    }
}
