package Day03.java;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;;

public class file1 {
    public static void main(String[] args) {
        File f = new File("Day03/java/names.txt");

        try (FileReader fr = new FileReader(f)){
            while (fr.ready()) {
                System.out.print((char)fr.read());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }

        try(Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(f)){
            fw.write("Jose");
            fw.append("\nRijo");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
