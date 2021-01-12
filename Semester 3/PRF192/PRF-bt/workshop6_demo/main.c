#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define max 500
void input(char code[max][5], char title[max][30], double price[max], int *n);
void output(char code[max][5], char title[max][30], double price[max], int n);
void swap(int a, int b, double price[max]);
void sort(double price[max], int n);
void findbook(char code[max][5], char title[max][30], double price[max],int n);
int main(){
    char code[max][5];
    char title[max][30];
    double price[max];
    int n;
    input(code,title, price, &n);
    output(code,title, price, n);
    sort(price, n);
    printf("your book after arrange by price : \n");
    output(code, title, price, n);
    findbook(code,title,price, n);
    return 0 ;
}
void input(char code[max][5], char title[max][30], double price[max], int *n){
    printf("the number of books : ");
    scanf("%d", n);
    for(int i =0; i<*n; i++){
        printf("input the in4 of books #%d:", i+1);
        printf("\nCODE : ");
        scanf("%s%*c",code[i]);
        printf("TITLE : ");
        scanf("%s", title[i]);
        printf("PRICE : ");
        scanf("%lf", &price[i]);
    }
}
void output(char code[max][5], char title[max][30], double price[max], int n){
    for(int i = 0; i<n; i++){
        printf("the informations of book %d :\n", i+1);
        printf("CODE : %s \n", code[i]);
        printf("TITLE : %s\n", title[i]);
        printf("PRICE : %.lf\n", price[i]);
    }
    return;
}
void swap(int a, int b, double price[max]){
    int temp = price[a];
    price[a]=price[b];
    price[b]=temp;
}
void sort(double price[max], int n){
    for(int i = 0; i<n;i++){
        for(int j = n-1; j>i; j--){
            if(price[j-1]>price[j])
                swap(j-1, j, price);
        }
    }
}
void findbook(char code[max][5], char title[max][30], double price[max],int n){
    char a[5];
    int no=0;
    printf("enter CODE of book you want to search : ");
    scanf("%s%*c", a);
    for(int i =0; i<n;i++)
        if(strcmp(a,code[i])==0){
        printf("code is found, the informations of book %d :\n", i+1);
        printf("CODE : %s \n", code[i]);
        printf("TITLE : %s\n", title[i]);
        printf("PRICE : %.lf\n", price[i]);
        no+=1;
    }
    if (no==0) printf ("no book is found.");
}