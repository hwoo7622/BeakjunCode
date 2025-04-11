#include <stdio.h>
int q(int n){
    if(n>=2) return q(n-1)+q(n-2);
    else if(n==1)
    return 1;
    else
    return 0;
}
int main(){
    int a;
    scanf("%d",&a);
    printf("%d",q(a));
}