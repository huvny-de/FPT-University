/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on January 8, 2020, 5:03 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    char numStr[20];
    int result;
    int choice;
    char c;
    do {
        choice = Menu();
        switch (choice) {
            case 1:
                printf("Enter a binary numberic string:");
                gets(numStr);
                //result = decimal(numStr, 2);
                //printf("Decimal value: %d\n", result);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                printf("Please choose 1..3! or Input 'N' to exit\n");
                break;
        }
    } while (choice != 'N');
    return 0;
}

int Menu() {
    int choice;
    printf("------------Convert numberic string to decimal number------------\n1. Conver binary number to decimal number.\n"
            "2. Convert octal number to decimal number.\n3. Convert hexadecimal number to decimal number.\n");
    scanf("%d%*c", &choice);
    return choice;
}

/*int decimal(char[], int B) {
    int L, c;

    While(L > 0) {
        c = S[L];
        value = c > '9' ? value = 10 + c - 'A' : c - '0';
        result += value * power;
        L--;
        power *= B;
    }
    return result;
}*/



