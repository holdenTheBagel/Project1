import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project1 {
	
	/*TODO
	 * Implement most frequent name
	 * Implement std dev 
	 * Implement ability to read past newline characters
	1: displayListOrdered
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
	public static void displayMostFrequentName(String[] names) {
		String mostFrequent = "";
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(names[i-1])) {
				mostFrequent = names[i];
			}
		}
	}
	
	public static void displayNamesNotCapitalized(String[] names) {
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		for (String name : names) {
			if (!Character.isUpperCase(name.charAt(0))) {
				System.out.println(name);
			}
		}
	}
	
	public static void displayNamesWithOddLength(String[] names) {
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		for (String name : names) {
			if (name.replace(" ", "").length() % 2 != 0) {
				System.out.println(name);
			}
		}
	}
	
	public static void displayNamesWithEvenLength(String[] names) {
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		for (String name : names) {
			if (name.replace(" ", "").length() % 2 == 0) {
				System.out.println(name);
			}
		}
	}
	
	public static void displayNameStatistics(String[] names) {
		int namez = 0;	
		int letters = 0;
		double avgLen = 0;
		String shortest = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String longest = "";
		double lenStdDev = 0;
		
		for (String name : names) {
			namez++;
			letters += name.replace(" ", "").length();
			if (name.replace(" ", "").length() < shortest.replace(" ", "").length()) {
				shortest = name;
			}
			if (name.replace(" ", "").length() > longest.replace(" ", "").length()) {
				longest = name;
			}
			
		}
		avgLen = (double) letters / namez;
		for (String name: names) {
			lenStdDev += Math.pow(name.length()-avgLen, 2);
		}
		lenStdDev = Math.sqrt(lenStdDev / namez);
		
		System.out.println("Name Count: " + namez);
		System.out.println("Letter Count Total: " + letters);
		System.out.printf("Avg Name Length: %.2f%n", avgLen);
		System.out.println("Shortest Name: " + shortest);
		System.out.println("Longest Name: " + longest);
		System.out.println("Population Standard Deviation: " + lenStdDev);
		
		
	}
	
	public static void displaySingleNames(String[] names) {
		for (String name : names) {
			if (!name.contains(" ")) {
				System.out.println(name);
			}
            
        }
	}
	
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
       

        for (String name : names) {
            System.out.println(name);
        }
        
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
				displaySingleNames(names);
			}
			if (choice == 4) {
				displayNameStatistics(names);
			}
			if (choice == 5) {
				displayNamesWithEvenLength(names);
			}
			if (choice == 6) {
				displayNamesWithOddLength(names);			
			}
			if (choice == 7) {
				displayNamesNotCapitalized(names);			
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