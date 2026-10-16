package while_loop;

public class print_a_numbertriangle {
	public static void main(String[] args) {
		int i = 1;

		while (i <= 5){
		    int j = 1;

		    while (j <= i){
		        System.out.print(j + " ");
		        j++;
		    }

		    System.out.println();
		    i++;
		}
	}

}
