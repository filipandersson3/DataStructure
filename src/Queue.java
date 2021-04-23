/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    // Need data structure....
    LinkedList l = new LinkedList();
    public Queue() {

    }

    public void enqueue(String text) {
        l.addLast(new Node(text,null));
    }

    public String dequeue() {
        return l.removeFirst();
    }

    public boolean isEmpty() {
        return l.isEmpty();
    }

    public int size() {
        return l.size();
    }
}
