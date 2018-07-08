import java.util.*;

class Greeting{
  private String name;
  public Greeting(){
    this.name = "NO_NAME";
  }
  public Greeting(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public void setName(){
    System.out.println("What is your name?");
    System.out.print("> ");
    Scanner scan = new Scanner(System.in);
    this.name = scan.next();
  }
  public void setName(String name){
    this.name = name;
  }

  public void greeting(){
    System.out.println("Hello, " + getName() + "!");
  }
 

  public void greet(){
    setName();
    greeting();
  }
}
