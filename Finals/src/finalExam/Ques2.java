package finalExam;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String userTitle, userArtistName;
		int yearCreated, userBirthYear, userDeathYear;

		userArtistName = in.nextLine();
		userBirthYear = in.nextInt();
		in.nextLine();
		userDeathYear = in.nextInt();
		in.nextLine();
		userTitle = in.nextLine();
		yearCreated = in.nextInt();

		Artist userArtist = new Artist(userArtistName, userBirthYear, userDeathYear);

		Artwork newArtwork = new Artwork(userTitle, yearCreated, userArtist);

		newArtwork.printInfo();
	}

}


