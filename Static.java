class Student{
    static int count=0;
    int rollNo;
    final String university="SPPU";
    static String homeTown,name;

    Student(){
        rollNo=count;
        count++;
        homeTown="";
        name="";
    }
    
    Student(String name,String homeTown){
        rollNo=count;
        count++;
        this.homeTown=homeTown;
        this.name=name;
    }
    Student(String name){

        rollNo=count;
        count++;
        homeTown="";
        this.name=name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getUniversity() {
        return university;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void display(){

        System.out.println("Name: "+name);
        System.out.println("RollNo: "+rollNo);
        System.out.println("University: "+university);
        System.out.println("HomeTown: "+homeTown);
    }
}

public class Static {
    public static void main(String[] args) {
        Student s1=new Student("Rohit");
        s1.display();
        Student s2=new Student("Piyush","Pune");
        s2.display();
        Student s3=new Student();
        s3.display();

    }
}
