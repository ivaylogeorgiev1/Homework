package GSM;

import java.util.Scanner;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingDuration;
	int incomingDuration;
	int lastOutgoingDuration;
	int lastIncomingDuration;
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
		if (receiver.receiver == null) {
			System.out.println("Enter receiver and run again");
			return;
		}
		if (receiver.receiver.simMobileNumber == null) {
			System.out.println("enter sim card in " + receiver.receiver.model
					+ " and run again");
			return;
		}

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
			// System.out.println("Call duration " + duration + " seconds");
			this.outgoingDuration += duration;
			this.lastOutgoingCall = receiver.receiver.simMobileNumber;
			receiver.receiver.lastIncomingCall = this.simMobileNumber;
			this.lastOutgoingDuration = duration;
			this.lastOutgoingCall = receiver.receiver.simMobileNumber;
			receiver.receiver.lastIncomingDuration = duration;
			receiver.receiver.lastIncomingCall = this.simMobileNumber;
		}
	}

	void printInfoIncoming() {
		if (this.lastIncomingCall == null) {
			System.out.println("nikoi ne te e tyrsil");
			return;
		}
		System.out.println("Last incoming call is from "
				+ this.lastIncomingCall);
		System.out.println("Last incoming call duration "
				+ this.lastIncomingDuration);
	}

	void printInfoOutgoing() {
		if (this.lastOutgoingCall == null) {
			System.out.println("Ne si zwynql na nikogo");
			return;
		}

		System.out.println("Last outgoing call is to " + this.lastOutgoingCall);
		System.out.println("Last outgoing call duration "
				+ this.lastOutgoingDuration);
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
		GSM sony = new GSM();
		Call callIphone = new Call();
		Call callSony = new Call();
		Call callSamsung = new Call();

		samsung.model = "Samsung";
		iphone.model = "Iphone";
		sony.model = "Sony";
		samsung.hasSimCard = false;
		iphone.hasSimCard = false;
		sony.hasSimCard = false;
		samsung.insertSimCard("0883405129");
		iphone.insertSimCard("0883123456");
		sony.insertSimCard("0883405122");
		callIphone.receiver = iphone;
		callSony.receiver = sony;
		callSamsung.receiver = samsung;
		samsung.call(callSony, 200);
		samsung.call(callIphone, 60);
		// samsung.removeSimCard();
		samsung.call(callIphone, 10);
		samsung.call(callSony, 44);
		iphone.call(callSamsung, 22);
		samsung.getSumForCall();
		samsung.printInfoIncoming();
		samsung.printInfoOutgoing();
	}
}
