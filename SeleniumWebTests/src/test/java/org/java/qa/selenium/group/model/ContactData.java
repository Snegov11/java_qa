package org.java.qa.selenium.group.model;

public class ContactData {

    private final String middleName;
    private final String lastName;
    private final String email;
    private final String address;
    private final String mobilePhone;
    private final String group;

    public ContactData(String middleName, String lastName, String email, String address, String mobilePhone, String group) {
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.group = group;
    }

    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public  String getGroup() { return group;}

}
