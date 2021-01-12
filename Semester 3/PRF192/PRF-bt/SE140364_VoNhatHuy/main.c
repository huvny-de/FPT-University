/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 9, 2019, 7:07 AM
 */

#include <stdio.h>1


#include <stdlib.h>
#define max 500

/*Writing a program in C language displays the following menu:
1. Question 1
2. Question 2
3. Quit program
The program requires the users to enter a selection from 1 to 3. If the users
select 1 and 2, the program will execute question 1 and question 2 respectively and
return to the menu. If the users select 3, the program will be stopped. (2 marks)
Question 1:
The program allows the users to enter 10 numbers and display the second
smallest number on the screen. (3 marks)
Question 2:
The program allows the users to enter the country number to manage and
enter detailed information for each country, including: country code, country name,
area and population of the country and then display all the countries have entered on
the screen. Sort the countries in descending order of population and output to the
screen. (5 marks)
 * 
 */
int Menu();
int arrayTenNumber(int mang[10]);
int findMin( int array[MAX]);
int findMin2( int array[MAX]);
void question1();
void inputCountry( struct Countryy country[MAX], int*n);
void outputCountry( struct Countryy country[Max], int n);
void swap( int a, int b, struct Countryy country[MAX], int n);
void sortDesending( struct Countryy country[MAX], int n);
void question2();
struct Countryy{
    int countryCode;
    char countryName[30];
    int countryArea;
    int countryPopulation;
};
int main(int argc, char** argv) {
    int select = 0;
    struct Countryy Country[max];
    do{
        select = Menu();
        int mang[10];
        int n = 0;
        switch(select){
            case 1:
                arrayTenNumber(mang);
                break;
            case 2:
    
                break;
            case 3:
                break;
            default:
                printf(" Your select is not valid!");
                break;
        }
                
        
    }while( select != 3);

    return (EXIT_SUCCESS);
}
int Menu(){
    printf("\n1. Enter 10 Numbers\n2. Enter the country number\n3. Exit the program\n");
    int option;
    scanf("%d", &option);
    return option;
}
// Question 1:
int arrayTenNumber( int mang[10]){
    for ( int i = 0; i < 10; i++){
        printf(" Input numbers #%d : ", i+1);
        scanf("%d", &mang[i]);
    }
    printf(" Your input numbers\n: ");
    for (int i = 0; i < 10; i++){
        printf("%4d", mang[i]);
    }
}
void inputCountry( struct Countryy country[MAX], int*n){
    printf(" How many country do you want to manage?: ");
    scan("%d", n);
    for( int i=0; i<n; i++){
        printf(" Input the informations of country #%d", i+1);
        printf(" Input countryCode : ");
        scanf(" %d", &Countryy[i].countryCode);
        printf(" Input countryName : ");
        scanf(" %[^\n]", Countryy[i].countryName);
        printf(" Input Country Area : ");
        scanf(" %d", &Countryy[i].countryArea);
        printf(" Input Population :");
        scanf(" %d", &Countryy[i].countryArea);
    }
void displayCountryDetail( struct Countryy Country[max], n){
    printf("\n Code\t\tName\t\tArea\t\tPupolation");
    for(int i=0; i<n;i++){
        printf("%d\t\t%s\t\t%d\t\t|%d", Countryy[i].countryCode, Countryy[i].countryName, Countryy[i].countryArea, Countryy[i].countryPopulation);
    }
}
int findmin2 ( array[MAX]){
    int min = findmin2
}


