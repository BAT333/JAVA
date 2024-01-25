import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path Diretorio = Paths.get("PASTA");
        Path SubDiretorio = Paths.get(Diretorio.toString(),"SubPasta/SubPastaCopy");
        Path CreateFiles = Paths.get(SubDiretorio.getParent().toString(),"Arquivo.txt");
        Path CreateFilesCopy = Paths.get(SubDiretorio.toString(),"ArquivoCopy.txt");
        Path DiretorioZip = Paths.get("PASTA/Pasta.zip");

        Path source = CreateFiles;
        creationAll.DIRECTORY.Creation(Diretorio);

        creationAll.SUBDIRECTORIES.Creation(SubDiretorio);

        creationAll.CreateFiles.Creation(CreateFiles,CreateFilesCopy);

        creationAll.COPYINFORMATION.COPY(source,CreateFilesCopy);
        creationAll.DIRECTORYZIP.CreationZip(SubDiretorio,DiretorioZip);


        Path FilesSer =Paths.get("PASTA/file.ser");
        FORSER fors = new FORSER("RAFAEL",1,"Dev");
        creationAll.SERIALIZAR.Serializar(fors,FilesSer);
        creationAll.DESERIALIZE.Deserializar(FilesSer);
        String text = String.valueOf(fors.id+";"+fors.name+";"+fors.job);

        Writingandreading.WRITING.whiting(text,CreateFiles);
        Writingandreading.READING.reading(CreateFilesCopy);
    }
}