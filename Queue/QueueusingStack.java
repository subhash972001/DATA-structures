package Queue;

public class QueueusingStack {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        
        Queue(int size){
            this.size = size;
arr = new int[size];
 
        }
        public static boolean isEmpty(){
            return rear == -1 ;  // returns true if the queue is empty or else returns flse
        }
        // public static boolean isFull(){
        //     return (rear+1)% size == front;  //to check the queue is full || to find the front in CQ

        // }

        //add==enque
public static void add(int data){
    if(rear == size-1){
        System.out.println("full queue");
        return;
    }
     rear++; //to add indexes
     arr[rear] = data;
}
//dequeue
public static int remove(){
    if(isEmpty()){   // if the queue is empty
        System.out.println("empty queue");
        return -1;
    }
    int front = arr[0];
    for(int i = 0;i<rear; i++){
        arr[i] = arr[i+1];
    }
    rear--;
    return front;
} 
//peek
public static int peek(){
    if(isEmpty()){   // if the queue is empty
        System.out.println("empty queue");
        return -1;
    }
    return arr[0];
}

    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}
    }
}
