public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
	int sum=0;
        while (x < 10) {
            //System.out.print(x + " ");
	    sum = sum+ x;
	    System.out.print(sum+"\n");
	    // '\n' can't work
            x = x + 1;
        }
    }
}
