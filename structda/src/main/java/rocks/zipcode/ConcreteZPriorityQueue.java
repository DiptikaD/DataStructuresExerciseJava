package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E>{

    Deque<E> queue = new ArrayDeque<>();

    @Override
    public void enqueue(E element, Integer priority) {
        queue.offer(element);

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue(Integer priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek(Integer priority) {
        return queue.peek();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public int size() {
        return queue.size();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public int size(Integer priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
