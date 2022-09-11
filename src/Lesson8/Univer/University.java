package Lesson8.Univer;

public class University {
    private String universityName;
    private String address;
    private int phone;

    public University (String universityName, String address, int phone){
        this.universityName = universityName;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return "Название университета: " + universityName + ", адрес: " + address + ", телефон: " + phone;
    }

    public void addStudent(){

    }

    public void removedStudent(){

    }

    public void getStudent(){

    }

    public void addDepartment(){

    }

    public void removedDepartment(){

    }

    public void getDepartment(){

    }

    public void getAllDepart(){

    }

    public String getUniversityName() {return universityName;}

    public void setUniversity(String universityName) {this.universityName = universityName;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public int getPhone() {return phone;}

    public void setPhone(int phone) {this.phone = phone;}
}
