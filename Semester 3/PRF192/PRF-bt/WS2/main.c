/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 17, 2019, 4:32 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
float a,b,c,delta,x,y;
    printf("------Giai Phuong Trinh Bac 2------");
    
    //Nhap 3 bien so
    printf("\nNhap a: ");
    scanf("%f",&a);
    printf("\nNhap b: ");
    scanf("%f",&b);
    printf("\nNhap c: ");
    scanf("%f",&c);
    
    //Xet dieu kien cua a
    if (a!=0)
    {
        delta=pow(b,2)-4*a*c;
        printf("Delta la: %f\n",delta);
        if(delta<0)
        {
            printf("Delta < 0\n");
            printf("PT vo nghiem.");
            return 1;
        }
        else if(delta==0)
        {
            printf("Delta == 0\n");
            x=-b/2*a;
            printf("PT co nghiem kep x = y= %f",x);
            return 1;
        }
        else if(delta >= 0)
        {
           printf("Delta >= 0\n");
           x=(-b+sqrt(delta))/(2*a);
           y=(-b-sqrt(delta))/(2*a);
           printf("PT co 2 nghiem phan biet\n");
           printf("Nghiem x = %f\n",x);
           printf("Nghiem y = %f\n",y);
           return 1;
        }
       return 0; 
    }
    
    else if (a=0)
    {
        x=-c/b;
        printf("Chi co 1 nghiem x = %f",x);
    }
    
    else if(a+b+c==0)
    {
        x=1; y=c/a;
        printf("Vi a+b+c =0,nen nghiem cua phuong trinh la:%f va %f",x,y);
    }
      
    else if(a-b+c==0)
    {
        x=-1; y=-c/a;
        printf("Vi a+b+c =0,nen nghiem cua phuong trinh la:%f va %f",x,y);
    }
    
    else 
    return (EXIT_SUCCESS);
}

