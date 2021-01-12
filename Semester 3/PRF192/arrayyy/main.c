/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 20, 2019, 7:56 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int n;
    printf("Nhap so luong phan tu trong mang");
    scanf("%d", &n);
    int mang[n];
    for ( int i = 0; i < n; i++){
        printf("mang[%d] =", i);
        scanf("%d", &mang[i]);
    }
    printf("Mang:");
    for (int i = 0; i < n ; i++){
        printf("%4d", mang[i]);
    }
}

