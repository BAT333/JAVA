
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.ZoneId;

public enum Writingandreading {
    WRITING(1){
        public void Whiting(String text,Path... Name) {

            for (Path File:Name){
                File files = File.toFile();
                try(FileWriter fw = new FileWriter(files); BufferedWriter bw = new BufferedWriter(fw)){
                    bw.write(text);
                    bw.newLine();

                    bw.newLine();
                    BasicFileAttributes basicFileAttributes = Files.readAttributes(File,BasicFileAttributes.class);
                    String modificationSchedule = String.valueOf(basicFileAttributes.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()));
                    bw.write(modificationSchedule);
                    bw.flush();



                }catch (IOException ex){
                    ex.printStackTrace();

                }

            }

        }

    },READING(2){
        public void Reading(Path... Name) {

            for(Path file:Name){

                File files = file.toFile();
                try(FileReader fr = new FileReader(files);BufferedReader br = new BufferedReader(fr)){
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
                        System.out.println(characters);

                    }
                }catch (IOException ex){
                 ex.printStackTrace();

                }

            }

        }
        public String ReadingR(Path... Name) {
            String InfoReturn="";

            for(Path file:Name){

                File files = file.toFile();
                try(FileReader fr = new FileReader(files);BufferedReader br = new BufferedReader(fr)){
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
            return  InfoReturn;


        }

    };

    private final int values;

    Writingandreading(int values){
        this.values=values;

    }
    public void Whiting(String text,Path... Name) {System.err.println("DO NOT USE");}
    public void Reading(Path... Name) {System.err.println("DO NOT USE");}
    public String ReadingR(Path... Name) {return "DO NOT USE";}



}