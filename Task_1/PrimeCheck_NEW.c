#include <stdio.h>

int main() {
    int num, i, isPrime = 1; // isPrime is a flag variable
    
    // Taking user input
    printf("Enter a positive integer: ");
    scanf("%d", &num);

    // 0 and 1 are not prime numbers
    if (num == 0 || num == 1) 
    {
        printf("%d is not a prime number.\n", num);
    }
    else 
    {
        // Check for factors from 2 to sqrt(num)
        for (i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            {
                isPrime = 0;  // num is divisible by i, so it's not prime
                break;
            }
        }

        // Print the result
        if (isPrime == 1) 
        {
            printf("%d is a prime number.\n", num);
        }
        else 
        {
            printf("%d is not a prime number.\n", num);
        }
    }

    return 0;
}