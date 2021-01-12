/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 4, 2019, 9:49 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*VCT thực hiện các yêu cầu sau:
 * Nhập mỗi chuỗi bất kỳ ( chiều dài tối đa 100 ký tự )
 * Xuất chuỗi vừa nhập ra màn hình
 * Đếm có tất cả bao nhiêu ký tự trong chuỗi
 * đếm có bao nhiêu ký tự là khoảng trắng
 * đếm có bao nhiêu ký tự là số
 * đếm có bao nhiêu ký tự không phải là số ( các ký tự alplhabet )
 * đếm có bao nhiêu ký tự đặc biệt trong chuỗi ( các ký tự đặc biệt: !@#!@#!@$)
 * đếm có bao nhiêu ký tự ( word ) trong chuỗi
 * chuyển tất ca sang chữ hoa ( ko dùng hàm có sẵn, tự viết hàm )
 * chuyển tất cả sang chữ thường
 * chuyển các ký tự thường sang hoa và hoa sang thường
 * chuyển hoa mỗi ký tự đầu trong  mỗi word ( còn gọi là capitalize, ví dụ : Hoa Anh Dao )
 * Xóa tất cả các khoảng trắng dư thừa trong chuỗi ( dùng hàm trim tự viết )
 * Đảo ngược chuỗi, ví dụ : Mot Hai Ba => Ba Hai Mot
 * 
 * 
 */
int main(int argc, char** argv) {
    char str[100];
    int count = 0;
    int countSpace = 0;
    int countNumber = 0;
    char number[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    printf(" Input your string: ");
    gets(str);
    printf(" Your string: ");
    puts(str);
    
    while( str[count] != '\0'){
        count++;
    }
    printf(" Your string has %d characters. ", count);
    
    for( int i = 0; i < strlen(str); i++){
        if( str[i] == ' ')
            countSpace++;
    }
    printf("\n Your string has %d space.", countSpace);
    for ( int i = 0; i < strlen(str); i++){
        if( str[i] == '0' || str[i] == '1' || str[i] == '2' || str[i] == '3' || str[i] == '4' || str[i] == '5' || str[i] == '6' || str[i] == '7' || str[i] == '8' || str[i] == '9' )
            countNumber++;
    }
    printf("\n Your string has %d numbers.", countNumber);
    
    return (EXIT_SUCCESS);
}

