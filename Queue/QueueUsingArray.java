package DataStructure.Queue;

public class QueueUsingArray {

    int []arr ;
    int front;
    int rear;
    int size;

   public QueueUsingArray() {
       arr = new int[5];
       size = 5;
       front = -1;
       rear = -1;
   }
    public QueueUsingArray(int size) {
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    public void add(int data) {
// -1 -> 0 -> 1 -> 2 -> 3 ->
       if(isFull()) {
           System.out.println("queue is full");
            return ;
       }

       rear++;
       arr[rear] = data;

    }

    public void remove() {

       if(isEmpty()) {
           System.out.println("queue is empty");
           return;
       }

       front++;
    }

    public void displayQueue() {
       for(int i = front+1 ; i <= rear;i++) {
           System.out.print(arr[i] + " ");
       }
    }

    public boolean isFull() {
       return rear == size-1;
    }

    public boolean isEmpty() {
       return front == rear;
    }

}
