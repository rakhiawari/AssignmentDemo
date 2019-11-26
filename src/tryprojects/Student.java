package tryprojects;

public class Student {
    private String firstName, lastName, rollId;

    public Student(String firstName, String lastName, String rollId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollId = rollId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollId='" + rollId + '\'' +
                '}';
    }
}
