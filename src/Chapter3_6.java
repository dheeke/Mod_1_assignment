import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chapter3_6 {

	public static void main(String[] args) {

String test1 = "Hello this is a test of flags";
double test2 = 35.25;

System.out.printf("%2$s %2$s \n%1$f", test2, test1);

File file = new File("C:\\Users\\dheek\\eclipse-workspace\\Chapter3_code\\src\\TestDocument.txt");


try {
	Scanner in = new Scanner(file);
	int test3 = in.nextInt();
	String test4 = in.next();
	while(in.hasNextLine()) {}
	in.close();
	String test5 = System.getProperty("user.dir");
	System.out.println("\nfirst value retrieved is " +test3 );
	System.out.println("second value retrieved is " +test4 );
	System.out.println("The directory we are in is" +test5 );
	}

	 
catch (FileNotFoundException e)
		{
		e.printStackTrace();

		}
	}
}
//adding a comment to test GIT