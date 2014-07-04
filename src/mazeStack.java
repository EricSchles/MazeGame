
import java.util.ArrayList;

public class mazeStack implements SetOfSpaces {
	
	//TESTED and passed
	/*
	 * 	test code:
	 *  mazeStack x = new mazeStack();
	 *
		Space s = Space.initial_position;
		
		x.add(s);
		System.out.println(x.remove());
		System.out.println(x.isEmpty());
	*/
	
	private static ArrayList<Space> arr = new ArrayList<Space>();
	
	
	public Space remove(){
		Space last = arr.get(arr.size() -1);
		arr.remove(arr.size() -1);
		return last;
		
	}
	public boolean isEmpty(){
		return arr.isEmpty();
		
	}
	public void add(Space s){
		arr.add(s);
	}

}
