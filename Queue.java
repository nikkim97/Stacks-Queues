package sq;

public class Queue<T> {

	private CLL<T> queue;  // the circular linked list that
	//                        reqresents the queue
	
	// constructor - new Queue( ) returns a
	// reference to an empty Queue
	public Queue( ){
	    // fill in here
		CLL<T> newQueue=new CLL<T>();
		queue=newQueue;
	}
	
	public void enqueue(T data){
	    queue.addAtRear(data);
	}
	public T dequeue( ){
	   return queue.removeFront();
	   
	}
	public boolean isEmpty( ){
	 return queue.isEmpty();
	    
	}	
	
}