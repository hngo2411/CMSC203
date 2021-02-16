import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	char ch='y';
	while(ch=='y') {
		Movie m=new Movie();
		System.out.println("Enter the name of a movie: ");
		String title=sc.nextLine();
		//set title
		m.setTitle(title);
		System.out.println("Enter the rating of the movie: ");
		String rating=sc.next();
		//set rating
		m.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie: ");
		int n=sc.nextInt();
		//set number of sold tickets
		m.setSoldTickets(n);
		System.out.println(m.toString());
		System.out.println("Do you want to enter another? (y or n)");
		ch=sc.next().charAt(0);
		sc.nextLine();
				}
	System.out.println("Goodbye!");
	sc.close();
										}
						}