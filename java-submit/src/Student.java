public class Student {

    private String major;
    private String name;
    private int studentId;
    private long phoneNumber;

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = Long.parseLong(phoneNumber);
    }

    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

}
