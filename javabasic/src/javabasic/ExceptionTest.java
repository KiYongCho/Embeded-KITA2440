package javabasic;

public class ExceptionTest {
	
	public static void main(String[] args) {
		int i = devide();
	} // main
	
	static int devide() {
		int result = 0;
		try {
			result = 100 / 0;
			int[] intArray = {1, 2, 3, 4, 5};
			intArray[5] = 6;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
//		catch (ArithmeticException ae) {
//			System.out.println(ae.getMessage());
//			ae.printStackTrace();
//		} catch (IndexOutOfBoundsException ioobe) {
//			System.out.println(ioobe.getMessage());
//			ioobe.printStackTrace();
//		}	
		finally {
			System.out.println("예외발생여부와 상관없이 무조건 수행!");
		}
		return result;
	}

} // class







