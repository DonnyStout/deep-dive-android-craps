package edu.cnm.deepdive.craps.models;

import edu.cnm.deepdive.craps.models.Craps.State;

/**
 * The <code>Game</code> class invokes methods from the <code>Craps</code> class to allow the
 * user to run the Monte Carlo styled simulation of Craps.
 *
 * Author Donny Stout
 */
public class Game {

  private Craps craps;
  private long wins;
  private long losses;

  /**
   * Creates a new instance of the Craps class and invokes the reset method employed in the
   * <code>Craps</code> class.
   */
  public Game() {
    craps = new Craps();
    reset();
  }

  /**
   * Allows for keeping track of wins and losses by checking the <code>State</code> updating the
   * result of play and if <code>WIN</code> increments wins and if <code>LOSS</code> increments
   * losses.
   *
   * @return                      The result of the state after incrementing the result.
   */
  public Craps.State play() {
    Craps.State result = craps.play();
    if (result == State.WIN) {
      wins++;
    } else {
      losses++;
    }
    return result;
  }

  /**
   * Allows for the ability to reset the tally of accumulated wins and losses by invoking reset
   * implemented in the <code>Craps</code> class.
   */
  public void reset() {
   wins = 0;
   losses = 0;
   craps.reset();
  }

  /**
   * Employs an instance of <code>Craps</code> to allow for access to the methods.
   *
   * @return                   Returns craps to the field.
   */
  public Craps getCraps() {
    return craps;
  }

  /**
   * Allows access to receive the wins tally from the <code>Craps</code> class.
   *
   * @return              Returns wins to the field.
   */
  public long getWins() {
    return wins;
  }

  /**
   * Allows access to receiver the tally of losses from the <code>Craps</code> class.
   *
   * @return                Returns losses to the field.
   */
  public long getLosses() {
    return losses;
  }
}
