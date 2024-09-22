#include<stdio.h>

int main()
{
    int input_year,next_distinct_year=0,year;
    scanf("%d",&input_year);

    for(year=1+input_year;year>0;year++)
    {
        // determining the digits of the year
        int first_digit,b,second_digit,d,fourth_digit,third_digit;
        
        first_digit=year/1000;
        b=year%1000;
        second_digit=b/100;
        d=b%100;
        third_digit=d/10;
        fourth_digit=d%10;

        // checking if the year is distinct or not
        if(first_digit!=second_digit&&first_digit!=third_digit&&first_digit!=fourth_digit&&second_digit!=third_digit&&second_digit!=fourth_digit&&third_digit!=fourth_digit)
        {
            next_distinct_year=year;
            break;
        }
    }

    printf("%d",next_distinct_year);
    
    return 0;
}