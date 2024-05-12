package org.example.Oexception.domain;

public class ExceptionsTest {
    /*
@param b cannot zero
@return int
@throws ArithmeticException
     */

    public int division(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new RuntimeException("b cannot zero");
        }
        return a/b;
    }
}
