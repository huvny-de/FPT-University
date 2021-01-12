/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 27, 2019, 9:00 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int n,i;
    do{
        printf("\nInput n = ");
        scanf("%d", &n);
        if ( n == 1)
            printf(" %d is not a prime number ",n);
    }
    while ( n <= 1);
    int a = 1;
    for( i = 2; i <= sqrt(n); i++){
        if(n % i == 0){
            a = 0;
        }        
    }
    if( a == 1)
        printf("\n %d is a prime number ", n);
    else
        printf("\n %d is not a prime number ", n);

    return (EXIT_SUCCESS);
}

