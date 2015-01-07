import java.io.FileReader;
import java.io.PrintWriter;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class MySAXApp extends DefaultHandler {
	static PrintWriter zapis;

	public static void main(String args[]) throws Exception {

		zapis = new PrintWriter("doCzyszczenia.txt");
		XMLReader xr = XMLReaderFactory.createXMLReader();
		MySAXApp handler = new MySAXApp();
		xr.setContentHandler(handler);
		xr.setErrorHandler(handler);

		zapis.print("egzamin");
		// Parse each file provided on the
		// command line.
		for (int i = 0; i < args.length; i++) {
			FileReader r = new FileReader(args[i]);
			xr.parse(new InputSource(r));
		}

		zapis.close();
	}

	public MySAXApp() {
		super();
	}
	public void startDocument() {
		System.out.println("Start document");
	}

	public void endDocument() {
		System.out.println("End document");
	}

	public void characters(char ch[], int start, int length) {
		for (int i = start; i < start + length; i++) {
			switch (ch[i]) {
			case '\\':
				break;
			case '"':
				break;
			case '\n':
				zapis.println();
				break;
			case '\r':
				break;
			case '\t':
				break;
			case ' ':
				if ((i + 1) < start + length && ch[i + 1] != ' ')
					zapis.print(" ");
				break;
			default:
				if ((ch[i] > 64 && ch[i] < 91) || (ch[i] > 96 && ch[i] < 123) || ch[i] > 127)
					zapis.print(Character.toLowerCase(ch[i]));
				break;
			}
		}
	}
}