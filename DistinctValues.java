public class DistinctValues {
	public static void main(String[] args) {
		int sum = 1;
	    int a = Integer.parseInt(args[0]);
    	int b = Integer.parseInt(args[1]);
	    int c = Integer.parseInt(args[2]);
	    
		if(a != b && a != c)
			sum++;
		if(b != c)
			sum++;

		System.out.println("La cantidad de números distintos es: " + sum);
	}
}