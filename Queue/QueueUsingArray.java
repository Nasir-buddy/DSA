package DSA.Queue;

public class QueueUsingArray {
    private int data[];
    private int front; // index at front elemeent is stored
    private int rear; // index at which rear element is stored.
    private int size;

    public QueueUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enqueue(int elemeent) throws QueueFullException {
        if (size == data.length) {
            // throw new QueueFullException();
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
        size++;
        // same as if condition below ...
        rear = (rear + 1) % data.length;
        // rear++;
        // if(rear == data.length){
        // rear = 0;
        // }
        data[rear] = elemeent;
    }

    int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }
    // For dynamic capacity of the Array in the queue... 
    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i <= front - 1; i++) {
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }

}
