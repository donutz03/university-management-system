import java.util.Scanner;
public class StudentInfo {
	public static String [] Name = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
	public static String [] LN = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
	public static String [] Gender = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
	public static String [] Bday = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
	public static String [] Hometown = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
	public static String [] Teacher = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
	public static String [] Section = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
	public static int [] Age = {1, 1, 1, 1, 1, 1, 1, 1};
	
	public static int i;
	public static int set;
	public static int okk=1, niks, edit, edits, ok, adds, add;
	public static int slot1; 
	String slot8, slot2, slot3, slot4, slot5, slot6, slot7;
	public static int eraser, eraserheads;
	public static int StudentUpdate, StudDelete, StudentAdd, option;
	
	public void display() {
		
		StudentInfo s1 = new StudentInfo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("==============================================================================================================");
		System.out.println("                                             Welcome to University                             	");
		System.out.println("==============================================================================================================");
		MainOption m1 = new MainOption();
		m1.main();
	}
	
	
	public void StudInfo() {
		
		
		System.out.print("                                             Student Information                             	");
		System.out.println("==============================================================================================================");
		
		System.out.println("First Name \t\t Last Name \t\t Gender \t\t\t Birthday \t\t Hometown \t\t Teacher \t\t\t Section \t\t\t Age \n");
		
		for (i = 1; i<11; i++) {
			set = i-1;
		System.out.print("(" + i + ")" + Name[set] + "\t\t" + LN[set] + "\t\t\t" + Gender[set] + "\t\t\t" + Bday[set] + "\t\t\t" + Teacher[set] + "\t\t\t" + Section[set] + "\t\t\t" + Age[set] + "\t\t\t");
		}
	}
	
	
	
	
	
	
}
