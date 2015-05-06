import java.util.Scanner;

public class HelloWorld{
  private static Scanner in=new Scanner(System.in);
  public static void main(String[] args){
    System.out.print("What is your name?");
    String name=in.nextLine();
    System.out.println("Hello "+name+"!");
  }

}
