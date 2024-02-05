import CLASSES.Shopping;
import CLASSES.Stores;

import java.util.*;

public class Compra {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
Shopping shopping = new Shopping();
        double limitBalance;
        while (true){
            System.out.println("WHAT IS THE PURCHASE LIMIT???");
            String amount = keyboard.next();
            try {
                limitBalance = Double.parseDouble(amount);
                if (limitBalance >= 0) {
                    shopping.setLimitBalance(limitBalance);

                    break;
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();

            }


        }



        while (true){
            System.out.println("WHAT IS THE NAME OF THE PRODUCT???");
            String name  = keyboard.next();

            double moneySpent;

            while (true) {
                try {
                    System.out.println("HOW MUCH DOES THIS PRODUCT COST???");

                    String money= keyboard.next();moneySpent = Double.parseDouble(money);
                    if(moneySpent >=0){

                        break;
                    }

                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }



            if(shopping.getLimitBalance()<moneySpent){

                if(shopping.getLimitBalance()<=0){
                    System.out.println("LIMIT IS OVER");
                    break;
                }

                System.out.println("NOT ENOUGH LIMIT TO PURCHASE THIS");

            }else{
                Stores stores = new Stores(name,moneySpent);
                shopping.Launchpurchase(stores);
                shopping.setLimitBalance(shopping.getLimitBalance()-moneySpent);

            }
            System.out.println("LIMITE DE COMPRA AINDA EM:"+ shopping.getLimitBalance());
            if(shopping.getLimitBalance()<=0){
                break;

            }
        }
        shopping.Purchased();
        /*
        Stores s = new Stores("CALÇA",30);
        Stores s2 = new Stores("CALÇA",33);
        Stores s3= new Stores("CALÇA",32);
        Stores s4 = new Stores("CALÇA",31);
        List<Stores> ss = new ArrayList<>();
        ss.add(s);
        ss.add(s2);
        ss.add(s3);
        ss.add(s4);
        Shopping SS = new Shopping();
        SS.setLimitBalance(1000);
        SS.Launchpurchase(s);
        SS.Purchased();



        Scanner keyboard = new Scanner(System.in);

        double limitBalance;
        while (true){
            System.out.println("WHAT IS THE PURCHASE LIMIT???");
            String amount = keyboard.next();
            try {
                limitBalance = Double.parseDouble(amount);
                if (limitBalance >= 0) {

                    break;
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();

            }


        }

        Map<String,Double> Shopping = new HashMap<>();
        List<String> products = new ArrayList<>();
        List<Double> cost = new ArrayList<>();


        while (true){
            System.out.println("WHAT IS THE NAME OF THE PRODUCT???");
            String name  = keyboard.next();

            double moneySpent;

            while (true) {
                try {
                    System.out.println("HOW MUCH DOES THIS PRODUCT COST???");

                    String money= keyboard.next();moneySpent = Double.parseDouble(money);
                    if(moneySpent >=0){

                        break;
                    }

                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }



            if(limitBalance<moneySpent){
                if(limitBalance<=0){
                    System.out.println("LIMIT IS OVER");
                    break;
                }
                System.out.println("NOT ENOUGH LIMIT TO PURCHASE THIS");

            }else{
                products.add(name);
                cost.add(moneySpent);
                Shopping.put(name,moneySpent);
                limitBalance= limitBalance-moneySpent;

            }
            System.out.println("LIMITE DE COMPRA AINDA EM:"+ limitBalance);
            if(limitBalance<=0){
                break;
                
            }
        }

        System.out.println("-----------PURCHASE LIST--------------");
        for(Map.Entry<String,Double> entry: Shopping.entrySet()){

            System.out.println(entry.getKey()+" ----- "+entry.getValue());

        }
        System.out.println("-----------PURCHASE LIST--------------");


        for(int i= 0; i<products.size();i++){
            System.out.println(cost.get(i)+"---------"+products.get(i));
        }
*/
    }
}