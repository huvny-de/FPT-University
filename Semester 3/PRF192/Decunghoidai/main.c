/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 18, 2019, 9:39 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*1 số nguyên gồm 3 chữ số
 * sum các chữ số
 * 
 */
int main(int argc, char** argv) {
    int a,b,c,d,sum;
    printf("Nhap so co 3 chu so can tinh tong");
    scanf("%d", &a);
    b = a/100;
    c = a % 10;
    d = (a % 100)/10;
    sum = b + c + d;
    printf("%d",sum);
    
         
    
    
    
    

    return (EXIT_SUCCESS);
}

