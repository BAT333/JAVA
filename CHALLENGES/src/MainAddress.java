import CLASSES.Address;
import CLASSES.Constant.AddressRecord;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainAddress {
    public static void main(String[] args) {

//Separa tudo em class

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://viacep.com.br/ws/08460367/json/")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
            String json = response.body();
            Gson gsonAddress = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).setPrettyPrinting().create();
            AddressRecord addressRecord = gsonAddress.fromJson(json,AddressRecord.class);
            System.out.println(addressRecord);
            Address address = new Address(addressRecord);


            Path Directory = Paths.get("ClientFolder");
            Path Directories = Paths.get(Directory.toString(),"Adresses");
            Path AddressFiles =Paths.get(Directories.toString(),"AddressFiles.json");
            File file = AddressFiles.toFile();

            if(Files.notExists(Directory)){Files.createDirectory(Directory);}
            if(Files.notExists(Directories)){Files.createDirectories(Directories);}
            if(Files.notExists(AddressFiles)){Files.createFile(AddressFiles);}

            FileWriter fw = new FileWriter(file);
            String AddressJson = gsonAddress.toJson(address);
            fw.write(AddressJson);
            fw.flush();
            fw.close();




        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (InterruptedException ex) {

            System.out.println(ex.getMessage());
            ex.printStackTrace();

        }
    }
}