import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.io.BufferedReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;


class Calculator {
    public int calculate(char op, int a, int b, String LOG_FILE_PATH) {
        int res;
        switch (op) {
            case '+':
                res = add(a,b);
                break;
            case '-':
                res = minus(a, b);
                break;            
            case '*':
                res = mult(a, b);
                break; 
            case '/':
                res = divide(a, b);
                break; 
            default:
                throw new IllegalArgumentException("Некорректный оператор: " + op);
        }
        log(a,b,op,res,LOG_FILE_PATH);
        return res;
    }
  
    private void log(int a, int b, char op, int res, String LOG_FILE_PATH){
      File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(logFile, false);
                fileWriter.write(LocalDate.now() + " " + LocalTime.now() + " User entred the first operand = " + a);
                fileWriter.write(LocalDate.now() + " " + LocalTime.now() + " User entred the operation = " + op);
                fileWriter.write(LocalDate.now() + " " + LocalTime.now() + " User entred the second operand = " + b);
                fileWriter.write(LocalDate.now() + " " + LocalTime.now() + " Result is " + res);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
      
    

    private int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
  }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class App {

    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        
        clearLogFile();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b, LOG_FILE_PATH);
        System.out.println(result);

        try {
            BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearLogFile() {
        File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(logFile, false);
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}