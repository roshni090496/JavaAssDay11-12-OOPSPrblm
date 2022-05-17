package com.company;

import java.util.Random;
public class DeckOfCards {
    int[][] cards = new int[4][13];

    void DistributeCards(int playerNumber) {
        for (int i = 0; i < 9; i++) {
            giveCard(playerNumber);
        }
    }

    void giveCard(int playerNumber) {
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if (cards[suit][rank] != 0) {
            giveCard(playerNumber);
        } else {
            cards[suit][rank] = playerNumber;
        }
    }

    void showCards(int playerNumber) {
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                if (cards[suit][rank] == playerNumber) {
                    System.out.print(getSuit(suit) + " - " + getRank(rank) + "  |  ");
                }
            }
        }
        System.out.println("\n");
    }

    String getRank(int rankNumber) {
        switch (rankNumber) {
            case 0:
                return "2";
            case 1:
                return "3";
            case 2:
                return "4";
            case 3:
                return "5";
            case 4:
                return "6";
            case 5:
                return "7";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            case 9:
                return "Jack";
            case 10:
                return "Queen";
            case 11:
                return "King";
            case 12:
                return "Ace";
            default:
                return "";
        }
    }

    String getSuit(int suitNumber) {
        switch (suitNumber) {
            case 0:
                return "Clubs";
            case 1:
                return "Diamonds";
            case 2:
                return "Hearts";
            case 3:
                return "Spades";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-**-*-*-Deck Of Cards *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        //  Display the all the cards
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(rank + " of " + suit);
        }

        System.out.println();
        System.out.println("Display The Players Of Cards : ");
        DeckOfCards deckOfCards = new DeckOfCards();

        for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
            deckOfCards.DistributeCards(playerNumber);
            System.out.println("Player " + playerNumber + "'s cards:");
            deckOfCards.showCards(playerNumber);
        }
    }
}
