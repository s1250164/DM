import java.util.*;

class DiceGame{
  private int sumDice;
  public DiceGame(){
    this.sumDice = 0;
  }
  public int getSumDice(){
    return this.sumDice;
  }
  public int shakeDie(){
    int die;
    Random rand = new Random();
    die = rand.nextInt(6)+1;
    this.sumDice += die;
    return die;
  }
}
