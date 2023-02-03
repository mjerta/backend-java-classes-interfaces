public class Customer {

		public Customer(String name, String lastName, CreditCard creditCard, ContactInfo contactInfo) {
				this(name, (int)(Math.random() * 100), lastName, creditCard, contactInfo);
		}

		public Customer(String name, int customerNumber, String lastName, CreditCard creditCard, ContactInfo contactInfo) {
				this.name = name;
				this.customerNumber = customerNumber;
				this.lastName = lastName;
				this.creditCard = creditCard;
				this.contactInfo = contactInfo;
		}

		private String name;

		private int customerNumber;
		private String lastName;

		private CreditCard creditCard;

		private ContactInfo contactInfo;

		public String getName(){
				return name;
		}

		public void setName(String name){
				this.name = name;
		}

		public int getCustomerNumber() {
				return customerNumber;
		}

		public void setCustomerNumber(int customerNumber) {
				this.customerNumber = customerNumber;
		}

		public String getLastName() {
				return lastName;
		}

		public void setLastName(String lastName) {
				this.lastName = lastName;
		}

		public CreditCard getCreditCard() {
				return creditCard;
		}

		public void setCreditCard(CreditCard creditCard) {
				this.creditCard = creditCard;
		}

		public ContactInfo getContactInfo() {
				return contactInfo;
		}

		public void setContactInfo(ContactInfo contactInfo) {
				this.contactInfo = contactInfo;
		}

		public void printName(){
				System.out.println("Customer " + name);
		}
}
