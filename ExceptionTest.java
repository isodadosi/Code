public class ExceptionTest {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    try {
      int c = a / b;
      System.out.println(a + " / " + b + " = "  + c);
      return;
    }
    catch(ArithmeticException e) {
      System.out.println("not 0 divide");
    }
    catch(NumberFormatException e) {
      System.out.println("plz num");
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("plz 2 num");
    }
    finally {
      System.out.println("close program");
    }
  }
}