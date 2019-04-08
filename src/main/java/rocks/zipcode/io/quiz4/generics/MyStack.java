package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    Stack<SomeType> myStack;

    public MyStack() {
        myStack = new Stack<>();
    }

    public Boolean isEmpty() {

        return myStack.isEmpty();
    }

    public void push(SomeType i) {
        myStack.push(i);
    }

    public SomeType peek() {
        if(myStack.isEmpty())
        {
            return null;
        }
        else {
            return myStack.peek();
        }
    }

    public SomeType pop() {

       return myStack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return myStack.iterator();
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {

    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return null;
    }
}
