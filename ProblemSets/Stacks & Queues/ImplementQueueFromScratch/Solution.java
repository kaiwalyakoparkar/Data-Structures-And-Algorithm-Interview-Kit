package ImplementQueueFromScratch;
import java.util.*;

public class Solution{
    static class Queue{
        int front, rear, size;
        int capacity;
        int array[];

        //Declaring the constructor
        public Queue(int capacity){
            this.capacity = capacity;
            front = this.size = 0;
            rear = capacity-1;
            array = new int[this.capacity];
        }

        //Checking if the queue is full
        boolean isFull(Queue queue){
            return (queue.size == queue.capacity);
        }

        //Checking if the queue is empty
        boolean isEmpty(Queue queue){
            return (queue.size == 0);
        }

        //Add item to queue this will change rear and size
        void enqueue(int item){
            if(isFull(this)){
                return;
            }
            this.rear = (this.rear+1)%this.capacity;
            this.array[this.rear] = item;
            this.size = this.size + 1;
            System.out.println(item + " enqueue to queue");
        }

        //Remove item from queue this will change front and size;
        int dequeue(){
            if(isEmpty(this)){
                return Integer.MIN_VALUE;
            }

            int item = this.array[this.front];
            this.front = (this.front+1) % this.capacity;
            this.size = this.size-1;
            return item;
        }

        //get front of Queue
        int front(){
            if(isEmpty(this)){
                return Integer.MIN_VALUE;
            }
            return this.array[front];
        }

        //get rear of queue
        int rear(){
            if(isEmpty(this)){
                return Integer.MIN_VALUE;
            }
            return this.array[rear];
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the queue and elements to enqueue");
        int n = sc.nextInt();
        int enq = sc.nextInt();

        //Creating a Queue
        Queue q = new Queue(n);

        System.out.println("Enter the element to enqueue");
        for(int i = 0; i < enq; i++){
            int ele = sc.nextInt();
            q.enqueue(ele);
        }

        System.out.println(q.dequeue()+ " dequeued from queue\n");

        System.out.println("Front item is "+ q.front());

        System.out.println("Rear item is "+ q.rear());
    }
}
