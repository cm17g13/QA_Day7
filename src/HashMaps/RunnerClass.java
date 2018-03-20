package HashMaps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RunnerClass {

	private static ArrayList<String> words;
	//private static String[] words; using an array is bad here
	private static HashMap<String, String> hmap;

	public static void main(String[] args) {
		//tells us to use array, but we don't know the size just yet, so ii going to say 100
		words = new ArrayList<String>();
		hmap = new HashMap<String, String>();
		readFromFile();
		sortArray();
	}

	private static void readFromFile() {
		// assumes that we still have access to the people from the personList
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("C:/Users/Admin/eclipse-workspace/QA_Day7/src/HashMaps/TestFile.txt"));
			String currentLine = br.readLine();
			while (currentLine != null) {
				words.add(currentLine);
				currentLine = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void sortArray() {
		for(int i = 0; i < words.size(); i++) {
						
			System.out.println("Before sorting string: " + words.get(i));
			
			char[] current = words.get(i).toLowerCase().trim().toCharArray();
			Arrays.sort(current);
			String currentString = String.valueOf(current);
			System.out.println("After sorting string: " + currentString);
		}
	}
}
