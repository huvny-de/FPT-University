/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 27, 2019, 9:01 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    char confirm;
    int a,b,c;do{
        confirm=='y';
        printf("\n1. Add");
        printf("\n2. Sub");
        printf("\n3. Mul");
        printf("\n4. Div");
        printf("\n5. Exit");
        setvbuf(stdin,NULL,_IONBF,0);
        printf("\nYour choice: ");
        scanf("%d",&c);
        switch(c){
            case'1':
                printf("nhap a,b: ");
                scanf("%d%d",&a,&b);
                break;
            case'2':
                printf("nhap a,b: ");
                scanf("%d%d",&a,&b);
                break;
            case'3':
                printf("nhap a,b: ");
                scanf("%d%d",&a,&b);
                break;
            case'4':
                printf("nhap a,b: ");
                scanf("%d%d",&a,&b);
                break;
            default:
                printf("do u want to exit(y or n)?\n");
                setvbuf(stdin,NULL,_IONBF,0);
                printf("your choice:\n");
                scanf("%c",&confirm);
                if (confirm=='y') 					
                    break;
        }
    }
    while(confirm!='y');
    printf("End program.");
    return (EXIT_SUCCESS);
    return (EXIT_SUCCESS);
}

