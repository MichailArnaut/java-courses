public class Calculate {

       public static void main(String[] arg) {
             System.out.println("Calculate...");
             int first = Integer.valueOf(arg[0]);
             int second = Integer.valueOf(arg[1]);
             int summ = first + second;
             int raznost = first - second;
             int umnog = first*second;
             double delit = first/second;
             int step = first*first;
             System.out.println("Sum " + summ);
             System.out.println("Raznost "  + raznost);
             System.out.println("Umnog " + umnog);
             System.out.println("Delit " + delit);
             System.out.println("Step " + step);
       
       }

}