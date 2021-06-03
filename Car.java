public class Car {

  private int numberOfWheels;
  private String enginType;

  private String model;

  private int regNumber;
  private String color;
  private double acceleration;

  public Car(String enginType,String model, String color)
  {
    System.out.println("car created");
    this.enginType = enginType;
    this.color = color;
    this.model = model;
    this.numberOfWheels = 4;
    this.acceleration = 0;
  }

  public void printDetails()
  {
    System.out.println("***************************" );
    System.out.println(this.enginType );
    System.out.println(this.color);
    System.out.println(this.model);
    System.out.println(this.numberOfWheels);
    System.out.println("Acce :"+this.acceleration);
    System.out.println("Reg Num : "+this.regNumber);
  }

  public void setRegNum(int rnum)
  {
    regNumber = rnum;
  }

  public void setModel(String mdl)
  {
    model = mdl;
  }

  public void accelerate()
  {
    this.acceleration = 80;
    System.out.println("car Accelerating...");
  }

  public void start()
  {
    this.acceleration = 10;
    System.out.println("car Strated...");
  }

  public void stop()
  {
    this.acceleration = 0;
    System.out.println("car Stoped...");
  }

  public void move()
  {
    this.acceleration = 60;
    System.out.println("car Moving...");
  }



}