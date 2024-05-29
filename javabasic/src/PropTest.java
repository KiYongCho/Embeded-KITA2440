import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropTest {
	
	public static void main(String[] args) throws Exception {
		
		Properties props = new Properties();
		
		String path = "C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\test.prop";
		props.load(new FileInputStream(new File(path)));
		
		Set set = props.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}







