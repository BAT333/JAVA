package org.example.ZZFthreads.Service;

import org.example.ZZFthreads.Dominio.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String nameThread = Thread.currentThread().getName();
        System.out.println(nameThread + " STARTING");
        while (members.isOpen()|| members.pendingEmail()>0){
            try {
               String email =  members.retriverEmail();
                if(email == null) continue;
                System.out.println(nameThread +" enviando email"+ email);
                Thread.sleep(2000);
                System.out.println(nameThread +" enviado"+ email);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos emails enviado ");

    }
}
