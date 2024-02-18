#include<stdio.h>
#include<stdlib.h>

struct BST{
    int data;
    struct BST *left;
    struct BST *right;
};

typedef struct BST NODE;

NODE *createnode(NODE *node,int data){
    if(node==NULL){
        NODE* temp = (NODE*)malloc(sizeof(NODE));
        temp->data = data;
        temp->left = NULL;
        temp->right = NULL;
        return temp;
    }
    if(data < node->data){
        node->left = createnode(node->left,data);
    }
    else if(data > node->data){
        node->right = createnode(node->right,data);
    }else{
        printf("Duplicate data\n");
        return node;
    }

    return node;
}

NODE *search(NODE *node,int data){
    if(node==NULL){
        printf("Data not found\n");
        return NULL;
    }
    if(data < node->data){
        return search(node->left,data);
    }
    else if(data > node->data){
        return search(node->right,data);
    }else{
        printf("Data found\n");
        return node;
    }
}

void inorder(NODE *node){
    if(node!=NULL){
        inorder(node->left);
        printf("%d ",node->data);
        inorder(node->right);
    }
}

void preorder(NODE *node){
    if(node!=NULL){
        printf("%d ",node->data);
        preorder(node->left);
        preorder(node->right);
    }
}

void postorder(NODE *node){
    if(node!=NULL){
        postorder(node->left);
        postorder(node->right);
        printf("%d ",node->data);
    }
}

void main(){
    NODE *root = NULL;
    int choice,data;
    while(1){
        printf("1. Insert\n2. Search\n3. Inorder\n4. Preorder\n5. Postorder\n6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Enter data: ");
                scanf("%d",&data);
                root = createnode(root,data);
                break;
            case 2:
                printf("Enter data: ");
                scanf("%d",&data);
                search(root,data);
                break;
            case 3:
                inorder(root);
                printf("\n");
                break;
            case 4:
                preorder(root);
                printf("\n");
                break;
            case 5:
                postorder(root);
                printf("\n");
                break;
            case 6:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }
}