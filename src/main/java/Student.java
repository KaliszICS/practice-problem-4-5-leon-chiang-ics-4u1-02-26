/**
 * class to define a student
 * @author Leon Chiang
 * @version 1.0.0
 */

class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructor for student
     * @param name Name of the student
     * @param age Age of the student
     * @param studentNumber Student number of the student
     */

    public Student (String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Gets the name of the student
     * @return Name of the student
     */

    public String getName() {
        return this.name;
    }

    /**
     * Gets the age of the student
     * @return Age of the student
     */

    public int getAge() {
        return this.age;
    }

    /**
     * Gets the student number of the student
     * @return Student number of the student
     */

    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * Overrides the toString method, outputs the name, age and student number of a student
     * @return Features defining a student as a String
     */

    @Override
    public String toString() {
        return this.name + ", " + this.age +" - " + this.studentNumber;
    }
    
    /**
     * Overrides the equals method, checks if the student number of two students are equal
     * @return True if the student numbers are equal, false otherwise
     */

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return student.getStudentNumber().equals(this.studentNumber);
    }
}
