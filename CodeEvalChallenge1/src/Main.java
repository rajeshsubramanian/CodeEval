import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Sample code to read in test cases:
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
        }
    }
}
*/

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Main main = new Main();
		File file = new File(args[0]);
		BufferedReader buffer;
		try {
			buffer = new BufferedReader(new FileReader(file));
			String line;

			while ((line = buffer.readLine()) != null) {

				line = line.trim();
				// Process line of input Here

				String temp[] = line.split("\\s");
				int number1 = Integer.parseInt(temp[0]);
				int number2 = Integer.parseInt(temp[1]);
				int count = Integer.parseInt(temp[2]);

				System.out.println(main.processLine(number1, number2, count));

			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String processLine(int number1, int number2, int count) {

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= count; i++) {
			sb.append(processItem(i, number1, number2)).append(" ");
		}
		return sb.toString().trim();
	}

	public static String processItem(int number, int number1, int number2) {

		if (number % number1 == 0 && number % number2 == 0) {
			return "FB";
		}
		if (number % number1 == 0) {
			return "F";
		}
		if (number % number2 == 0) {
			return "B";
		}
		return String.valueOf(number);
	}

}
