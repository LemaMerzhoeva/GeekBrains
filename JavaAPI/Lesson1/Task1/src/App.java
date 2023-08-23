import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        // System.out.print("Введи число: ");
        // String line = in.next();
        // Integer x = Integer.parseInt(line);
        // String n = x.toString();
        // in.close();
        // System.out.println(x);

        // Integer a = 10; //int
        // String word = "hi";
        // Boolean flag = true; //false


        // Integer[] mass = {12,51,51,5,1,52,1};
        // for (int i = 0; i < mass.length; i++) {
        //     System.out.println(mass[i]);
        // }
        // for (Integer item : mass) {
        //     System.out.println(item);
        // }


        // HashMap<String,Integer> dist = new HashMap<String,Integer>();
        // for (String item : dist.keySet()) {
        //     System.out.println(item);
        // }

        //Игра "Угадай что"
        Scanner in = new Scanner(System.in);
        System.out.print("Угадай число: ");
        Boolean flag = true;
        Integer counts = 3;
        Integer count = 1;
        Integer magic_number = 20;
        while (count <= counts){
            Integer number = in.nextInt();
            flag = true;
            if (number == magic_number){
                System.out.println("Ты угадал!");
                in.close();
                return;
            } else {
                System.out.println("Не угадал( Количество оставшихся попыток: " + (counts - count));
                System.out.print("Попробуй еще раз: ");
                count++;
            }
        }
        System.out.println("К сожалению, ты не угадал( Ответ: " + magic_number);
        

    }
}
