package instVarPract;
 
//import java.util.Scanner;
 
public class Student
{
 
public String name;
 
private int marks;

private int numId;
 
public Student (String stuName) {
name = stuName;
}
public void setMarks(int stuMar) {
marks = stuMar;
}
public void setIdNum(int idNum) {
numId = idNum;
}
 
// This method prints the student details.
public void printStu() {
System.out.println("Name: " + name );
System.out.println("Marks:" + marks);
System.out.println("ID:" +numId);
}
 
public static void main(String args[]) {
Student StuOne = new Student("Lwam");
Student StuTwo = new Student("Jacob");
Student StuThree = new Student("Phoebe");
 
StuOne.setMarks(98);
StuTwo.setMarks(89);
StuThree.setMarks(90);

StuOne.setIdNum(1098);
StuTwo.setIdNum(8933);
StuTwo.numId+=1;
StuThree.setIdNum(6432);

StuOne.printStu();
StuTwo.printStu();
StuThree.printStu();
 
}
}