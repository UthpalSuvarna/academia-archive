#include<stdio.h>
#include<stdlib.h>

typedef struct node{
    char name[10];
    struct node *next;
} NODE;

NODE * createnode(){
    NODE* newnode = (NODE *)malloc(sizeof(NODE));
    printf("\nEnter the details\n");
    scanf("%s", newnode->name);
    newnode->next = NULL;
    return newnode;
}

void display(NODE *head){
    NODE *temp = head;
    int count;
    if(head == NULL){
        printf("\nList is empty\n");
        return;
    }
    while(temp != NULL){
        printf("%s ", temp->name);
        temp = temp->next;
       count++; 
    }
    printf("\nTotal nodes are %d", count);
}

NODE* insert_front(NODE *head){
    NODE *newnode = createnode();
    if(head == NULL){
        head = newnode;
    }
    else{
        newnode->next = head;
        head = newnode;
    }
    return head;
}

NODE * insert_end(NODE *head){
    NODE *newnode = createnode();
    NODE *temp = head;
    if(head == NULL){
        head = newnode;
    }
    else{
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newnode;
    }
    return head;
}

NODE* delete_front(NODE *head){
    NODE *temp = head;
    if(head == NULL){
        printf("\nList is empty\n");
    }
    else{
        head = head->next;
        free(temp);
    }
    return head;
}

NODE * delete_end(NODE *head){
    NODE *temp = head;
    if(head == NULL){
        printf("\nList is empty\n");
    }
    else if(head->next == NULL){
        free(head);
        head = NULL;
    }
    else{
        while(temp->next->next != NULL){
            temp = temp->next;
        }
        free(temp->next);
        temp->next = NULL;
    }
    return head;
}


void main(){
    NODE *head = NULL;
    int ch;
    while(1){
        printf("\n1. Insert at front\n2. Insert at end\n3. Delete from front\n4. Delete from end\n5. Display\n6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: head = insert_front(head);
                    break;
            case 2: head = insert_end(head);
                    break;
            case 3: head = delete_front(head);
                    break;
            case 4: head = delete_end(head);
                    break;
            case 5: display(head);
                    break;
            case 6: exit(0);
            default: printf("\nInvalid choice\n");
        }
    }
}