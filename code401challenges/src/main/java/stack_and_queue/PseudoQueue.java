package stack_and_queue;

public class PseudoQueue<T> {
    //variables
    Stack<T> s1;
    Stack<T> s2;

    //constructor
    PseudoQueue(){
        this.s1 = new Stack<T>();
        this.s2 = new Stack<T>();
    }

    //methods
    public void enqueue(T data){
        s1.push(data);
    }

    public T dequeue(){
        if(s2.peek() == null){
            if(s1.peek() == null) return null;
            while(s1.peek() != null){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String args []){

        PseudoQueue<Integer> s3 = new PseudoQueue<>();

        s3.enqueue(1);
        s3.enqueue(2);
        s3.enqueue(3);
        int out = s3.dequeue();
        int out2 = s3.dequeue();

        System.out.println("expected 1.  Got: " + out);
        System.out.println("expected 2.  Got: " + out2);
    }
}

//https://www.youtube.com/watch?v=AN0axYeLue0