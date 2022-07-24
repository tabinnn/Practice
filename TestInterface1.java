interface Drawable
{
void draw();
}
class Rectangle implements Drawable
	{
	public void draw()
	{
	System.out.print("Drawing Rectangle");
	}
	}
	class Circle implements Drawable
	{
	public void draw()
	{
	System.out.println("Drawing Circle");
	}
	}
	public class TestInterface1
	{
	public static void main(String args[])
	{
	Rectangle obj1 = new Rectangle();
	Circle obj2 = new Circle();
	obj1.draw();
	obj1.draw();
	}
	}
