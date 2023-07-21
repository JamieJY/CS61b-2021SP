package testsort;

/* tests the sort method*/
public class Testsort {
	
	/* helper method */
	public static void testSort() {
		String[] input = {"i","have","an","egg"};
		String[] expected = {"an","egg","have","i"};
		
		Sort.sort(input);
		
		org.junit.Assert.assertEquals(expected,input);
		
//		for(int i=0;i<input.length;i++) {
//			if(!input[i].equals(expected[i])) {
//			    System.out.println("mismatch in position"+i+",expected:"+expected[i]+",but got:"+input[i]);
//			    return;
//			}
//		}
//		if(!java.util.Arrays.equals(input,expected)) {
//			System.out.println("error!something is wrong with Sort.sort");
//		}
	}
	
	
	public class Sort{
		/* sort strings destructively */
		public static void sort(String[] x) {
			
		}
	}
	public static void main(String[] args) {
		testSort();
	}
}
