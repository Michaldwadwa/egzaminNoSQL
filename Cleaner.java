import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Cleaner {

	public static void main(String[] args) {

		FileReader fr = null;
		PrintWriter zapis = null;
		String linia = "";

		// OTWIERANIE PLIKU:
		try {
			fr = new FileReader("doCzyszczenia.txt");
			zapis = new PrintWriter("wikipoParsowaniu.txt");
		} catch (FileNotFoundException e) {
			System.exit(1);
		}

		BufferedReader bfr = new BufferedReader(fr);

		try {
			while ((linia = bfr.readLine()) != null ) {
				if (linia.length() != 0){
					zapis.println(linia);
				}
			}
		} catch (IOException e) {
			System.exit(2);
		}
		try {
			fr.close();
			zapis.close();
		} catch (IOException e) {
			System.exit(3);
		}
	}

}