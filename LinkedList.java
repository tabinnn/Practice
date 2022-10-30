class Node
{
	int data;
	Node link;
}

public class LinkedList
{
	public static void main(String args[])
	{
		Node p;
		p = null;
		p = append(p,10);
		p = append(p, 20);
		p = append(p, 30);

		display(p);
	  }
	public static Node append(Node q, int data)
	{
		 Node r = new Node();
		 r.data = data;
		 r.link = null;
		if( q == null)
		{
			q = r;
		}
		else
		{      
			Node temp;
			temp = q;
			while( temp.link != null)
			{
				temp = temp.link;
			}
			temp.link = r;
		}
		return q;
	}
	public static void display(Node q)
	{
		Node temp = q;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
}





