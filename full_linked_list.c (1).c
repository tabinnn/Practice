#include<stdio.h>
#include<stdlib.h>

struct node{
  int data;
  struct node *link;
};
//void append(struct node **q,int d);

void append (struct node **q, int d)
{
  struct node *r, *temp;
  temp = *q;
  r = (struct node *) malloc (sizeof (struct node));
  r->data = d;
  r->link = NULL;
  if(*q == NULL)
    {
      *q=r;
    }
    else
    {
        while(temp->link!=NULL)
        {
           temp=temp->link;
        }
        temp->link=r;
    }
}

void addatbeg(struct node **q,int d)
{
    struct node  *r;
    r=(struct node *)malloc(sizeof(struct node));
   r->data=d;
   r->link=*q;
   *q=r;
}

void insert(struct node **q,int d,int pos)
{
    struct node*r,*temp;
    temp=*q;
    r=(struct node *)malloc(sizeof(struct node));
    r->data=d;
    int i=0;
    while(i<pos-1)
    {
        temp=temp->link;
        i++;
    }
    r->link=temp->link;
    temp->link=r;
}

void delatbeg(struct node **q)
{
    struct node *temp;
    temp=*q;
    *q=temp->link;
    free(temp);
}

void delatend(struct node **q)
{
    struct node *temp,*r;
    temp=*q;
    while(temp->link!=NULL)
    {
        r=temp;
        temp=temp->link;
        
    }
    r->link=NULL;
    free(temp);
}

void delatspec(struct node **q,int pos)
{
    int i=0;
    struct node *r,*temp;
    temp=*q;
    for(i=0;i<pos;i++)
    {
        r=temp;
        temp=temp->link;
    }
    r->link=temp->link;
    free(temp);
}

int count(struct node *q)
{
    int i=0;
    while(q!=NULL)
    {
        q=q->link;
        i++;
    }
    return i;
}

void display (struct node *q)
{
  while(q!=NULL)
  {
      printf("%i\n",q->data);
      q=q->link;
  }
}


int main ()
{
  struct node *p=NULL;
    //  printf("*******************************ADD AT END********************************\n");
      
  append (&p, 10);
  append (&p, 20);
  append (&p, 30);
  display(p);
  
  
   printf("*******************************ADD AT BEGINNGING********************************\n");
    
  addatbeg(&p,40);
  display(p);
  
  
     printf("*******************************INSERT********************************\n");
      
  insert(&p,50,2);
  display(p);
  
       printf("*******************************Delete At BEGINNGING********************************\n");
    delatbeg(&p);
    display(p);
   printf("*******************************Delete At END********************************\n");
 delatend(&p);
 display (p);
     printf("*******************************Delete At Specific Place********************************\n");
    delatspec(&p,1);
    display(p);
  printf("Elements Are:\t %i\n",count(p));

}
