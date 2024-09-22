#include<stdio.h>
int main () {
    int a;
    scanf("%d",&a);
    if(0<a && a<=5){
     printf("1");
    }
    else if(a%5==0){
     printf("%d",a/5);
    }
    else{
     printf("%d",((a/5) + 1));
    }
    return 0;
}