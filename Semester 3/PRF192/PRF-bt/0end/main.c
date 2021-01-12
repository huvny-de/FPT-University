/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 18, 2019, 8:06 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*scanf khoảng trắng kết thúc chuỗi
 * gets in chuỗi có khoảng trắng
 * 
 */
int main(int argc, char** argv) {
    char a[1000];
    printf("input:");
    setvbuf(stdin,NULL,_IONBF,0);
    gets(a);// scanf("%s, a);
    printf("%s",a);
    return (EXIT_SUCCESS);
}

