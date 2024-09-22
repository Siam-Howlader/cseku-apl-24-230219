#include<stdio.h>
int main(){
    int n,i,x=0;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        char str[4];
        scanf("%s",str);
        if(str[0]=='X'&&str[1]=='+'&&str[2]=='+'){
            x++;
        }
        else if(str[0]=='X'&&str[1]=='-'&&str[2]=='-'){
            x--;
        }
        else if(str[0]=='+'&&str[1]=='+'&&str[2]=='X'){
            ++x;
        }
        else{
            --x;
        }
    }
    printf("%d",x);
    return 0;
}