package rocks.zipcode;

import java.util.*;

public class ConcreteZStack<E>implements ZStack<E>{

    ArrayDeque<E> stack = new ArrayDeque<>();

    @Override
    public void push(E item) {
        stack.push(item);

        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public E pop() {
        return stack.pop();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public E peek() {
       return stack.peek();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();

        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        return stack.size();
    }

}
