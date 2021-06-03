// Basic Program to Implement Varargs
class TestVarArgs
{
    void test(int ... v)
    {
        for(int i=0; i<v.length ; i++)
          System.out.println(v[i]);
    }

    void test(String ... v)
    {
        for(int i=0; i<v.length ; i++)
          System.out.println(v[i]);
    }
}


public class VarArgs {

  public static void main(String[] args) {
    TestVarArgs v = new TestVarArgs();

    // int a[]={10,89,56};
    // int b[]={10,89};
    // int c[]={10};
    v.test(88,99,56,78,999);
    v.test("Anoop","tube");
    //v.test();
  }
  
}
