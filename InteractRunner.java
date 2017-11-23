import java.util.Scanner;

/**
 * Created by ZemtsovAY on 23.11.2017.
 * Класс для запуска калькулятора, поддерживает пользовательский ввод.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.print("Enter first arg : ");
                String first = reader.next();
                System.out.print("Ener second arg : ");
                String second = reader.next();
                calc.add(Double.valueOf(first), Double.valueOf(second));
                System.out.println("Result : " + calc.getResult());
                calc.cleanResult();
                do {
                    System.out.print("exit(yes/no): ");
                    exit = reader.next();
                }while (!exit.equals("yes") && !exit.equals("no"));
            }
        }finally {
            reader.close();
        }

    }
}