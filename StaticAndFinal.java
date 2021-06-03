
class Test
{
    final double pi = 3.14;

    static int numberOfObjects=0;

    Test()
    {
      numberOfObjects ++;
    }

    void printNumberOfObjects()
    {
      System.out.println(pi);
      System.out.println("Number of Objects Created : "+ numberOfObjects);
    }
    
}

public class StaticAndFinal {
  public static void main(String[] args) {

    Test t1= new Test();
    Test t2= new Test();
    Test t3= new Test();
    Test t4= new Test();
    Test t5= new Test();
    Test t6= new Test();

    t3.printNumberOfObjects();

    
  }
}