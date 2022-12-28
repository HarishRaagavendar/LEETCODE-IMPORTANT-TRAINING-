#include<stdio.h>

int main(void) {
    int n;
    scanf("%d",&n);
    int arr[n];
    int oc=0,ec=0;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        if(arr[i]%2==0){
            ec++;
        }else{
            oc++;
        }
    }
    
    
    if(oc==ec){
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=arr[i]-1;
            }else{
                arr[i]=arr[i]+1;
            }
        }
    }else if(oc>ec){
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                arr[i]=arr[i]+1;
            }
        }
    }else{
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=arr[i]-1;
            }
        }
    }
    
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    
}
