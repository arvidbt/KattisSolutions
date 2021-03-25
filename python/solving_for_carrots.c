#include <stdio.h>

int main(void)
{
    int num_contestants;
    int carrots;

    if(scanf("%d", &num_contestants) == 1)
    {
        if(scanf("%d", &carrots) == 1)
        {
            printf("%d", carrots);
        }
    }
    return 0;
}