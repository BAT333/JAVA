package CLASSES;

import CLASSES.Constant.AddressRecord;
import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("cep")
    private int zipCode;
    private String publicPlace;
    private  String complement;
    private String neighborhood;
    private String locality;
    private String Uf;

    public Address(AddressRecord aR){
        this.zipCode =Integer.valueOf(aR.cep().replace("-",""));
        this.publicPlace = aR.logradouro();
        this.complement = aR.complemento();
        this.locality = aR.localidade();
        this.Uf = aR.uf();
        this.neighborhood = aR.bairro();


    }
    public int getZipCode(){
        return zipCode;

    }
    public void setZipCode(int zipCode){
        this.zipCode = zipCode;

    }


    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                ", publicPlace='" + publicPlace + '\'' +
                ", complement='" + complement + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", locality='" + locality + '\'' +
                ", Uf='" + Uf + '\'' +
                '}';
    }
}
