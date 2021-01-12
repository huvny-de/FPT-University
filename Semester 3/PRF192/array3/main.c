/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 20, 2019, 8:09 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*nhap vao mang gom n so nguyen
 * n duoc nhap tu ban phim nhap chi tiet gia tri
 * xuat mang
 * dem so phan tu
 * in cac so chan ra
 * nhap so b bat ky, cho biet b xuat hien bao nhieu lan
 * int demsochan = 0;
    for ( int i = 0; i < n; i++){
        if ( mang[i] % 2 == 0){
            demsochan++;
            printf("\nso chan la %d", mang[i]);
        }
    }
    printf("\nCo %d so chan", demsochan);
 */
int main(int argc, char** argv) {
    int n;
    printf("Nhap so luong phan tu trong mang: ");
    scanf("%d", &n);
    int mang[n];
    for ( int i = 0; i < n; i++){
        printf("Phan tu[%d] = ", i);
        scanf("%d", &mang[i]);
    }
    printf("Mang:");
    for (int i = 0; i < n ; i++){
        printf("%4d", mang[i]);
    }
    int check;
    printf("\nNhap gia tri muon kiem tra: ");
    scanf("%d", &check);
    int count = 0;
    for ( int i = 0; i < n; i++){
        if ( mang[i] == check){
            count++;
        }
    }
    printf("Gia tri %d xuat hien %d lan\n", check, count);
}

