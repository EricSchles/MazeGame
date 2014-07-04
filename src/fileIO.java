
import java.io.*;
import java.util.Scanner;
public class fileIO {
	
	public static File open(String file_name, char read_write){
	File file = new File(file_name);
	
	if(!file.exists()){
		System.out.println("File does not exist!!!");
		System.exit(0);
	}

	if(!file.isFile()){
		System.out.println("Is not a file!!!");
		System.exit(0);
	}
	if(!file.canWrite()){
		System.out.println("File cannot be written to !!!");
		System.exit(0);
	}
	if(!file.canRead()){
		System.out.println("File cannot be read from!!!");
		System.exit(0);
	}
	
		return file;
	}
	
	public static File read(String file_name) throw Exception{ //the return type should be a 2-d array
		File file = new File(file_name);
		
		Scanner input = new Scanner(file);
		while(input.hasNextInt()){
			int start_x = input.nextInt();
			int start_y = input.nextInt();
		}
		
		while(input.hasNext()){
			Space[][] arr = new Space[3][3];
			
		}
	}
	
	
}
