package HashMaps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class RunnerClass {

	private static String[] words;
	private static HashMap<String, String> hmap;

	public static void main(String[] args) {
		//tells us to use array, but we dont know the size just yet, so mi going to say 100
		words = new String[100];
		hmap = new HashMap<String, String>();
		readFromFile();
		sortArray();
	}

	private static void readFromFile() {
		// assumes that we still have access to the people from the personList
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("TestFile.txt"));
			int index = 0;
			while (br.readLine() != null) {
				words[index] = br.readLine();
				index++;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void sortArray() {
		for(int i = 0; i < words.length; i++) {
			words[i];
		}
	}

}
