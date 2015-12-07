import java.util.Scanner;

public class ProblemTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = 0, month = 0, day = 0;
		while (day < 1 || day > 31) {
			System.out.println("Enter a day");
			day = sc.nextInt();
		}
		System.out.println("Enter a month:");
		while (month < 1 || month > 12) {

			month = sc.nextInt();
			while ((month == 2 && (day == 31 || day == 30))
					|| ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 31))) {
				System.out.println("There are no so much days in this month");
				System.out.println("Enter a month:");
				month = sc.nextInt();
			}
		}
		while (year < 1) {
			System.out.println("Enter a year");
			year = sc.nextInt();
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11: {

			if (day < 30) {
				day++;
			} else {
				if (month < 12) {
					month++;
					day = 1;
				} else
					day = 1;
				month = 1;
				year++;

			}

			break;
		}
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {

			if (day < 31) {
				day++;
			} else {
				if (month < 12) {
					month++;
					day = 1;
				} else {
					day = 1;
					month = 1;
					year++;
				}
			}

			break;
		}
		case 2: {

			if (!(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))) {

				if (day < 29) {
					day++;
				} else {
					if (month < 12) {
						month++;
						day = 1;
					} else {
						day = 1;
						month = 1;
						year++;
					}
				}

			} else {

				while (day == 29 || day > 28 || day < 1) {
					System.out.println("There is no such a date");
					System.out.println("Enter a day:");
					day = sc.nextInt();
				}

				if (day < 28) {
					day++;
				} else {
					day = 1;
					month++;
				}
			}
		}
			break;
		}
		System.out.println("The next date is: " + day + " " + month + " "
				+ year);
	}
}
