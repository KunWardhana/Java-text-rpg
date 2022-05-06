import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class readfile {
	public static HashMap<String, Items> createItems() {
		try {
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader("Items.txt"));
			String line = reader.readLine();
			HashMap<String, Items> items = new HashMap<String, Items>();

			while (line != null) { // while more lines to read
				String name = line;
				name = name.toLowerCase();

				line = reader.readLine();

				String description = "";

				while (!line.equals("END")) { // while reader has not hit "END"
					description = description + line + '\n';
					line = reader.readLine();
				}

				// put new items object and items name into HashMap
				items.put(name, new Items(name, description));

				line = reader.readLine(); // move line to beginning of next
											// section of text
			}

			return items;
		} catch (IOException e) {
			System.out.println("File could not be accessed, please try again!");
		}
		return null;
	}

}
