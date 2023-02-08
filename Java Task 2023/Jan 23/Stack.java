class Stack{
    //store the element in arr
    int arr[];
    // total size of array
    int size;
    // tell the top of stack
    int top;

public Stack(int size){
        arr = new int[size];
        this.size = size;
        top = -1; 
}

public void push(int number){

    if(isFull()){
        System.out.println("Stack is Full");
        return;
    }
    else{
        arr[++top]=number;
    }

}

public int pop(){
    if(isEmpty())
        System.out.println("Stack is Empty");    
    

     return arr[top--];
}


public Boolean isFull(){
   return top == (size-1);    
}

public Boolean isEmpty(){
        return (top == -1);
}

    // print stack values

    public void displayStack(){
        for(int s : arr){
            System.out.print(s);
        }
    }

    public static void main(String arg[]){
        Stack s1  = new Stack(3);
        s1.push(2);
        s1.push(1);
        s1.push(3);
        s1.push(9);
        s1.push(0);

        s1.displayStack();

    }
}