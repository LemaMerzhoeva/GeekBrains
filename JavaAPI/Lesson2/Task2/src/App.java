import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void fileWrite(String fileName, String str){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(str + '\n');
            bw.close();
        }
        catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите необходимую информацию. Для окончания ввода наберите end.");
        String str = in.nextLine();
        while (!str.toLowerCase().equals("end")){
            fileWrite("Note2.txt", str);
            str = in.nextLine();
        }
    }
}
