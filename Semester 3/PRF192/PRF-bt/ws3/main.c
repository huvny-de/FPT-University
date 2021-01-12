/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 24, 2019, 7:02 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 
/*
 VCT hiện menu như sau: 
 * 1.Add    2.Sub   3.Mul  4.Div 5.Exit
 */
int main(int argc, char** argv) {
    //Create Menu
    
    int menu;
    char choose;
    float a,b;
    
    do{    
    printf("\n-----Menu-----\n");
    printf("1.Addition\n");
    printf("2.Subtraction\n");
    printf("3.Multiplication\n");
    printf("4.Division\n");
    printf("5.Exit\n");
    printf("Choose one: ");
    scanf("%d",&menu);
    

        switch(menu)
        {
           
            case 1:
                printf("Input a:");
                scanf("%f",&a);
                printf("Input b:");
                scanf("%f",&b);
                printf("Your choice is Addition %f and %f\n",a,b);
                printf("Your Equals is: %f + %f = %f\n",a,b,a+b);
                break;
        
            case 2:
                printf("Input a:");
                scanf("%f",&a);
                printf("Input b:");
                scanf("%f",&b);       
                printf("Your choice is Subtraction %f and %f\n",a,b);
                printf("Your Equals is: %f - %f = %f\n",a,b,a-b);
                break;
        
        
            case 3:
                printf("Input a:");
                scanf("%f",&a);
                printf("Input b:");
                scanf("%f",&b);      
                printf("Your choice is Multiplication %f and %f\n",a,b);
                printf("Your Equals is: %f * %f = %f\n",a,b,a*b);
                break;
        
        
            case 4:
                printf("Input a:");
                scanf("%f",&a);
                printf("Input b:");
                scanf("%f",&b);
                printf("Your choice is Division %f and %f\n",a,b);
                printf("Your Equals is: %f / %f = %f\n",a,b,a/b);
                break;
        
 
            case 5:
                
                setvbuf(stdin,NULL,_IONBF,0);              
                printf("Your choice is Exit\n");
                printf("Are you sure you want EXIT? Y or N:");
                scanf("%c",&choose);     
                break;
                         
            default:       
                printf("ERROR 404\n");
                printf("Please choose again\n");
                break;                 
        } 
    }
    while( menu >= 1 && menu <= 4||choose!='y' );
    return 0;
}

