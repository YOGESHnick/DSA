class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        //remove and add to stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        //remove last element inserted(inserted first in stack1)
        int removed = stack2.pop();
        //adding back to stack 1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return removed;
    }
    
    public int peek() {
        //remove from 1 and add to 2, stack[top] is the first in queue
        
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        int peek=stack2.peek();
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
        
        return peek;
    }
    
    public boolean empty() {
        return stack1.isEmpty();  
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
