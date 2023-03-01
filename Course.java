class Course {
    private String courseTitle;
    private String courseNumber;
   
    public String getTitle()
    {
        return this.courseTitle;

    }
    public String getNumber()
    {
        return this.courseNumber;

        
    }
public void setTitle(String title){
    this.courseTitle = title;
}

public void setNumber(String number){
    this.courseNumber = number;
}

public void printCourseInfo() {
    System.out.println("the course number: " + courseNumber + "\n" + "the course title: " + courseTitle );
}
}

class OfferedCourse extends Course {
    private String instructorName,location,classTime;
    public void setInstructor(String instructor){
        this.instructorName = instructor;
    } 
    public void setLocation(String location){
        this.location= location;
    } 
    public void setTime(String time){
       this.classTime = time;
    } 
    public String getInstructor(){
        return this.instructorName;
    } 

    public String getLocation(){
        return this.location;
    } 
    public String getTime(){
        return this.classTime;
     } 

     public void printCourseInfo(){
        super.printCourseInfo();
        System.out.println("the instructor's name: "+ instructorName +"\n"
        + "the location: " + location +"\n"
        +" the class time: "+ classTime);
     }

}
