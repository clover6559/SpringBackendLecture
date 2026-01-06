package org.example.head03_OOP.example7;

public class BusinessUser extends User{
    private String CompanyNumber;

    public BusinessUser(String id,String name, String CompanyNumber) {
        super(id,name);
        this.CompanyNumber = CompanyNumber;
    }
    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("회사 번호: "+ CompanyNumber);
    }

}
