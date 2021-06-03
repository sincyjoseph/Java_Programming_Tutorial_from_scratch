
class TestConstructorOverLoading
{
  public TestConstructorOverLoading()
  {
    System.out.println("Default Constructor");
  }

  public TestConstructorOverLoading(int x, int y)
  {
    System.out.println("Constructor 1");
  }

  public TestConstructorOverLoading(String x, String y)
  {
    System.out.println("Constructor 2");
  }


  void print()
  {
    System.out.println("In print");
  }

}
public class ConstructorOverLoading {
  public static void main(String[] args) {
    TestConstructorOverLoading test= 
    new TestConstructorOverLoading();
    //test.print();

    TestConstructorOverLoading test1= 
    new TestConstructorOverLoading(10,89);

    TestConstructorOverLoading test2= 
    new TestConstructorOverLoading("Anoop","Tube");
    
  }
}