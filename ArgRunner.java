public class ArgRunner {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        for (int i = 0; i < args.length ; i++) {
              calc.add(Integer.valueOf(args[i]));
              
        }
        System.out.println("Result = " + calc.getResult());
        calc.cleanResult();
    }
}
