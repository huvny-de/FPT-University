/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 1, 2019, 6:50 PM
 */



#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include<malloc.h>
#define MAX 100

/*hien thi menu
 * nhap mang so nguyen
 * xuat mang
 * xuat so nguyen to
 * xuat gia tri lon thu hai
 * chen phan tu
 * xoa phan tu
 * thoat
 * chuc nang tu 1-6 quay lai menu
 */
void menu(int n);
void input(int n);
void output(int *array,int n);
int Prime(int n);
int checkarray(int array[]);
void showPrimeNumbers();
void secondLargest(int array[],int n);
int *a = NULL;
int n = 0;
int main(int argc, char** argv) 
{
    int confirm;
    do
    {
        printf("\n\n----Menu----");
        printf("\n1.Input array. ");
        printf("\n2.Output array. ");
        printf("\n3.Prime numbers. ");
        printf("\n4.Second Largest of array. ");
        printf("\n5.Add elements at position.(in maintenance) ");
        printf("\n6.Delete values at.(in maintenance");
        printf("\n7.Exit.");
        printf("\nYour choice: ");
        scanf("%d",&confirm);
        
        switch (confirm)
        {  
            case 1:      
                printf("Input number of elements: ");
                scanf("%d",&n);
                input(n);
                break;
            case 2:
                output(a,n);  
                break;
            case 3:      
                output(a,n);
                showPrimeNumbers(a,n); 
                break;
            case 4:      
                output(a,n);
                secondLargest(a,n);
                break;
            case 5:  
                output(a,n);
                
                
                break;
            case 6:
                output(a,n);
                break;
            case 7:
                break;
            default:
                printf("Your choice is not valid."); 
        }
    }while(confirm!=7);        
    printf("End program.");

}

void input(int n){
    a = (int*)malloc(sizeof(int) * n);   
    if (a == NULL) {
        printf("not valid.\n");
        return;
    }
    for (int i=0;i<n;i++){   
        printf("\nElements [%d]: ",i);
        scanf("%d",&a[i]);        
    }
    
}

void output(int *array,int n){
    if (array == NULL) {
        printf("Please choose 1.");
        return;
    }
    printf("\nyour array: ");
    for(int i=0;i<n;i++){
        printf("%4d",array[i]);
    }
}

int Prime(int n)
{    
    if (n<=1) 
        return 0;
    for(int i=2;i<=sqrt(n);i++){
        if (n%i==0)
            return 0;
    }    
    return 1;
}

void showPrimeNumbers()
{
    if (!checkarray(a)) {
        printf("Please choose 1.\n");
        return;
    }

    for (int i=0;i<n;i++){        
        if (Prime(a[i])==1)

            printf("\n%d is prime number",a[i]);
           
        else printf("\n%d is not prime number.",a[i]);
    }              
}

int checkarray(int array[]) {
    if (array == NULL) {
        return 0;
    }
    return 1;
}

void secondLargest(int array[],int n)
{
    int i,j,temp;
    if (!checkarray(array)) {
        printf("Please choose 1.\n");
        return;
    }
    int max=array[0];
    int indexMax = 0;
    //Get maximum value
    for (int i = 1; i < n; i++){
        if (array[i] > max) {
            max = array[i];
            indexMax = i;
        }
    }    
    int maxSecondIndex = 0;
    maxSecondIndex = indexMax == 0 ? 1 : 0;
    
    if (maxSecondIndex >= n) {
        printf("Second Largest is not valid.");
        return;
    } 
    
    int maxSecond = array[maxSecondIndex];
    
    for (int i = maxSecondIndex; i < n; i++) {
        if (array[i] > maxSecond && array[i] < max) {
            maxSecond = array[i];
            maxSecondIndex = i;
        } 
    }
    printf("\nSecond Largest is: %d",array[maxSecondIndex]);
}





