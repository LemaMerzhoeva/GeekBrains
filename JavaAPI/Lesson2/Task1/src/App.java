import java.util.ArrayList;
import java.io.*;

public class App {
    public static void WriteFile(String fileName, ArrayList<String> words){
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false));
            bw.write("Hello world!" + "\n");
            for (String item : words) {
                bw.append(item + "\n");
            }
            bw.close();
        }
        catch(Exception ex){ 
           System.out.println("Error");
        }
    }

    public static ArrayList<String> ReadFile(String fileName){
        ArrayList<String> words = new ArrayList<String>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            //Посимвольное чтение
            // int c;
            // while ((c = br.read()) != -1){
            //     System.out.print((char)c);
            // }

            //Построчное чтение
            String c;
            while ((c = br.readLine()) != null){
                // System.out.println(c);
                words.add(c);
            }
            br.close();
        }
        catch(Exception ex){
           System.out.println("Error");
        }
        return words;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> words = ReadFile("Note1.txt");
        System.out.println(words.get(1));
        words.set(1,"Hello");
        System.out.println(words.get(1));
        words.remove(5);
        System.out.println(words);
        WriteFile("Note1.txt", words);

    }
}
