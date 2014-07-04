
public enum Space {	
	

		initial_position("*"),wall("x"),corridor(" "),visited_corridor("."),way_out("o"),discovered_exit("E");
		
		private String value;
		
		private Space(String value){
			this.value = value;
		}
		
		public String toString(){
			return this.value;
		}
		
		
	}


