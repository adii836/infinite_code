
import java.util.Scanner;

class Person{
    String name;
    String dateOfBirth;
    String gender;
    String mobileNumber;
    String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}

class Donor extends Person {
    private String bloodBankName;
    private String donorType;
    private String donationDate;

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "bloodBankName='" + bloodBankName + '\'' +
                ", donorType='" + donorType + '\'' +
                ", donationDate='" + donationDate + '\'' +
                '}';
    }

    public void displayDonationDetails( ){


        System.out.println("Donation Details : ");

        System.out.println("Name : "+getName());
        System.out.println("Date of Birth : "+getDateOfBirth());
        System.out.println("Gender : "+getGender());
        System.out.println("Mobile Number : "+getMobileNumber());
        System.out.println("Blood Group : "+getBloodGroup());
        System.out.println("Blood Bank Name : "+getBloodBankName());
        System.out.println("Donor Type : "+getDonorType());
        System.out.println("Donation Date : "+getDonationDate());
    }
}

public class Main1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Donor d = new Donor();

        System.out.println("Enter the name : ");
        d.setName(sc.nextLine());

        System.out.println("Enter Date Of Birth : ");
        d.setDateOfBirth(sc.nextLine());

        System.out.println("Enter Gender : ");
        d.setGender(sc.nextLine());

        System.out.println("Enter Mobile Number : ");
        d.setMobileNumber(sc.nextLine());

        System.out.println("Enter Blood Group : ");
        d.setBloodGroup(sc.nextLine());


        System.out.println("Enter Blood Bank Name : ");
        d.setBloodBankName(sc.nextLine());


        System.out.println("Enter Donor type : ");
        d.setDonorType(sc.nextLine());


        System.out.println("Enter Donation Date : ");
        d.setDonationDate(sc.nextLine());

        d.displayDonationDetails();
    }
}
