public class SmsContactInfo implements ContactInfo {

  private String phone;

  public void sendmessage() {
    System.out.println("SMS send to " + phone);

  }

  public SmsContactInfo(String phone) {
    this.phone = phone;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
