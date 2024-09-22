#include <stdio.h>

int main()
{
    int frnds_pos, num_steps = 0;

    // taking positon of elephants friends position
    scanf("%d", &frnds_pos);

    // determining and printing the number of steps needs to reach the friends house
    if (0 < frnds_pos && frnds_pos <= 5)
    {
        num_steps = 1;
        printf("%d", num_steps);
    }
    else if (frnds_pos % 5 == 0)
    {
        num_steps = frnds_pos / 5;
        printf("%d", num_steps);
    }
    else
    {
        num_steps = ((frnds_pos / 5) + 1);
        printf("%d", num_steps);
    }
    
    return 0;
}