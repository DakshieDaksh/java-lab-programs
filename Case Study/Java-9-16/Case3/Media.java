abstract class Media {

  private String title;
  private int duration;
  protected boolean isPremium;

  // Constructor
  public Media(String title, int duration, boolean isPremium) {
    this.title = title;
    this.duration = duration;
    this.isPremium = isPremium;
  }

  // Getter for title
  public String getTitle() {
    return title;
  }

  // Getter for duration
  public int getDuration() {
    return duration;
  }

  // Getter for isPremium
  public boolean isPremium() {
    return isPremium;
  }

  // setter for isPremium
  public void setPremium(boolean isPremium) {
    this.isPremium = isPremium;
  }

  // Common method
  public void getDetails() {
    System.out.println("Title: " + title);
    System.out.println("Duration: " + duration + " minutes");
    System.out.println("Premium: " + isPremium);
  }

  // Abstract method
  public abstract void playContent();
}
