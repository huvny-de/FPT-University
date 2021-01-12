/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 20, 2019, 9:11 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int a[][4] = {{1,2,3,4},{3,4,5,6},{5,8,9,4}};
    for ( int i = 0; i < 3; i++){
        printf("\n");
        for ( int j =0; j < 4; j++){
            printf("%4d", a[i][j]);
        }
    }

    return (EXIT_SUCCESS);
}

