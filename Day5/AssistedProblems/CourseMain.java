class Course{
    String courseName;
    double duration;

    Course(String courseName, double duration){
        this.courseName=courseName;
        this.duration=duration;
    }

    void displayInfo(){
        System.out.println("course Name is: "+courseName);
        System.out.println("course duration is: "+duration);
    }
}
class OnlineCourse extends Course{
    String platform;
    Boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform , boolean isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("platform is :"+ platform);
        System.out.println("Recorded :"+ (isRecorded?"yes":"no"));
    }

}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class CourseMain {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java OOP", 6, "Coursera", true, 4000.0, 20.0);
        poc.displayInfo();
    }
}
