class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stack2.isEmpty()) stack2.pop();
        else{
            while(!stack.isEmpty()){
                stack2.push(stack.pop());
            }
            stack2.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if(!stack2.isEmpty()) return stack2.peek();
        else {
            while(!stack.isEmpty()) stack2.push(stack.pop());
            return stack2.peek();
        }
        
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty() ;
    }
}