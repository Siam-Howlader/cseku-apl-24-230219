#include<stdio.h>

int main()
{
    int num_statements,i,final_value=0;

    // taking the number of statements
    scanf("%d",&num_statements);

    for(i=1;i<=num_statements;i++)
    {
        char statements[4];
        scanf("%s",statements);

        // checking if the statement is x++, then it will increment the value by 1
        if(statements[0]=='X'&&statements[1]=='+'&&statements[2]=='+')
        {
            final_value++;
        }

        // checking if the statement is x--, then it will decrement the value by 1
        else if(statements[0]=='X'&&statements[1]=='-'&&statements[2]=='-')
        {
            final_value--;
        }

        // checking if the statement is ++x, then it will increment the value by 1 first then assign
        else if(statements[0]=='+'&&statements[1]=='+'&&statements[2]=='X')
        {
            ++final_value;
        }

        // checking if the statement is --x, then it will decrement the value by 1 first then assign
        else
        {
            --final_value;
        }
    }

    printf("%d",final_value);

    return 0;
}