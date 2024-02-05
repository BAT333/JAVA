package CLASSES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shopping {
    private double limit;
    private double limitBalance;
    private List<Stores> stores;

    public Shopping(){
        this.stores = new ArrayList<>();

    }
    public Shopping(double limit,double limitBalance, List<Stores> stores){
        this.limit = limit;
        this.limitBalance = limitBalance;
        this.stores = stores;

    }



    public double getLimit(){
        return limit;
    }
    public void setLimit(double limit){
        this.limit = limit;
    }
    public double getLimitBalance(){
        return limitBalance;
    }
    public void setLimitBalance(double limitBalance){
        this.limitBalance = limitBalance;
    }
    public List<Stores> getStores(){
        return stores;
    }
    public void setStores(List<Stores> stores){
        this.stores = stores;
    }
    public boolean Launchpurchase(Stores stores){
      if(this.limitBalance>stores.getCost()){
          this.stores.add(stores);
         return true;
      }else{
          return false;
      }




    }
    public void Purchased(){
        Collections.sort(this.stores);
        for(Stores stores1:stores){
            System.out.println(stores1);
        }

    }



    @Override
    public String toString() {
        return "Shopping{" +
                "limit=" + limit +
                ", limitBalance=" + limitBalance +
                ", stores=" + stores +
                '}';
    }
}
