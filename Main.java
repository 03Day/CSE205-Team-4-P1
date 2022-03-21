/**
 * 
 */
import java.util.ArrayList; 
import java.io.File;
import java.io.PrintWriter; 
import java.util.Scanner;
import java.io.FileNotFoundException; 
/**
 * CLASS: Main.java
 * 
 * DESCRIPTION
 * This program does XXXXXXXXXXXXXX
 * 
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring Semester B 2022
 * Project Number: 1
 * 
 *
 * AUTHOR 1: Sabrina Maldonado, SID, semaldon@asu.edu
 * AUTHOR 2:
 * AUTHOR 3:
 *
 */
public class Main {

	static int RUNS_UP = 1;
	static int RUNS_DN = -1;
	
	public static void main(String[] args) {
		Main mainObject = new Main();
		mainObject.run();
	}
	
	
	private void run() {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		try {
			list = new ArrayList<Integer>(readInputFile("p1-in.txt"));
			System.out.println(list);
		} catch(FileNotFoundException pException) {
			System.out.println("Oops, could not open 'p1-in.txt' "
					+"for reading. The program is ending.")
			System.exit(-100); //-100 per instructions
		}
		
		ArrayList<Integer> listRunsUpCount = new ArrayList<>(findRuns(list, RUNS_UP));
		ArrayList<Integer> listRunsDnCount = new ArrayList<>(findRuns(list, RUNS_DN));
		ArrayList<Integer> listRunsCount = 
				new ArrayList<>(mergeLists(listRunsUpCount, listRunsDnCount));
		try {
			writeOutputFile("p1-runs.txt", listRunsCount); //will make public void method for writeOutputFile
			System.out.println(listRunsDnCount);
		} catch(FileNotFoundException pException) {
			System.out.println("Oops, could not open 'p1-runs.txt' for writing. The program is ending.");
			System.exit(-200); //-200 per instructions
		}
	} //end run

		
		public ArrayList<Integer> findRuns(ArrayList<Integer> pList, int pDir) {
			ArrayList <Integer> listRunsCount = arrayListCreate(pList.size(),0);
			
			//initialize variables to 0
			int i = 0;
			int k = 0;
			
			//still need to finish this 
			while () {
			
				} if{
					k++;
				} else if(){	
					k++;
				} else {
					k = 0;
				} 
			}
				
			if() {
				
			}
	}

}
