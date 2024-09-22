#include<stdio.h>
int main()
{
    int n,l=0,i;
    scanf("%d",&n);
    for(i=1+n;i>0;i++){
        int a,b,c,d,j,f,k,e,z=0,count;
        a=i/1000;//1
        b=i%1000;//0
        c=b/100;//9
        d=b%100;//0
        e=d/10;//8
        f=d%10;//7
        if(a!=c&&a!=e&&a!=f&&c!=e&&c!=f&&e!=f){
            l=i;
            break;
        }
    }
    printf("%d",l);
    return 0;
}