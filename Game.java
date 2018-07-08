class Game{
    public static void main(String[] args){
    DiceGame game = new DiceGame();
    Greeting greeting = new Greeting();

    greeting.greet();

    for(int i=0; i<2; i++){
      System.out.println("Die " + (i+1) + ": " + game.shakeDie());
    }
    System.out.println("Total value: " + game.getSumDice());

    game.judge(greeting.getName());
  }
}
