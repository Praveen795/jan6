package jan6;

class Queue{
	
//________________________[linear queue]_________________________________________________________________***
	int max=7;
	int rear;
	int front;
	
	int[] que=new int[max];

	public Queue() {
		
		
		this.rear = -1;
		this.front = -1;
		
	}
	
	public void isempty() {
		if(front==-1 && rear==-1) {
			System.out.println("queue is empty");
			
		}
	}
	public void full() {
		if(rear==max-1) {
			System.out.println("queue is full");
		}
	}
	
	public void enqueue(int x) {
		if(rear==max-1) {
			System.out.println("queue is full");
		}else if(front==-1 && rear==-1 ) {
			front=rear=0;
			que[rear]=x;
			System.out.println(x+ " pushed on queue");
			
			
			
		}else {
			que[++rear]=x;
			System.out.println(x+" pushed on queue :");
			
		}
	}
	
	public void dqueue() {
		if(front ==-1 && rear==-1) {
			System.out.println("queue is empty");
		}else if(rear==front) {
			rear=front=-1;
		}else {
			int m=que[front++];
			System.out.println(m+"  removed element from queue");
		}
	}
	
	
}

public class jan6 {
	
	public static void main(String[] args) {
		Queue obj=new Queue();
		obj.enqueue(323);
		obj.enqueue(332);
		obj.enqueue(6);
		obj.enqueue(34);
		obj.enqueue(31);
		obj.enqueue(63);
		obj.enqueue(5);
		obj.enqueue(5);
		
		System.out.println("___________________________________");
		
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.enqueue(00);
		
		
		
		
	}

}
