class Movie extends Media {

  public Movie(String title, int duration, boolean isPremium) {
    super(title, duration, isPremium);
  }

  @Override
  public void playContent() {
    if (isPremium) {
      System.out.println("Verifying Subscription...");
    }
    System.out.println(
      "Streaming Movie: " + getTitle() + " for " + getDuration() + " minutes."
    );
  }
}
