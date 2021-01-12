#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])
{
    int x,y;
    float k,l;
    double d;
    char a,b,c;
	printf(" input x: ");
	scanf("%d", &x);
	printf(" input y: ");
	scanf("%d", &y);
	printf("input k,l: ");
	scanf("%f %f",&k, &l );
	printf("input d: ");
	scanf("%lf", &d);
        setvbuf(stdin,NULL,_IONBF,0);
	printf("input a,b,c: ");
	scanf("%c %c %c", &a, &b, &c);
	printf("\n gia tri x= %d, y= %d", x, y);
	printf("\n gia tri k= %.2f, gia tri l= %.2f", k, l);
	printf("\n gia tri d=%.2lf", d);
	printf("\n ki tu a,b,c la: %c %c %c", a, b, c);
	return (EXIT_SUCCESS);

}
