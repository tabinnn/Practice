class Board 
{
String name="Board";
String color="White";
void writting ()
  {
System .out.println("Writting ");
    }
}
public class Test_Board

{
public static void main (String args[])
 {
     Board b1;
      b1=new Board ();
      System.out.println(b1.name);
       System.out.println(b1.color);
        b1 .writting ();
      }
}