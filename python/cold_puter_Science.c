#include <stdio.h>

int main(void)
{
    int days;
    int count_days = 0;
    int temp;

    if(scanf("%d", &days) == 1)
    {
        int arr[days];
        for(int i = 0; i < days; i++)
        {
            if(scanf("%d", &temp) == 1){
            arr[i] = temp;
            }
        }
        for(int i = 0; i < days; i++)
        {
            if(arr[i] < 0)
            {
                count_days++;
            }
        }
        printf("%d\n", count_days);
    }
    return 0;
}