package basicStudy;

public class variableCopy {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[oldIntArray.length+1];
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		System.out.println(oldIntArray.length);
		System.out.println(newIntArray.length);

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i]+",");
		}
		
		System.out.println();
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[oldStrArray.length+1];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i]+",");
		}
	}
}
