import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOFunctions
{

  public static void usingScanner()
  {
    System.out.println("Enter Student name :");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Enter Student total mark :");
    int totMark = scanner.nextInt();
    System.out.println("Enter Student Prev year Percentage :");
    float percentage = scanner.nextFloat();
    System.out.println("Name : "+name);
    System.out.println("Total Mark : "+totMark);
    System.out.println("Prev Percentage : "+percentage);
  }
  public static void main(String[] args) throws IOException{
    
    //Student details

    System.out.println("Enter Student name :");

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String name = bufferedReader.readLine();

    System.out.println("Enter total mark :");

    int totMark = Integer.parseInt(bufferedReader.readLine());

    System.out.println("Enter prev year Percentage :");

    float percentage  = Float.parseFloat(bufferedReader.readLine()) ;

    System.out.println("Name : "+name);
    System.out.println("Total Mark : "+totMark);
    System.out.println("Prev Percentage : "+percentage);





    

    



  }
}