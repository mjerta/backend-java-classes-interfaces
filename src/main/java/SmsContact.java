public class SmsContact implements ContactInfo {
  private String phone;

  public SmsContact(String phone) {
    this.phone = phone;
  }

  @Override
  public void sendmessage() {
    System.out.println("SMS send to " + phone);
  }
}
