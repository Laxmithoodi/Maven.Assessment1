package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part3.PetOwner;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (ROCK.equals(handSign)) {
            return PAPER;
        } else if (PAPER.equals(handSign)){
            return SCISSOR;
    }else return ROCK;

//        if (handSign == ROCK || handSign == PAPER)
//            return PAPER;
//        else
//
//            return ROCK;


    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        if (handSign == PAPER || handSign == SCISSOR)
            return PAPER;
        else

            return SCISSOR;

    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        if(handSignOfPlayer1.equals(handSignOfPlayer2)){
            return "draw";
        }
        else if
        (getWinningMove(handSignOfPlayer1).equals(handSignOfPlayer2)) {
            return
                    handSignOfPlayer2;
        }else {
            return handSignOfPlayer1;
        }

    }


//        String winner = "";
//
//        if (handSignOfPlayer1.equals(ROCK) && handSignOfPlayer2.equals(PAPER)) {
//            winner =handSignOfPlayer1;
//        } else if (handSignOfPlayer1.equals(ROCK) && handSignOfPlayer2.equals(SCISSOR)) {
//            winner = handSignOfPlayer1;
//
//        } else if (handSignOfPlayer1.equals(PAPER) && handSignOfPlayer2.equals(SCISSOR)) {
//            winner = handSignOfPlayer2;
//        }
//
//            return winner;
//    }

}


//
//        if(handSignOfPlayer1 ==ROCK || handSignOfPlayer2 == PAPER)
//
//=
//            return ROCK;
//        else
//            return PAPER;


