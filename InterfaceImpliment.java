import java.util.Scanner;
interface MyInterface
{
   public void method1(int a);
   abstract void method2(int a);
}
class InterfaceImpliment implements MyInterface
{
  public void method1(int a)
  {
      System.out.println("implementation of method1 : The number is "+ a);
  }
  public void method2(int a)
  {
      System.out.println("implementation of method2 : The Square is" + (a*a));
  }
  public static void main(String arg[])	
  {
      MyInterface mif = new InterfaceImpliment();
      
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a Number");
      int choice = kb.nextInt();
      mif. method1(choice);
      mif.method2(choice);
  }
}
  
  
  
  
  

