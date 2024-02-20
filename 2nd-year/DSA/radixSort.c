#include<stdio.h>

int maximum(int a[],int n){
    int i,max=a[0];
    for(i=1;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    return max;
}

void radix(int a[],int n){
    int bucket[10][10],bucket_count[10],i,j,k,rem,divisor=1,large,pass,nop=0;
    large=maximum(a,n);
    while(large>0){
        nop++;
        large/=10;
    }

    for(pass=0;pass<nop;pass++){
        for(i=0;i<10;i++){
            bucket_count[i]=0;
        }
        for(i=0;i<n;i++){
            rem=(a[i]/divisor)%10;
            bucket[rem][bucket_count[rem]]=a[i];
            bucket_count[rem]++;
        }
        i=0;
        for(k=0;k<10;k++){
            for(j=0;j<bucket_count[k];j++){
                a[i]=bucket[k][j];
                i++;
            }
        }
        divisor*=10;
    }
}

void main(){
    int a[10],n,i;
    printf("\nEnter the number of elements: ");
    scanf("%d",&n);
    printf("\nEnter the elements: ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    radix(a,n);
    printf("\nSorted array: ");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}