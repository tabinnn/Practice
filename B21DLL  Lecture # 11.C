#include<stdio.h>
#include<Stdlib.h>

struct dNode
{
	struct dNode *prev;
	int data;
	struct dNode *next;
};
void backDisplay(struct dNode *q)
{
	while(q->next!=NULL)
	{
		q = q->next;
	}
	printf("Start Node:%u\n",q);
	while(q!=NULL)
	{
		printf("previous:%u\tData:%i\tNext:%u\n",q->prev, q->data, q->next);
		q = q->prev;

	}


}

void display(struct dNode *q)
{
	printf("Start Node:%u\n",q);
	while(q!=NULL)
	{
		printf("previous:%u\tData:%i\tNext:%u\n",q->prev, q->data, q->next);
		q = q->next;

	}


}
void addAtBeg(struct dNode **q, int d)
{
	struct dNode *r, *t;
	t = *q;
	r=(struct dNode*)malloc(sizeof(struct dNode));

	r -> data = d;
	r -> next = *q;
	r->prev = NULL;
	t->prev = r;
	*q = r;
}

void append(struct dNode **q, int d)
{
	struct dNode *r, *t;
	t = *q;
	r=(struct dNode*)malloc(sizeof(struct dNode));

	r -> data = d;
	r -> next = NULL;
	if(*q==NULL)
	{
		r->prev = NULL;
		*q = r;
	}
	else
	{
		while(t->next!=NULL)
		{
			t= t->next;
		}
		r->prev = t;
		t->next = r;

	}

}
void main()
{
	struct dNode *p=NULL;
	append(&p,10);
	append(&p,20);
	append(&p,30);
	clrscr();
	display(p);
	addAtBeg(&p,400);
	display(p);
	printf("\n****************Back Display***********\n");
	backDisplay(p);

	getch();

}
