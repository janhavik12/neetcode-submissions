

class MinStack {


    Stack<Integer> mins;
    Stack<Integer> values;


    public MinStack(){
        values=new Stack<>();
        mins=new Stack<>();
    }

    
    public void push(int val) {

        values.push(val);

        mins.push(mins.isEmpty()? val:Math.min(val, mins.peek()));


        
    }
    
    public void pop() {

        values.pop();
        mins.pop();
       
     
        
    }
    
    public int top() {
        return values.peek();
        
    }
    
    public int getMin() {

        return mins.peek();
        
    }
}
