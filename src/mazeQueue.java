import java.util.ArrayList;


public class mazeQueue implements SetOfSpaces {
		
		//TESTED and passed
		/*
		 * 	test code:
		 *  mazeQueue x = new mazeQueue();
		 
			Space s = Space.initial_position;
			
			x.add(s);
			System.out.println(x.remove());
			System.out.println(x.isEmpty());
		*/
		
		private static ArrayList<Space> arr = new ArrayList<Space>();
		
		
		public Space remove(){
			Space first = arr.get(0);
			arr.remove(first);
			return first;
			
		}
		public boolean isEmpty(){
			return arr.isEmpty();
			
		}
		public void add(Space s){
			arr.add(s);
		}

	}
	
	
	

