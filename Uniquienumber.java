public class Main
{
	public static void main(String[] args) {
	    int[] array={4, 3, 2, 4, 2};
	    int result=array[0];
		for(int i=1;i<array.length;i++){
		    result = result ^ array[i];
		}
		System.out.println("Unique Number is "+result);
	}
}
