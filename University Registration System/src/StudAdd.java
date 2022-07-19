import java.util.Scanner;

public class StudAdd extends StudUpdate{
public void StudentAdd() {
		
		
		
		StudentInfo s1 = new StudentInfo();
		Scanner s = new Scanner (System.in);
		
		try {
			
			
			System.out.print("\nEnter the slot you want to update");
			add = s.nextInt();
			System.out.print("\n");
			ok = 1;
			adds = add - 1;
		}
		catch (Exception error) {
			System.out.println("Invalid Input!!");
			StudentUpdate();
		}
		
		try {
			
			if (Age[adds] != 0 && add > 0) {
				
				do { {
					System.out.print("Enter New Name: ");
					slot4 = s.next();
					System.out.print("Enter New Last Name: ");
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
					Name[adds] = slot5;
					LN[adds] = slot6;
					Gender[adds] = slot7;
					Bday[adds] =slot8;
					Hometown[adds] = slot4;
					Teacher[adds] = slot3;
					Section[adds] = slot2;
					Age[adds] = slot1;
					
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

