/*
Given 2 matrices, find the product.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N1, M1 - size of the 1st matrix. Its followed by N1 lines each containing M1 intergers - elements of the 1st matrix. The next line contains N2, M2 - size of the 2nd matrix. Its followed by N2 lines each containing M2 intergers - elements of the 2nd matrix. Note that M1 = N2.

Constraints

1 <= T <= 100
1 <= N1,M1,N2,M2 <= 50
-100 <= mat[i][j] <= 100

Output Format

For each test case, print the resultant product matrix, separated by newline.

Sample Input 0

2
2 2
1 2 
3 -1 
2 3
1 -2 3 
2 3 -1 
2 3
27 29 53 
-28 49 -24 
3 4
23 52 -38 72 
-64 15 -59 -10 
-75 43 10 25 
Sample Output 0

5 4 1 
1 -9 10 
-5210 4118 -2207 2979 
-1980 -1753 -2067 -3106 
Explanation 0

Self Explanatory
*/
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
        int i,j,n,n1,m1,n2,m2,k,a[100][100],b[100][100],c[100][100];
        scanf("%d",&n);
        for(int t=0;t<n;t++)
        {
                scanf("%d",&m1);
                scanf("%d",&n1);
                for(i=0;i<m1;i++)
                {
                        for(j=0;j<n1;j++)
                        {
                                scanf("%d",&a[i][j]);
                        }
                }
                scanf("%d",&m2);
                scanf("%d",&n2);
                for(i=0;i<m2;i++)
                {
                        for(j=0;j<n2;j++)
                        {
                                scanf("%d",&b[i][j]);
                        }
                }
                
                
                
                for(i=0;i<m1;i++)
                {
                        for(j=0;j<n2;j++)
                        {
                                c[i][j]=0;
                                for(k=0;k<n1;k++)
                                {
                                        c[i][j]+=a[i][k]*b[k][j];
                                        
                                }
                        }
                }
                for(i=0;i<m1;i++)
                {
                        for(j=0;j<n2;j++)
                        {
                                printf("%d ",c[i][j]);
                        }
                        printf("\n");
                }
                
        }
        
        
        
        
    return 0;
}
