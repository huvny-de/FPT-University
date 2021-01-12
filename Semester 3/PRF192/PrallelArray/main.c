/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 2, 2019, 8:10 AM
 */

#include <stdio.h>
#include <stdlib.h>
#define MAX 50
/*
 * in ra màn hình các học sinh có mark lớn nhất
 */
typedef struct STUDENT{
    char id[5];
    char name[30];
    float mark;
};
void input( struct STUDENT List[MAX], int *n);
float maxMark( struct STUDENT List[MAX], int n);
void printMaxStudent( struct STUDENT List[MAX], int n);
void output( struct STUDENT List[MAX], int n);
int main(int argc, char** argv) {
    struct STUDENT List[MAX];
    int n;
    input( List, &n);
    printf("\n List of students: ");
    output( List, n);
    maxMark( List, n);
    printf(" The student has highest mark :\n ");
    printMaxStudent( List,n);

    return (EXIT_SUCCESS);
}
void input( struct STUDENT List[MAX], int *n){
    printf(" Input number of students: ");
    scanf("%d", n);
    for( int i=0; i<*n; i++){
        printf("\n Input the informations of student #%d\n", (i+1));
        printf(" - ID: ");
        scanf("%s%*c", List[i].id);
        printf(" - Name: ");
        scanf("%s%*c", List[i].name);
        printf(" - Mark: ");
        scanf("%f", &List[i].mark);
    }
}
void output( struct STUDENT List[MAX], int n){
    for( int i=0; i<n; i++){
        printf("\n The informations of student #%d:\n", i+1);
        printf(" - ID: %s\n", List[i].id);
        printf(" - Name: %s\n", List[i].name);
        printf(" - Mark: %.1f\n", List[i].mark);
    }
}
float maxMark( struct STUDENT List[MAX], int n){
    float max = List[0].mark;
    for( int i=1; i<n; i++){
        if( max < List[i].mark)
            max = List[i].mark;
    }
    return max;
}
void printMaxStudent( struct STUDENT List[MAX], int n){
    for( int i=0; i<n; i++){
        if( List[i].mark == maxMark(List, n)){
            printf(" - ID: %s\n", List[i].id);
            printf(" - Name: %s\n", List[i].name);
            printf(" - Mark: %.1f\n", List[i].mark);
        }
    }
}