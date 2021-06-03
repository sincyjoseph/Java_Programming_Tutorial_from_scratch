
class Outer
{

    int outer_x = 185;

    class Inner
    {
      int inner_x;
      void inner_test()
      {
        System.out.println(outer_x);
        System.out.println("In Inner");
      }
    }

    void outer_test()
    {
      System.out.println("In outer");
      Inner ii = new Inner();
      ii.inner_test();

      for(int i = 0; i<5 ; i++)
      {
          class for_inner
          {
            int for_inner_x;
            void for_inner_test()
            {
              System.out.println("In For Inner");
            }
          }

          for_inner fi = new for_inner();
          fi.for_inner_test();
      }
    }


}





public class InnerClasses {
  public static void main(String[] args) {

    Outer o = new Outer();
    o.outer_test();
    
  }
}