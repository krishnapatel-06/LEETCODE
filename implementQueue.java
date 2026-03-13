class MyQueue {

    //232
        Stack<Integer> inS;
        Stack<Integer> outS;

    public MyQueue() {
        inS = new Stack<>();
        outS = new Stack<>();
    }
    
    public void push(int x) {
        inS.push(x);
    }
    
    public int pop() {
        if(outS.isEmpty()){
            while(!inS.isEmpty()){
                outS.push(inS.pop());
            }
        }
        return outS.pop();
    }
    
    public int peek() {
        if(outS.isEmpty()){
            while(!inS.empty()){
                outS.push(inS.pop());
            }
        }
        return outS.peek();
    }
    
    public boolean empty() {
        return inS.isEmpty() && outS.isEmpty();
    }
}