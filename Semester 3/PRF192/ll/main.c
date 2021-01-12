/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 18, 2019, 9:55 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*nhap 1 so bat ky
 * tinh tong cac chu so
 * nhap a
 * lay a chia 10 lay phan du
 * a chia 10 lay phan nguyen
 * lay phan nguyen chia 10 , lay phan nguyen den khi thuong <0 thi lay so do
 * for (i = mod(a,10); a > 0; a = a / 10){
        if ( mod( a, 10 ) > 0 )
            i  += i  ;
    }
 */
int main(int argc, char** argv) {
    int a;
    printf("input");
    scanf("%d", &a);
    for (int i = a % 10; a >= 10; a = a / 10){
        if ( a % 10 > 0 )
            i  += i  ;
        else ( a < 10);
                i = i + a;
        printf("%d", i);
    }
    return (EXIT_SUCCESS);
}

