#include<stdio.h>
#include<stdlib.h>

int adj[20][20],visited[20],a[20],front=0,rear=0,top=0,n,i,flag1=0,flag2=0;

void BFS(int v) {
    int curr;
    visited[v] = 1;
    a[rear++] = v;
    while (front != rear) {
        // Check if queue is empty
        // if (front == rear) {
        //     return;
        // }
        curr = a[front++];
        for (i = 1; i <= n; i++) {
            if (adj[curr][i] == 1 && visited[i] == 0) {
                flag1 = 1;
                a[++rear] = i;
                visited[i] = 1;
                printf("\n%d->%d", curr, i);
            }
        }
    }
}

void DFS(int v){
    visited[v]=1;
    a[top++]=v;
    for(i=1;i<=n;i++){
        if(adj[v][i]==1 && visited[i]==0){
            flag2=1;
            printf("\n%d->%d",v,i);
            DFS(i);
        }
    }
}

void main(){
    int ch,start,i,j;
    printf("\nEnter the number of vertices: ");
    scanf("%d",&n);
    printf("\nEnter the adjacency matrix: ");
    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
            scanf("%d",&adj[i][j]);
        }
    }
    do{
        printf("\n1.BFS\n2.DFS\n3.Exit\nEnter your choice: ");
        scanf("%d",&ch);
        for(i=1;i<=n;i++){
            visited[i]=0;
        }
        switch(ch){
            case 1:
                printf("\nEnter the starting vertex: ");
                scanf("%d",&start);
                BFS(start);
                if(flag1==0){
                    printf("\nGraph is not connected");
                }
                break;
            case 2:
                printf("\nEnter the starting vertex: ");
                scanf("%d",&start);
                DFS(start);
                if(flag2==0){
                    printf("\nGraph is not connected");
                }
                break;
            case 3:
                exit(0);
        }
    }while(ch!=3);
}