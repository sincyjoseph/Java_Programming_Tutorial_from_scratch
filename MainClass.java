public class MainClass {
  public static void main(String[] args) {
    
    Car benz = new Car("Petrol","benz","Red");
    benz.printDetails();

    benz.setRegNum(256386);
    benz.printDetails();

    benz.start();
    benz.accelerate();
    benz.printDetails();
    benz.move();
    benz.printDetails();
    benz.stop();
    benz.printDetails();

  }
  
}