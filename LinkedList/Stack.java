package DataStructure.LinkedList;

import java.util.ArrayList;

public class Stack<T> {
    
    ArrayList<T> temp;
    int top = -1;
    int size;
     
    

    Stack( int size) {
        this.size = size;
        this.temp = new ArrayList<T>(size);
    }

    public void push(T num) {
          if(top+1 == size){
            System.out.println("Stack OverFlow");
          } 
          else {
            top = top+1;
            temp.add(num);
          }
    } 

    public boolean isEmpty() {

        return top == -1;
    }

    public int size() {
        return top+1;
    }

    public void pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }

        else {
            top--;
        }
    }
   
    public String toString()
    {
 
        String Ans = "";
 
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(temp.get(i)) + "->";
        }
 
        Ans += String.valueOf(temp.get(top));
 
        return Ans;
    }

    public T top() {
        if(top == -1 ) {
            System.out.println("Stack Underflow");
            return null;
        }
        else {
            return temp.get(top);
        }

    } 
}

class Temp {
    public static void main(String[] args) {
        Stack<String> s2 = new Stack<>(3);
 
        // Pushing elements to string stack - s2
 
        // Element 1 - hello
        s2.push("hello");
        // Element 2 - world
        s2.push("world");
        // Element 3 - java
        s2.push("java");
 
        // Print string stack after pushing above string
        // elements
        System.out.println(
            "\ns2 after pushing 3 elements :\n" + s2.size());
 
        System.out.println(
            "s2 after pushing 4th element :");
 
        // Pushing another element to above stack

    }
}
