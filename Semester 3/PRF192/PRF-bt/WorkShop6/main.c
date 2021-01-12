

#include <stdio.h>
#include <stdlib.h>
#include<string.h>
#define max 100

struct book
{
    char code[50];
    char title[50];
    int price;
    char authors[50];
};

void add(struct book a[max],int n);
void output(struct book a[max],int n);
int Price(struct book a[max],int n);
void findCode(struct book a[max],int n);
void display(struct book B);

void display(struct book B)
{
    printf("\nCode of books: %s",B.code);
    printf("\nTitle: %s ",B.title);
    printf("\nPrice: %d VND",B.price);
    printf("\nAuthors: %s",B.authors);
}

void add(struct book a[max],int n)
{
    printf("\nAdd a new book:");    
    printf("\nCode of books: ");
    setvbuf(stdin,NULL,_IONBF,0);
    scanf("%[^\n]%*c",a[n].code);
    printf("\nTitle:  ");
    setvbuf(stdin,NULL,_IONBF,0);
    scanf("%[^\n]%*c",a[n].title);
    printf("\nPrice: ");
    scanf("%d%*c",&a[n].price);
    printf("\nAuthors: ");
    setvbuf(stdin,NULL,_IONBF,0);
    scanf("%[^\n]%*c",a[n].authors);
  
}

void output(struct book a[max],int n)
{
           
    printf("---All information of books--- ");
    for (int i=0;i<n;i++)
    {
        printf("\nbook #%d",i+1);
        display(a[i]);
    }
}

void findCode(struct book a[max],int n)
{
    
    int i;
    char Code[50];
    printf("\n---Input code you need to find--- ");
    printf("\nCode: ");
    scanf("%s",Code);
    
    for (i=0;i<n;i++)
    {
        if ((strcmp(a[i].code,Code))==0)
        {
            display(a[i]);
        }       
    }                 
}


int main(int argc, char** argv) {
    struct book a[max];
    int confirm;
    int n=0; 
    do
    {
        printf("\n---Menu---");
        printf("\n1.Add new book");
        printf("\n2.Display all book");
        printf("\n3.Find book");
        printf("\n4.Exit");
        printf("\nYour choice: ");
        scanf("%d",&confirm);
        
        switch (confirm)
        {
            case 1:
                add(a,n);
                n++;
                break;
            case 2: 
                output(a,n);
                break;
            case 3:
                findCode(a,n);
                break;
            case 4:
                break;
            default:
                printf("Choose again");
        }
                           
    }while(confirm!=4);
    printf("\nEnd Program");
    return (EXIT_SUCCESS);
}
