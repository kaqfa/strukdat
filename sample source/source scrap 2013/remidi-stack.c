#include<stdio.h>
void push();
void pop();
void display();
main()
 {
 int n;
 printf("\tMENU\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n");
 do
  {
  printf("\nEnter your choice\n");
  scanf("%d",&n);
  switch(n)
   {
   case 1:
   push();
   break;
   case 2:
   pop();
   break;
   case 3:
   display();
   break;
   case 4:
   break;
   default:
   printf("Invalid choice\n");
   break;
   }
  }
 while(n!=4);
 }

typedef struct node
 {
 int data;
 struct node *link;
 }n;
n *top=NULL;

void push()
 {
 int item;
 n *temp;
 printf("Enter the item\n");
 scanf("%d",&item);
 temp=(n*)malloc(sizeof(n));
 temp->data=item;
 temp->link=top;
 top=temp;
 }

void pop()
 {
 n *temp;
 if(top==NULL)
 printf("Stack is empty\n");
 else
  {
  temp=top;
  printf("The element deleted = %d\n",temp->data);
  free(temp);
  top=top->link;
  }
 }

void display()
 {
 n *save;
 if(top==NULL)
 printf("Stack is empty\n");
 else
  {
  save=top;
  printf("The elements of the stack are :");
  while(save!=NULL)
   {
   printf("%d\t",save->data);
   save=save->link;
   }
  printf("\nTopmost element = %d\n",top->data);
  }
 }
