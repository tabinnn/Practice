class MainDemoArrayLinearSearch
{
	public static void main(String agrs[])
	{
	int [] m = new int[5];
	int index = -1;
	int key = 4;
	for(int i = 0 ; i<m.length ; i++)
	{
	if(m[i]==key)
		{
		index=i;
		break;
		}
	}
	if(index>=0)
	{
	System.out.print("Search is successful");
	System.out.print("Index number=" +index);
	}
	if(index==-1)
	{
	System.out.print("Search is not sucessful");
	}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
}