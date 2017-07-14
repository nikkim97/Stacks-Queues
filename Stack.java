package sq;

public class Stack<T> {

    
	private CLL<T> stack;  // the circular linked list that
	//                        represents the stack
	
	// constructor - new Stack( ) returns a
	// reference to an empty Stack	
	public Stack( ){
	  CLL<T> newStack=new CLL<T>();
	  stack=newStack;
	}
	
	public void push(T data){
	   stack.addAtFront(data);
	    
	}
	public T pop( ){
	   return stack.removeFront();
	    
	}
	public boolean isEmpty( ){
	   return stack.isEmpty();
	    
	}
}