#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    char name[10];
    struct node *prev;
    struct node *next;
} NODE;

NODE *createnode()
{
    NODE *newnode = (NODE *)malloc(sizeof(NODE));
    printf("\nEnter the details\n");
    scanf("%s", newnode->name);
    newnode->prev = NULL;
    newnode->next = NULL;
    return newnode;
}

NODE *insert_front(NODE *head)
{
    NODE *newnode = createnode();
    if (head == NULL)
    {
        head = newnode;
    }
    else
    {
        newnode->next = head;
        head->prev = newnode;
        head = newnode;
    }
    return head;
}

NODE *insert_end(NODE *head)
{
    NODE *newnode = createnode();
    NODE *temp = head;
    if (head == NULL)
    {
        head = newnode;
    }
    else
    {
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newnode;
        newnode->prev = temp;
    }
    return head;
}

NODE *delete_front(NODE *head)
{
    NODE *temp = head;
    if (head == NULL)
    {
        printf("\nList is empty\n");
    }
    else
    {
        head = head->next;
        head->prev = NULL;
        free(temp);
    }
    return head;
}

NODE *delete_end(NODE *head)
{
    NODE *temp = head;
    if (head == NULL)
    {
        printf("\nList is empty\n");
    }
    else
    {
        NODE *temp1 = head;
        if (temp1->next == NULL)
        {
            head = NULL;
        }
        else
        {
            while (temp1->next != NULL)
            {
                temp1 = temp1->next;
            }
            temp=temp1->prev;
            temp->next = NULL;
        }
    }
    return head;
}

void display(NODE *head)
{
    NODE *temp = head;
    int count;
    if (head == NULL)
    {
        printf("\nList is empty\n");
        return;
    }
    while (temp != NULL)
    {
        printf("%s ", temp->name);
        temp = temp->next;
        count++;
    }
    printf("\nTotal nodes are %d", count);
}

void main()
{
    NODE *head = NULL;
    int ch;
    while (1)
    {
        printf("\n1. Insert at front\n2. Insert at end\n3. Delete from front\n4. Delete from end\n5. Display\n6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            head = insert_front(head);
            break;
        case 2:
            head = insert_end(head);
            break;
        case 3:
            head = delete_front(head);
            break;
        case 4:
            head = delete_end(head);
            break;
        case 5:
            display(head);
            break;
        case 6:
            exit(0);
        default:
            printf("\nInvalid choice\n");
        }
    }
}