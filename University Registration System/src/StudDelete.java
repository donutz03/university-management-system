import java.util.Scanner;
public class StudDelete extends StudentInfo{
	
	public void StudentDelete() {
		StudentInfo s1 = new StudentInfo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nEnter the slot you want to delete: ");
		eraser = s.nextInt();
		eraserheads = eraser - 1;
		
		if (eraser > 0 && Age[eraser] != 0) {
			
			Name[eraserheads] = "Empty";
			LN[eraserheads] = "Empty";
			Gender[eraserheads] = "Empty";
			Bday[eraserheads] = "Empty";
			Hometown[eraserheads] = "Empty";
			Section[eraserheads] = "Empty";
			Teacher[eraserheads] = "Empty";
			Age[eraserheads] = 1;
			
			System.out.println("Student information has been deleted Successfully!");
			
		}
		
		else {
			System.out.println("Try again!");
		}
	}

}
