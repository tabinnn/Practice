#include<stdio.h>
void display2DArray(int a[][2], int r, int c)
{
	int i,j;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		      printf("%i\t", a[i][j]);
		}
		printf("\n");
	}

}
void displayRowPointer(int (*q)[2],int r, int c)
{
	int i,j;
	int *p;
	for(i=0;i<r;i++)
	{
		p =(int *)q;
		for(j=0;j<c;j++)
		{
		      printf("%i\t", *p);
		      p++;
		}
		printf("\n");
		q++;
	}


}
void displayNestedLoop(int *p, int r,int c)
{
	int i,j;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		      printf("%i\t", *(p+i*c+j));
		}
		printf("\n");
	}

}

void display(int *p, int r,int c)
{
	int i;
	for(i=0;i<r*c;i++)
	{
		printf("%i\n",*(p+i));
	}
}
void main()
{
	int arr[3][2]={1,2,3,4,5,6};


	printf("************ display(arr,3,2)*************\n");
	display(arr,3,2);
	printf("************ displayNestedLoop(arr,3,2)*************\n");
	displayNestedLoop(arr,3,2);
	printf("************ displayRowPointer(arr,3,2)*************\n");
	displayRowPointer(arr,3,2);
	printf("************ display2DArray(arr,3,2)*************\n");
	display2DArray(arr,3,2);

}
