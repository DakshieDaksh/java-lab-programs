public class Main {

  public static void main(String[] args) {
    Media[] mediaList = {
      new Movie("Inception", 148, true),
      new Podcast("Tech Talk", 30),
      new Movie("Free Guy", 115, false),
    };

    for (Media m : mediaList) {
      m.playContent();
      System.out.println();
    }
  }
}
