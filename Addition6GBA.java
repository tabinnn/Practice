class Addition
{
	int x,y;
	Addition()
	
	{
		x=10;
		y=20;
	}
		Addition(int a,int b)
		{
			x=a;
			y=b;
		}
}


class Sum
	{
		int x,y;
		Addition(int a,int b)
		{
		x=30;
		y=40;
		}
			Addition(String a,String b)
		{
			x=a;
			y=b;
		}
	}

		public class Malik
		{
		public static void main(String args[])
		{
			Addition p=new Addition();
			Addition q=new Addition(40,50);
			Addition r=new Addition(60,70);
			Addition s=new Addition(30,40);
			System.out.println(p.x+p.y);
			System.out.println(q.x+q.y);
			System.out.println(r.x+r.y);
			System.out.println(s.x+s.y);
		}
		}
	