
class Box
{
    double length;
    double height;
    double width;
    public Box()
    {
       length = -1;
       height = -1;
       width = -1; 
    }

    public Box(double l,double w,double h)
    {
       length = l;
       height = h;
       width = w; 
    }

    public Box(Box b)
    {
       length = b.length;
       height = b.height;
       width = b.width; 
    }

    public void volume()
    {
      System.out.println("Volume :"+(height*length*width));
    }

    public void equal(Box b)
    {
      if(b.height == height &&
         b.width == width &&
         b.length == length)
      {
        System.out.println("Equal");
      }
      else{
        System.out.println("Not Equal");
      }

    }

}


public class ObjectParameters {
  public static void main(String[] args) {
    Box b = new Box(10,56.8,96.3);
    b.volume();

    Box b1 = new Box(10,56.8,96.3);
    b1.volume();

    Box b2Clone = new Box(b1);

    b2Clone.equal(b1);

  }
}