package com.lordjoe.machine_learning.tictactoe;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

/**
 * com.lordjoe.machine_learning.tictactoe.RandomPlayer
 * this player choses a move randomly from legal moves
 * User: Steve
 * Date: 4/6/2016
 */
public class RandomPlayer implements IStrategy {
    public static final Random RND = new Random();

    public final Player player;

    public RandomPlayer(Player player) {
        this.player = player;
    }

    @Nonnull
    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public TicTacToeMove choseMove(@Nonnull TicTatToeGame g) {
        TicTacToeBoard b = g.getBoard();
        List<Position> legalMoves = b.getLegalMoves();
        int index = RND.nextInt(legalMoves.size());
        return new TicTacToeMove(player,legalMoves.get(index));
    }
}
