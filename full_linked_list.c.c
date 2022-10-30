#include<stdio.h>
#include<stdlib.h>

struct node{
  int data;
  struct node *link;
};
void append(struct node **q,int d);

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

/*void delatend(struct node **q)
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
}*/
//* HERE STARTS DOUBLY LINKED LIST*//

/*struct Dnode{
  int data;
  struct Dnode *next;
  struct Dnode *prev;
};

void dappend(struct Dnode **q,int d)
{
    struct Dnode *r,*temp;
    temp=*q;
    r=(struct Dnode *)malloc(sizeof(struct Dnode));
    r->prev=NULL;
    r->data=d;
    r->next=NULL;
    if(*q==NULL)
    {
        *q=r;
    }
    else
    {
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    r->prev=temp;
    temp->next=r;
    }
}    

void daddatbeg(struct Dnode**q,int d)
{
    struct Dnode *r,*temp;
    temp=*q;
    r=(struct Dnode *)malloc(sizeof(struct Dnode));
    r->prev=NULL;
    r->data=d;
    r->next=temp;
    temp->prev=r;
    *q=r;
}

void daddatspec(struct Dnode **q,int d,int pos)
{
    struct Dnode *r,*temp;
    temp=*q;
    r=(struct Dnode *)malloc(sizeof(struct Dnode));
    int i=0;
    for(i=0;i<pos;i++)
    {
        temp=temp->next;
    }
    r->data=d;
    r->next=temp->next;
    r->prev=temp;
    temp->next=r;
    temp->next->prev=r;
}

void ddelatend(struct Dnode **q)
{
    struct Dnode *temp;
    temp=*q;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->prev->next=NULL;
    free(temp);
}

void ddelatbeg(struct Dnode **q)
{
    struct Dnode *temp;
    temp=*q;
    (*q)=(*q)->next;
    (*q)->prev=NULL;
    free(temp);
}

void ddelatspec(struct Dnode **q,int pos)
{
    struct Dnode *temp,*r;
    temp=*q;
    while(temp->data!=pos)
    {
        temp=temp->next;
    }
    
    r=temp->next;
    temp->next=r->next;
    r->next->prev=temp;
    free(r);
}

void ddisplay(struct Dnode *q)
{
    while(q!=NULL)
    {
        printf("Doubly Data:\t %i\n",q->data);
        q=q->next;
    }
}
*/
int main ()
{
  struct node *p=NULL;
      printf("*******************************ADD AT END********************************\n");
      
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
 /*  printf("*******************************Delete At END********************************\n");
 delatend(&p);
 display (p);
     printf("*******************************Delete At Specific Place********************************\n");
    delatspec(&p,1);
    display(p);
  printf("Elements Are:\t %i\n",count(p));

    printf("*******************************DOUBLY STARTS FROM HERE********************************\n");
    struct Dnode *o=NULL;
    dappend(&o,80);
    dappend(&o,90);
    dappend(&o,100);
        printf("*******************************DOUBLY Append********************************\n");
    ddisplay(o);
        printf("*******************************DOUBLY Add At BEGINING********************************\n");
    daddatbeg(&o,70);
    ddisplay(o);    
        printf("*******************************DOUBLY Add At Specific Pos********************************\n");
    daddatspec(&o,150,1);
    ddisplay(o);
    printf("*******************************Doubly Delete AT END********************************\n");
    ddelatend(&o);
    ddisplay(o);
    printf("*******************************Doubly Delete AT beg********************************\n");
    ddelatbeg(&o);
    ddisplay(o);
        printf("*******************************Doubly Delete AT Specific Pos********************************\n");
    ddelatspec(&o,1);
    ddisplay(o);
*/
}
