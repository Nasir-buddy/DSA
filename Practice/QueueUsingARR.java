package DSA.Practice;
import DSA.Queue.Node;
import DSA.Queue.QueueEmptyException;
import DSA.Queue.QueueFullException;
import DSA.Queue.queueUse;
public class QueueUsingARR {
    private int data[];
    private int front; 
    private int rear; 

    private int size; 

    public QueueUsingARR(){
        data = new int[10];
        front = -1; 
        rear = -1; 
        size = 0;
    }
    public QueueUsingARR(int capacity){
        data = new int[capacity]; 
        front = -1; 
        rear = -1; 
        size = -1; 
    }
    int size (){
        return size;
    }
    boolean isEmpty(){
        return size == 0; 
    }
    int front() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    private void doubleCapacity(){
        int temp[] = data; 
        data = new int[2 * data.length];
        int index = 0; 
        for(int i = front; i < temp.length; i++ ){
            data[index] = temp[i]; 
            index++; 
        }
        for(int i = front ; i < front -1 ; i++){
            data[index] = temp[i]; 
            index++; 
        }
        front = 0; 
        rear = temp.length - 1; 

    }
    
    
}
