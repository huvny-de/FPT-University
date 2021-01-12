/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 18, 2019, 7:53 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int a,b;
    printf("input a,b:");
    scanf("%d%d", &a, &b);
    while( a>=b ){
       printf("input a,b(a<b):");
       scanf("%d%d", &a, &b);
    }
    for(int i = a; i <= b; i++){
        if( i% 2 == 0)
            printf("%4d", i);
    }
    return (EXIT_SUCCESS);
}

