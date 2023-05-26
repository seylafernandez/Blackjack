public class Card {

    public String name;
    public String suit;
    public int cardValue;

    public Card(int suitNum, int cardNum) {
        //suits
        if (suitNum == 0) {
            suit = "spades";
        } else if (suitNum == 1) {
            suit = "diamonds";
        } else if (suitNum == 2) {
            suit = "clover";
        } else {
            suit = "heart";
        }

        //value
        if (cardNum == 2) {
            name = "two";
            cardValue = 2;
        } else if (cardNum == 3) {
            name = "three";
            cardValue = 3;
        } else if (cardNum == 4) {
            name = "four";
            cardValue = 4;
        } else if (cardNum == 5) {
            name = "five";
            cardValue = 5;
        } else if (cardNum == 6) {
            name = "six";
            cardValue = 6;
        } else if (cardNum == 7) {
            name = "seven";
            cardValue = 7;
        } else if (cardNum == 8) {
            name = "eight";
            cardValue = 8;
        } else if (cardNum == 9) {
            name = "nine";
            cardValue = 9;
        } else if (cardNum == 10) {
            name = "ten";
            cardValue = 10;
        } else if (cardNum == 11) {
            name = "jack";
            cardValue = 10;
        } else if (cardNum == 12) {
            name = "queen";
            cardValue = 10;
        } else if (cardNum == 13) {
            name = "king";
            cardValue = 10;
        } else {
            name = "ace";
            cardValue = 11;
        }
    }

        public void printCardInfo(){
            System.out.println(name + " of " + suit);
        }


}
