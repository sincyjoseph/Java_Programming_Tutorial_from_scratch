class A
{
    int l,m;
   A(int x, int y)
   {
      l=x;
      m=y;
   }

   void print()
   {
    System.out.println("l :" + l);
    System.out.println("m :"+ m);
   }
}


class Test
{
    void test(int x, int y)
    {
        x = x * 10;
        y = y * 20;
    }
    void test(A a)
    {
        a.l  = a.l * 100;
        a.m = a.m * 100;
    }
}



public class CallByValue {
  public static void main(String[] args) {

       A a = new A(10,20);
       

       Test t = new Test();
       a.print();
       t.test(a);
       a.print();

  }
}