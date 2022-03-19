import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException {
	     BufferedReader object = BufferedReader(InputStreamReader(System.in));
	     String str = object.readLine();
	     System.out.println("Entered String is:" +str);


	}

	private static BufferedReader BufferedReader(Object inputStreamReader) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
