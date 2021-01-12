/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 20, 2019, 9:45 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int n,m;
    printf("Nhap so dong va so cot: ");
    scanf("%d%d", &n, &m);
    int array[n][m];
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            printf("Nhap gia tri tai array[%d][%d]: ", i, j);
            scanf("%d", &array[i][j]);
        }
    }
    printf("Mang da nhap\n");
    for ( int i = 0; i < n; i++){
        for ( int j = 0; j < m; j++){
            printf("%4d", array[i][j]);
        }
        printf("\n");
    }
}

