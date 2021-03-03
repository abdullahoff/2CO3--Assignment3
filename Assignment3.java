import java.util.HashSet;
import java.util.Hashtable;

public class Assignment3
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	public boolean Conflict(Hashtable<String, HashSet<Integer>> instructor_Hashtable, String instructor_name, int requestedTime){
		if(requestedTime != 10 && requestedTime != 11 && requestedTime != 13 && requestedTime != 14 && requestedTime != 15){
				throw new IllegalArgumentException("Please pick a time that is a class time");
			}
		return instructor_Hashtable.get(instructor_name).contains(requestedTime);
	}

	


	
	public Iterable<Key> keys() {
        return keys(min(), max());
    }

    public Iterable<Key> keys(Key lo, Key hi) {
        Queue<Key> queue = new Queue<Key>();
        keys(root, queue, lo, hi);
        return queue;
    } 

    private void keys(Node x, Queue<Key> queue, Key lo, Key hi) { 
        if (x == null) return; 
        int cmplo = lo.compareTo(x.key); 
        int cmphi = hi.compareTo(x.key); 
        if (cmplo < 0) keys(x.left, queue, lo, hi); 
        if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key); 
        if (cmphi > 0) keys(x.right, queue, lo, hi); 
    } 

    
}
