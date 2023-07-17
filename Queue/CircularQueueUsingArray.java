package DataStructure.Queue;

public class CircularQueueUsingArray {

    int front = -1;
    int rear = -1;
    int size = 5;
    int []arr = new int[size];

    public void add(int data) {

        if(isFull()) {
            System.out.println("queue is full");
            return;
        }

            if(front == -1) {
                front = 0;
            }
        rear = (rear + 1) % size;

        arr[rear] = data;

    }

    public int remove() {

        int temp = -1;

        if(isEmpty()) {
            System.out.println("queue is already empty");
            return temp;
        }

        temp = arr[front];

        if(front == rear ) {
            front = rear = -1;
        }else {
          front  = (front + 1)%size;
        }
        return temp;
    }

    public void display() {

        if(isEmpty()) {
            System.out.println("queue is empty");
            return;
        }

        if(front <= rear){

       for(int i = front; i<= rear;i++) {
           System.out.print(arr[i] + " ");
       }
        }else {
            for(int i = front; i<size;i++) {
                System.out.print(arr[i] + " ");
            }
            for(int j=0;j<=rear;j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }

    public boolean isFull() {
        return  (rear + 1) % size == front ;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

}
