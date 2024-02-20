#include <stdio.h>
#include <stdlib.h>

#define MAX 10

typedef struct employee
{
    int id;
    char name[15];
} EMP;

EMP emp[MAX];
int a[MAX];

void linearProbing(int key)
{
    int flag = 0, i = key;
    if (a[i] == -1)
        flag = 1;
    else
    {
        printf("\nCollision Detected");
        i=key+1;
        do{
            if(a[i]==-1){
                flag=1;
                break;
            }
            else{
                i=(i+1)%MAX;
            }
        }while(i!=key&&flag==0);
    }
    if(flag==0){
        printf("\nHash table is full");
    }
    else{
        printf("\nEnter the employee id: ");
        scanf("%d",&emp[i].id);
        printf("\nEnter the employee name: ");
        scanf("%s",emp[i].name);
        a[i]=1;
        printf("\n Collision avoided sucessfully by LINEAR PROBING\n");
    }
}


void display(){
    int i, ch;
    printf("\n 1. Display all records\n 2. Display specific record\n Enter your choice: ");
    scanf("%d", &ch);
    printf("\nHT-key\tEmp-ID\tEmp-Name");
    for(i=0;i<MAX;i++){
        if(a[i]==1){
            printf("\n%d\t%d\t%s",i,emp[i].id,emp[i].name);
        }
    }
}

int main(){
    int num,key,i;
    int ch=1;
    printf("\n Collision handling by linear probing");
    for(i=0;i<MAX;i++){
        a[i]=-1;
    }
    do{
        printf("\n Enter the employee key: ");
        scanf("%d",&key);
        linearProbing(key%MAX);
        printf("\n Do you want to continue? (1/0): ");
        scanf("%d",&ch);
    }while(ch);
    display();
}