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
void output( struct STUDENT List[MAX], int n);
int main(int argc, char** argv) {
    struct STUDENT List[MAX];
    int n;
    input(List, &n);
    printf("\n List of students: ");
    output(List, n);

    return (EXIT_SUCCESS);
}
void input( struct STUDENT List[MAX], int *n){
    printf(" Input number of students: ");
    scanf("%d", n);
    for( int i=0; i<*n; i++){
        printf("\n Input the informations of student #%d\n", (i+1));
        printf("- ID: ");
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
        printf(" - ID: %s\n",List[i].id);
        printf(" - Name: %s\n",List[i].name);
        printf(" - Mark: %.1f\n",List[i].mark);
    }
}