public class Podcast extends Media {

  public Podcast(String title, int duration) {
    super(title, duration, false);
  }

  @Override
  public void playContent() {
    System.out.println("Loading Advertisement...");
    System.out.println(
      "Playing Podcast: " + getTitle() + " for " + getDuration() + " minutes."
    );
  }
}
