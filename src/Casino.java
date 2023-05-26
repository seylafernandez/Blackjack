import java.util.ArrayList;

public class Casino {

    ArrayList<Card> deck;
    public static void main(String[] args) {
       Casino table = new Casino();
    }
    Casino(){

        createDeck();
        printDeck();

    }
    public void createDeck(){
        deck = new ArrayList<>();
        //loop through each suit 0 - 3
        for (int x = 0; x < 4; x++){
            for (int y = 2; y < 15; y++){
                deck.add(new Card(x,y));
            }
        }
    }
    public void printDeck(){
        for (int r = 0; r < deck.size(); r++){
         deck.get(r).printCardInfo();
        }
    }
}

