import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public enum Filehandling {

    FILESEARCH(1){

        public void Search(Path...Directory) {
            int cont=1;
            for (Path Directories:Directory) {
                System.out.println("DIRECTORY SEARCH: "+cont);
                try (DirectoryStream<Path> strem = Files.newDirectoryStream(Directories)) {

                    for (Path files : strem) {
                        System.out.println(files);

                    }

                } catch (IOException ex) {
                    ex.printStackTrace();

                }
                cont++;


            }
        }
        public void Search(String Specific,Path...Directory) {
            String regex = "glob:***/***.{";
            regex+=Specific;
            regex+="}";
            PathMatcher matcher = FileSystems.getDefault().getPathMatcher(regex);

            int cont=1;
            for (Path Directories:Directory) {
                System.out.println("DIRECTORY SEARCH: "+cont);
                try (DirectoryStream<Path> strem = Files.newDirectoryStream(Directories)) {

                    for (Path files : strem) {
                        if(matcher.matches(files)){
                        System.out.println(files);
                        }

                    }

                } catch (IOException ex) {
                    ex.printStackTrace();

                }
                cont++;


            }

        }
        public void Search(Path Directory,String Specific){
            String regex = "glob:***/***.{";
            regex+=Specific;
            regex+="}";
            PathMatcher matcher = FileSystems.getDefault().getPathMatcher(regex);
            try(DirectoryStream<Path> stream = Files.newDirectoryStream(Directory)){
                for(Path files:stream){
                    if(matcher.matches(files)){
                        System.out.println(files);

                    }

                }


            }catch (IOException ex){
                ex.printStackTrace();

            }



        }


    },FILETREATMENT(2){
        @Override
        public String ReadingR(String Delimiter,Path... Name) {
            String InfoReturn="";

            for(Path file:Name){

                File files = file.toFile();
                try(FileReader fr = new FileReader(files); BufferedReader br = new BufferedReader(fr)){
                 /*
                    char[] words = new char[10];
                    fr.read(words);
                    for(char word:words){
                        System.out.print(word);
                    }
                    int characters;
                    while ((characters = fr.read())!=-1){
                        System.out.print((char) characters);
                                         }

                  */
                    String characters;
                    while ((characters = br.readLine())!=null){

                        InfoReturn+=characters;
                    }
                }catch (IOException ex){
                    ex.printStackTrace();

                }

            }

            String[] SortingOut = InfoReturn.split(Delimiter);
            for (int i=0;i<SortingOut.length;i++){

               Pattern regexName = Pattern.compile("");
               Matcher matcher = regexName.matcher(SortingOut[i]);


                   System.out.println(i+": "+SortingOut[i]);


            }

            return  InfoReturn;


        }

    };

    private final int value;
    Filehandling(int value){
        this.value = value;

    }
    public void Search(Path...Directory){System.err.println("DO NOT USE");}
    public void Search(String Specific,Path...Directory){System.err.println("DO NOT USE");}
    public void Search(Path Directory,String Specific){System.err.println("DO NOT USE");}
    public String ReadingR(String Delimiter,Path... Name) {return "DO NOT USE";}



}
