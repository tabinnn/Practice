class Dog 
{
string name="puppy";
string color="Red";
void barking()
  {
System .out.println("Dog is Barking");
    }
}
public class Test_Dog

{
       public static void main (String args[])
 {
     Dog d1;
      d1=new Dog ();


      System.out.println(d1.name);
       System.out.println(d1.color);
        d1 .barking();
      }
}