package org.example.Oexception.domain;

public class CreateException extends Exception{

    public CreateException(){
        super("ERRO");
    }
    public CreateException(String message){
        super(message);
    }
}
