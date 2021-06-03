
class TestOverLoading
{
    void sum()
    {
      System.out.println("In sum function ");
    }
    void sum(int x, int y)
    {
      System.out.println("x + y ="+(x+y));
    }

    float sum(float x, float y)
    {
      System.out.println("x + y ="+(x+y));
      return (x+y);
    }


}

public class MethodOverLoading {
  public static void main(String[] args) {

    TestOverLoading test = new TestOverLoading();
    test.sum();
    test.sum(10,25);
    float x = test.sum(10.899f,25.97564f);
    System.out.println(x);
  }
}