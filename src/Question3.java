public class Question3 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Question3(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int removedValue = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return removedValue;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1; 
        }
        return queue[front];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No rear element.");
            return -1; 
        }
        return queue[rear];
    }

    public static void main(String[] args) {
        Question3 q = new Question3(3);
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        System.out.println("Dequeued: " + q.dequeue()); 
        q.enqueue(4);
        System.out.println(q.isEmpty());
        
        System.out.println("Front: " + q.front()); 
        System.out.println("Rear: " + q.rear()); 
    }
}