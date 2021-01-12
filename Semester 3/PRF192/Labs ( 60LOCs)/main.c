/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on January 8, 2020, 5:11 PM
 */

#include <stdio.h>

int main(){
    int n, i;
    char c;
    do{
         printf("\n--------Multiplication--------\n");
         printf("Please enter a number (1 - 9): ");
         scanf("%d%*c", &n); 
         if (n>0 && n<10) {
             printf ("Multiplication table for %d number: \n", n);
             for(i=1; i<=10; i++) 
             printf("%dx%d=%d\n", n, i, n*i);
         }
    }
    while (c != 27); // /* ASCII code of ESC key
    return 0;
}


