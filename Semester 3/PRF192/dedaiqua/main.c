/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 18, 2019, 9:12 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*viết chương trình nhập 2 số nguyên a,b. Sum a+b=?. Printf kết quả.
 * y tiep tuc
 * quay lại làm tiếp
 * nhớ xóa bộ đệm setvbuf(stdin,NULL,_IONBF,0);// dev fflush
 * 
 * 
 */
int main(int argc, char** argv) {
    int a,b,sum;
    char confirm;
    do {
        printf("Input a,b: ");
        scanf("%d%d", &a, &b);
        sum = a + b;
        printf("%d",sum);
        setvbuf(stdin,NULL,_IONBF,0);
        printf("do you want to continue Y/N?");
        scanf("%c",&confirm);
    }
    while( confirm == 'y');
    return (EXIT_SUCCESS);
}

