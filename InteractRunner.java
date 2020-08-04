import java.util.Scanner;


public class InteractRunner {

     public static void main(String[] args) {

     Scanner reader = new Scanner(System.in);

     try{
          Calculator calc = new Calculator();
          String exit = "no";
          while(!exit.equals("yes")) {
               System.out.println("введите первый аргумент: ");
               String first = reader.next();
               System.out.println("введите второй аргумент: ");
               String second = reader.next();
               calc.add(Integer.valueOf(first), Integer.valueOf(second));
               System.out.println("Результат: " + calc.getResult());
               calc.cleanResult();
               System.out.println("Выход: yes\no");
               exit = reader.next();

               }
          } finally {
                 reader.close();
          }
     }

}