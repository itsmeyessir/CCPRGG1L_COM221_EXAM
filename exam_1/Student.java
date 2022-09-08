public class Student {
    String surname;
    String firstName;
    String middleInitial;
    String dateofBirth;
    int studentNumber;
    String EmailAddress;
    boolean iAmAwesome;

    public void sayMyDeets(){
        System.out.println("Hi my name is " + surname + ", " + firstName + " " + middleInitial + "\n" + "I was born on " + dateofBirth);
    }
    
    public void sayMyStudentNumber(){
        System.out.println("My student number is " + studentNumber);
    }
    
    public void sayMyEmailAddress(){
        System.out.println("My email address is " + EmailAddress);
    }

    public void amIAwesome(){
        System.out.println("I really am awesome " + iAmAwesome);
    }
    
    public Student (String stuSurname, String stuFirstName, String studentMiddleInitial, String stuDateofBirth, int stuNumber, String stuEmail, boolean amIAwesome) {
        surname = stuSurname;
        firstName = stuFirstName;
        middleInitial = studentMiddleInitial;
        dateofBirth = stuDateofBirth;
        studentNumber = stuNumber;
        EmailAddress = stuEmail;
        iAmAwesome = amIAwesome;

    }
}
