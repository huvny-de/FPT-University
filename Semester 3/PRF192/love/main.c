/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 6, 2019, 9:35 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100
/*
 * 
 */
int Menu();
void addBook( struct BOOK List[MAX], int *n);
void displayAllBooks( struct BOOK List[MAX], int n);
void findBook( struct BOOK List[MAX], char code_find[20], int n);
//
typedef struct BOOK{
    char code[20];
    char title[20];
    int price;
    
};
//
int main(int argc, char** argv) {
    struct BOOK List[MAX];
    int n = 0;
    int select = 0;
    do{
        struct BOOK List[MAX];
        select = Menu();
        switch(select){
            case 1:
                addBook( List, &n);
                break;
            case 2:
                displayAllBooks( List, n);
                break;
            case 3:
                printf("\n Input the book code to search: ");
                char code;
                scanf(" %s", code);
                findBook( List, code_find, n);
                break;
            case 4:
                break;
            default:
                printf(" Your select is not valid!\n");
                break;
        }
        
    }while( select != 4;
    return (EXIT_SUCCESS);
}
int Menu(){
    printf("\n1.Add a new book\n2.Display all books\n3.Search book by codn4.Exit");
    printf(" Please input your option: ");
    int option;
    scanf( "%d", &option);
    return option;
}
void addBook( struct BOOK List[], int *n){
    struct BOOK book;
    printf(" Input code: ");
    scanf(" %s%*c", List[*n].code);
    printf(" Input tittle: ");
    scanf(" %[^\n]", List[*n].title);
    printf(" Input Price: ");
    scanf(" %d", &List[*n].price);
    (*n)++;
    
}
void displayAllBooks( struct BOOK List[MAX], int n){
    printf("\nCode   |   Tittle   |   Price\n");
    for( int i = 0; i < n; i++){
        printf(" %s\t%s\t%d\n", List[i].code, List[i].title, List[i].price);
    }
    
}
void findBook( struct BOOK List[MAX], char code_find[20], int n){
    int ok = 0;
    for( int i = 0; i < n; i++){
        if( strcmp(List[i].code, code_find) == 0){
            //display book
            ok = 1;
            break;
        }
    }
    if ( ok == 0)
        printf(" not found!");
}