package GSM;

import java.util.Scanner;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingDuration;
	String lastIncomingCall;
	String lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (99999999 < Long.parseLong(simMobileNumber)
				&& 1000000000 > Long.parseLong(simMobileNumber)
				&& (simMobileNumber.substring(0, 2)).equals("08")) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		} else {
			System.out.println(this.model + " has Not valid number");
		}
	}

	void call(Call receiver, int duration) {
		boolean check = true;
		if (duration < 1800) {
		} else {
			check = false;
		}
		if (receiver.receiver.simMobileNumber.equals(this.simMobileNumber)) {
			System.out.println("You cant call yourself");
			check = false;
		}
		if (!(receiver.receiver.hasSimCard == true && this.hasSimCard == true)) {
			check = false;
			System.out.println("No sim card");
		}
		if (check) {
			System.out.println("Call duration " + duration + " seconds");
			this.outgoingDuration += duration;
			this.lastOutgoingCall = receiver.receiver.simMobileNumber;
			receiver.receiver.lastIncomingCall = this.simMobileNumber;
		}
	}

	void getSumForCall() {
		double a = this.outgoingDuration * Call.priceForAMinute / 60;
		System.out.println("Bill for outgoing calls " + a + " lv");
	}

	void removeSimCard() {
		this.hasSimCard = false;
	}

	public static void main(String[] args) {
		GSM samsung = new GSM();
		GSM iphone = new GSM();
		Call toCall = new Call();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Who do you wanna call");
//			String  a=sc.next();
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Who do you wanna call");
//				String  a=sc.next();
		samsung.model = "Samsung";
		iphone.model = "Iphone";
		samsung.hasSimCard = false;
		iphone.hasSimCard = false;
		samsung.insertSimCard("0883405129");
		iphone.insertSimCard("0883123456");
		toCall.receiver = iphone;
		samsung.call(toCall, 60);
//		samsung.removeSimCard();
		samsung.call(toCall, 10);
		samsung.getSumForCall();
	}
}
