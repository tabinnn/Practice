#include<stdio.h>

void  main()
{
	int arr[3][2]={1,2,3,4,5,6};
	int *p;// pointer to int
	int (*q)[2];  //row pointer or pointer of array to  int

	p = arr;
	q= arr;

	printf("p=%u\n",p);
	printf("q=%u\n",q);
	p++;
	q++;
	printf("p=%u\n",p);
	printf("q=%u\n",q);

}








	getch();

}
