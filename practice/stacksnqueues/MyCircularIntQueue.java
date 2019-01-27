class MyCircularIntQueue {

    int [] buffer;
    int head;
    int tail;
    int capacity;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularIntQueue(int k) {
        capacity = k; 
        buffer = new int[capacity];
        head = 0;
        tail = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        else
            buffer[tail%capacity]=value;
            tail++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty())
            return false;
        else
            head++;
        return true;
    }
    
   
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (tail == head){
            head = 0;
            tail = 0;
            return true;
        }
        else 
            return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (tail - head == capacity)
            return true;
        else 
            return false;
    }
    
     /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty())
            return -1;
        return buffer[head%capacity];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty())
            return -1;
        return buffer[(tail-1)%capacity];
    }

    public static void main(String [] args) {
     /** Your MyCircularQueue object will be instantiated and called as such:*/
         MyCircularIntQueue obj = new MyCircularIntQueue(3);
         System.out.println(obj.enQueue(1));
         System.out.println(obj.enQueue(2));
         System.out.println(obj.enQueue(3));
         System.out.println(obj.enQueue(4));
         System.out.println(obj.deQueue());
         System.out.println(obj.Front());
         System.out.println(obj.Rear());
         System.out.println(obj.isEmpty());
         System.out.println(obj.isFull());
    }
}
