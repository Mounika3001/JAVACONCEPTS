package objects;

public class Teacher {
int id;
String name;
String subject;
double salary;
void teach()
{
	System.out.println(name+ " teacher is teaching "+subject);
}
void markAttendence()
{
	System.out.println(subject+ " Teacher is marking attendence");
}
void giveAssignment()
{
	System.out.println(subject+" Teacher is giving assignment");
}
}
