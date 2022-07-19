import java.util.Scanner;
public class StudUpdate extends MainOption{
	
	public void StudentUpdate() {
		
		
		
		StudentInfo s1 = new StudentInfo();
		Scanner s = new Scanner (System.in);
		
		try {
			
			
			System.out.print("\nEnter the slot you want to update");
			edit = s.nextInt();
			System.out.print("\n");
			ok = 1;
			edits = edit - 1;
		}
		catch (Exception error) {
			System.out.println("Invalid Input!!");
			StudentUpdate();
		}
		
		try {
			
			if (Age[edits] != 0 && edit > 0) {
				
				do { {
					System.out.print("Enter New First Name: ");
					slot5 = s.next();
					System.out.print("Enter New Last Name: ");
					slot6 = s.next();
					System.out.print("Enter New Gender: ");
					slot7 = s.next();
					System.out.print("Enter New Birthday: ");
					slot8 = s.next();
					System.out.print("Enter New Hometown: ");
					slot4 = s.next();
					System.out.print("Enter New Teacher: ");
					slot3 = s.next();
					System.out.print("Enter New Section: ");
					slot2 = s.next();
					System.out.print("Enter New Age: ");
					slot1 = s.nextInt();
					
					if (slot1 < 1) {
						System.out.println("Invalid Input!!");
						StudentUpdate();
					}
				
				}
				if (slot1 >  0) {
					Name[edits] = slot5;
					LN[edits] = slot6;
					Gender[edits] = slot7;
					Bday[edits] =slot8;
					Hometown[edits] = slot4;
					Teacher[edits] = slot3;
					Section[edits] = slot2;
					Age[edits] = slot1;
					
					System.out.println("Student Information has been updated successfully!!");
					ok++;
				}
			} while(ok < 2);
			
		}
			else { 
				System.out.println("Try again!");
			}
		}
			catch(Exception oops) {
				MainOption m = new MainOption();
				System.out.println("Invalid Input");
				m.main();
			}
		}
}

