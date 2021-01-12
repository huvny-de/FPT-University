/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 18, 2019, 7:35 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*vct nhap 2 so a,b ( a<b)
 * in ra nhung so chia het cho 2 trong doan ab
 *    int a,b;
    printf("Nhap a:");
    scanf("%d", &a);
    printf("nhap b:");
    scanf("%d", &b);
    for (int i = a; i <= b; i++){
        if (i % 2 == 0)
            printf("%4d", i);
 * 
 */
int main(int argc, char** argv) {
    int a,b;
    printf("Nhap a:");1
    scanf("%d", &a);
    printf("nhap b:");
    scanf("%d", &b);
    int i = a;
    while(i <= b){
        if (i % 2 == 0)
            printf("%4d", i);
    }
    i++;
    return (EXIT_SUCCESS);
}

