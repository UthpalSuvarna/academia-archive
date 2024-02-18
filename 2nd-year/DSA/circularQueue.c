#include <stdio.h>
#include <stdlib.h>

#define MAX 10

int q[MAX], front = -1, rear = -1;

void insert()
{
    if ((rear + 1) % MAX == front)
    {
        printf("Queue is full\n");
        return;
    }
    else
    {
        printf("Enter the element to be inserted: ");
        rear = (rear + 1) % MAX;
        scanf("%d", &q[rear]);
        if (front == -1)
        {
            front = rear;
        }
        printf("Rear: %d\nFront: %d\n", rear, front);
    }
}

void delete()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue is empty\n");
        return;
    }
    else
    {
        printf("Deleted element: %d\n", q[front]);
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front = (front + 1) % MAX;
        }
        printf("Rear: %d\nFront: %d\n", rear, front);
    }
}

void display()
{
    int i = front;
    if (front == -1 && rear == -1)
    {
        printf("Queue is empty\n");
        return;
    }
    printf("Elements in the queue: ");
    do
    {
        printf("%d ", q[i]);
        i = (i + 1) % MAX;
    } while (i != (rear + 1) % MAX);
    printf("\n");
}

int main()
{
    int ch;
    do
    {
        printf("\nThe circular queue operations\n 1 for insertion \n 2 for deletion \n 3 for display\n 4 for exit\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            insert();
            break;
        case 2:
            delete();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(0);
        default:
        printf("Invalid choice\n");
        exit(0);
        }
    } while (1);
    return 0;
}
