#include<stdio.h>
//Time complexity O(n^2)
//https://www.sanfoundry.com/c-program-insertion-sort/
int main()
{
    int n,i,j;
    int arr[100];
    printf("Enter number of element\n");
    scanf("%d",&n);

    printf("Enter %d integers\n",n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }

    for(i=1; i<=n-1; i++)
    {
        j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
    }

    printf("Sorted list in ascending order:\n");
    for(i=0; i<=n-1; i++)
    {
        printf("%d\n",arr[i]);
    }
}
