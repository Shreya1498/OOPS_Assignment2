package assignment4Prob3;

public class TestCard {

	public static void main(String[] args) {
	
		TravelCard tc=new TravelCard();
		System.out.println("The reward points you earned are "+tc.getRewardPoints(200));
		System.out.println("Congratulations,you have successfully recharged with "+tc.rechrgeCard(20000));
		System.out.println(tc.swipeCard(20));
		System.out.println(tc.travelSwipe(10));
		
		tc.setCardNo(15235230);
		tc.setSwipeLimit(35000);
	
		System.out.println("Your Card Number is "+tc.getCardNo());
		System.out.println("Your Daily Swipe limit is "+tc.getSwipeLimit());
	}

}