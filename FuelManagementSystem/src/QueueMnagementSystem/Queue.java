package QueueMnagementSystem;

public class Queue {
    Node front, rear;
    private int size;
    private int queueNumber;
    private int maxSize;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Queue(int size ) {
        front = null;
        rear = null;
        size = size;
        queueNumber = 0;
        maxSize = 10;
    }

    public void enqueue(int ticketNumber, int fuelAmount, String vehicleType)
    {
        Node temp= new Node(ticketNumber, fuelAmount, vehicleType);
        if (getSize() == 0) {
            front = rear = temp;
        }
        this.rear.next = temp;
        this.rear = temp;

        size = getSize() + 1;
        queueNumber = getQueueNumber() + 1;
    }

    void dequeue() {
        if (this.front == null)
            return;

        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    void isFull() {
        if (this.size == this.maxSize) {
            System.out.println("This Queue is full. Please join to the common waiting queue");
        } else {
            System.out.println("Remaining positions: " + (maxSize - size));
        }
    }

}
