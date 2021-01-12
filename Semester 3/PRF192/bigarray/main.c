/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 2, 2019, 7:30 AM
 */

#include <stdio.h>
#include <stdlib.h>
#define MAX 50
/*Thông tin về sinh viên: id - name (char),mark (float)
 * khi run, chương trình yêu cầu nhập số sv cần quản lý, sau đó nhập thông tin chi tiết cho từng sinh viên.
 * xuất tất cả các thông tin về sinh viên ra màn hình
 * yêu cầu: sử dụng kỹ thuật parallel array để giải quyết vấn đề trên
 * 
 */

void input( char ids[MAX][5], char names[MAX][30], float marks[MAX], int *n);
void output( char ids[MAX][5], char names[MAX][30], float marks[MAX], int n);
int main(int argc, char** argv) {
    char ids[MAX][5], names[MAX][30];
    float marks[MAX];
    int n;
    input( ids, names, marks, &n);
    printf("\n List of the students: ");
    output( ids, names, marks, n);
    

    return (EXIT_SUCCESS);
}
void input( char ids[MAX][5], char names[MAX][30], float marks[MAX], int *n){
    printf(" Input number of students: ");
    scanf(" %d", n);
    for( int i = 0; i < *n; i++){
        printf(" Input the information of student #%d\n", (i+1));
        printf(" - ID: ");
        scanf(" %s%*c", ids[i]);// %*c xóa bộ đệm thay thế cho setvbuf
        printf(" - Names: ");
        scanf("%s", names[i]);
        printf(" - Mark: ");
        scanf("%f", &marks[i]);
    }
}
void output( char ids[MAX][5], char names[MAX][30], float marks[MAX], int n){
    for( int i=0; i<n; i++){
        printf("\n The informations of the student #%d", i+1);
        printf("\n - ID: %s", ids[i]);
        printf("\n - Names: %s", names[i]);
        printf("\n - Mark: %.1f", marks[i]);
    }
}

