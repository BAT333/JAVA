package org.example.ZZFthreads;

import org.example.ZZFthreads.Dominio.Account;
import org.example.ZZFthreads.Dominio.Members;
import org.example.ZZFthreads.Service.EmailDeliveryService;

import javax.swing.*;

public class EmailTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread thread = new Thread(new EmailDeliveryService(members),"RIAN");
        Thread thread2 = new Thread(new EmailDeliveryService(members),"RAFAEL");
        thread2.start();
        thread.start();
        while (true){
            String string = JOptionPane.showInputDialog("QUAL SEU EMAIL");
            if(string == null|| string.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(string);
        }

    }


}
