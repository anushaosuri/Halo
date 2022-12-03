StudentApp
=========================================
class Student
{

String name;
int rollno;
String course;
String email;
long mobile;
String address;
char gender;
int yearofjoining;

public static void printStudent()
{
System.out.println("Student name:"+ name);
System.out.println("Student rollno:"+ rollno);
System.out.println("Student course:"+ course);
System.out.println("Student email:"+ email);
System.out.println("Student mobile:"+ mobile);
System.out.println("Student address:"+ address);
System.out.println("Student gender:"+ gender);

System.out.println("Student year of joining:"+ yearofjoining);
}
}




class StudentManager
{
public static void main(String[] args)
{
Student ram=new Student();
ram.name=" Ram";
ram.rollno=1;
ram.course="java";
ram.email="ram@gmail.com";
ram.mobile=9087654321l;
ram.address="hyd";
ram.gender='M';
ram.yearofjoining=2022;
}
}