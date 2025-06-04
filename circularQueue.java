public class CircularQueue{
    private int[]queue;
    private int front,rear,size;
    public CircularQueue(int size){
        this. size=size;
        queue = new int[size];
        front =-1;
        rear =-1;
    }
    public boolean isFull(){
        return(rear+1)%size==front;
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(isEmpty()){
            front=rear=0;
        }else{
            rear=(rear+1)%size;
        }
        queue[rear]= data;
        }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return-1;
        }
        int value = queue[front];
        if(front==rear){//only one StackTraceElement
        front=rear= -1;
        }else{
            front =(front+1)%size;
        }
        return value;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue:");
        int i =front;
        while(true){
            System.out.println(queue[i]+"");
            if(i==rear) break;
            i=(i+1)%size;
        }
        System.out.println();
        }
        public static void main(String[] args){
            CircularQueue cq=new CircularQueue(5);
            cq.enqueue(10);
            cq.enqueue(20);
            cq.enqueue(30);
            cq.enqueue(40);
            cq.display();
            cq.dequeue();
            cq.dequeue();
            cq.display();
            cq.enqueue(50);
            cq.enqueue(60);
            cq.enqueue(70);//should print"Queue is Full"
            cq.display();
        }
}
            
    