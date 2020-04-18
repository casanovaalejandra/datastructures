package tests;

import com.company.BasicStack;

//code thanks to https://github.com/dlbunker/ps-data-structure-helpers/blob/master/src/java/CardStackApp.java
public class StackTester {
    BasicStack basicStack = new BasicStack();
    public static void main(String[] args){
        StackTester app = new StackTester();
        app.stackCards();
        app.unstackCards();

        //restack cards
        app.stackCards();

        //how many cards are on the deck
        app.desckSize();

        //do we have queen of hearts in the deck
        app.containsCard("Queen of Hearts");

        //do we have a joker
        app.containsCard("Joker");

        //go to the king of diamonds
        app.goToCard("King of Diamonds");

        //now how many cards are on the deck
        app.desckSize();
    }


    public void stackCards() {
        //stack the spade suit
        basicStack.push("Ace of Spades");
        basicStack.push("2 of Spades");
        basicStack.push("3 of Spades");
        basicStack.push("4 of Spades");
        basicStack.push("5 of Spades");
        basicStack.push("6 of Spades");
        basicStack.push("7 of Spades");
        basicStack.push("8 of Spades");
        basicStack.push("9 of Spades");
        basicStack.push("10 of Spades");
        basicStack.push("Jack of Spades");
        basicStack.push("Queen of Spades");
        basicStack.push("King of Spades");

        //stack the diamond suit
        basicStack.push("Ace of Diamonds");
        basicStack.push("2 of Diamonds");
        basicStack.push("3 of Diamonds");
        basicStack.push("4 of Diamonds");
        basicStack.push("5 of Diamonds");
        basicStack.push("6 of Diamonds");
        basicStack.push("7 of Diamonds");
        basicStack.push("8 of Diamonds");
        basicStack.push("9 of Diamonds");
        basicStack.push("10 of Diamonds");
        basicStack.push("Jack of Diamonds");
        basicStack.push("Queen of Diamonds");
        basicStack.push("King of Diamonds");

        //stack the club suit
        basicStack.push("Ace of Clubs");
        basicStack.push("2 of Clubs");
        basicStack.push("3 of Clubs");
        basicStack.push("4 of Clubs");
        basicStack.push("5 of Clubs");
        basicStack.push("6 of Clubs");
        basicStack.push("7 of Clubs");
        basicStack.push("8 of Clubs");
        basicStack.push("9 of Clubs");
        basicStack.push("10 of Clubs");
        basicStack.push("Jack of Clubs");
        basicStack.push("Queen of Clubs");
        basicStack.push("King of Clubs");

        //stack the heart suit
        basicStack.push("Ace of Hearts");
        basicStack.push("2 of Hearts");
        basicStack.push("3 of Hearts");
        basicStack.push("4 of Hearts");
        basicStack.push("5 of Hearts");
        basicStack.push("6 of Hearts");
        basicStack.push("7 of Hearts");
        basicStack.push("8 of Hearts");
        basicStack.push("9 of Hearts");
        basicStack.push("10 of Hearts");
        basicStack.push("Jack of Hearts");
        basicStack.push("Queen of Hearts");
        basicStack.push("King of Hearts");
    }
    public void unstackCards() {
        //now pull the cards off the stack and print them
        while(basicStack.size() > 0) {
            System.out.println(basicStack.pop());
        }
    }

    public void containsCard(String card) {
        System.out.println(basicStack.contains(card));
    }

    public void goToCard(String card) {
        System.out.println(basicStack.access(card));
    }

    public void desckSize() {
        System.out.println(basicStack.size());
    }
}
