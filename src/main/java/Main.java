//Napisz program, który losuje liczbę oczek (od 1 do 6) dla dwóch kostek i porównuje wyniki

public class Main {
  public static void main(String[] args) {
    int dice1 = (int) (Math.random() * 6 + 1);
    int dice2 = (int) (Math.random() * 6 + 1);
    System.out.println("Wyrzucono następujące oczka w 2 rzutach kostką: ");
    System.out.println(dice1);
    System.out.println(dice2);
    if (dice1 == dice2) {
      System.out.println("Wyrzucono takie same oczka, wygrałeś!");
    } else {
      System.out.println("Wyrzucono różne oczka, przegrałeś!");
    }
  }
}