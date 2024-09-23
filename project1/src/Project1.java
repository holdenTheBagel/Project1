import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project1 {
	
	/*1: displayListOrdered
	2: displayFullNames
	3: displaySingleNames
	4: displayNameStatistics
	5: displayNamesWithEvenLength
	6: displayNamesWithOddLength
	7: displayNamesNotCapitalized
	8: displayMostFrequentName
	9: newList
	0: quitProgram
	*/
	public static void displayFullNames(String[] names) {
		for (String name : names) {
			if (name.contains(" ")) {
				System.out.println(name);
			}
            
        }
	}
	
	public static void displayListOrdered(String[] names) {
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		// Print each name
		System.out.println();
        for (String name : names) {
            System.out.println(name);
        }
	}
	public static void newList() {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter names:");
        String input = in.nextLine();
        
        
        String[] names = input.split(",\\s*");
        in.nextLine();
        
        boolean exit = false;
        while (!exit) {
        	
	        System.out.println("""
	    \n1: displayListOrdered
					2: displayFullNames
					3: displaySingleNames
					4: displayNameStatistics
					5: displayNamesWithEvenLength
					6: displayNamesWithOddLength
					7: displayNamesNotCapitalized
					8: displayMostFrequentName
					9: newList
					0: quitProgram
	        		""");
	        
	        int choice = in.nextInt();
	        if (choice == 1) {
	        	displayListOrdered(names);
	        	
	        }
	        if (choice == 2) {
	        	displayFullNames(names);
	        }
			if (choice == 3) {
				//displaySingleNames(names);
			}
			if (choice == 4) {
				//displayNameStatistics(names);
			}
			if (choice == 5) {
				//displayNamesWithEvenLength(names);
			}
			if (choice == 6) {
				//displayNamesWithOddLength(names);			
			}
			if (choice == 7) {
				//displayNamesNotCapitalized(names);			
			}
			if (choice == 8) {
				//displayMostFrequentName(names);			
			}
			if (choice == 9) {
				newList();
			}
			if (choice == 0) {
				exit = true;
			}
        }

        in.close();
	}
	public static void main (String[] args) {
		newList();
		
		
	}
}