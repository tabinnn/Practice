class Bord 
{
String name="bord";
String color="White";
void writting ()
  {
System .out.println("Writting ");
    }
}
public class Test_Bord

{
public static void main (String args[])
 {
     bord b1;
      b1=new bord ();
      System.out.println(b1.name);
       System.out.println(b1.color);
        b1 .writting ();
      }
}