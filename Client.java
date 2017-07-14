package sq;

public class Client<T>{

    // prints the contents of stack of Integers s, in
    // top-to-bottom order. This method may change s
    // temporarily, but by the time it exits, s must be
    // set back to the contents it had when printStack was
    // called.
	public static void printStack(Stack<Integer> s){
	    // fill in here
		Stack<Integer> one=new Stack<Integer>();
		if(s.isEmpty())
		{return;}
		 while(!s.isEmpty()){
		        int temp =s.pop();
		        System.out.println(temp);
		        one.push(temp);      
		    }
		 while(!one.isEmpty()){
			 s.push(one.pop());
		 }
	}

    // this method reverses the order of the items in the
    // stack.  What was the top Integer becomes the bottom,
    // next-to-top become next-to-bottom, etc.
	public static void flipStack(Stack<Integer> s){
		if(s.isEmpty()){
			return;
		}
		Queue<Integer> newqueue = new Queue<Integer>();
        while (!s.isEmpty()) {
            int one=s.pop();
            newqueue.enqueue(one);
        }
        while (!newqueue.isEmpty()) {
           s.push(newqueue.dequeue());
            
        }
    }
	
}