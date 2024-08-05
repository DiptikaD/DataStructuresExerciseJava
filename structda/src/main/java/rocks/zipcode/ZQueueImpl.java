package rocks.zipcode;

import java.util.ArrayDeque;

public class ZQueueImpl<E> implements ZQueue<E>{

    ArrayDeque<E> queue = new ArrayDeque<>();

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        return queue.size();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void enqueue(E element) {
        queue.add(element);
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue() {
        return queue.remove();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek() {
        return queue.peek();
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

}
