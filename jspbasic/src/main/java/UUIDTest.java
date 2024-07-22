import java.util.UUID;

public class UUIDTest {
	
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			UUID one = UUID.randomUUID();
			System.out.println(one);
		}
		
	}

}
