import calculator.divide.Divide;
import calculator.Sub;
import calculator.Mult;
import calculator.Sum;

class Test
{
  public static void main(String[] args) {
      Sum s = new Sum();
      System.out.println(s.calculate(10, 20));

      Sub sub = new Sub();
      System.out.println(sub.calculate(10, 20));

      Mult m = new Mult();
      System.out.println(m.calculate(10, 20));

      Divide d = new Divide();
      System.out.println(d.calculate(10, 20));


  }
}