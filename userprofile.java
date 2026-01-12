class userprofile{
    public static void main(String args[]){
        String name="Nithin";
        int age=20;
        float gpa=4.65f;
        char grade='s';
        boolean enrolled=true;
        int examscore=95;
        double es=examscore;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled: " + enrolled);
        System.out.println("---system reports---");
        System.out.println("rounded GPA (for honor roll):"+(int)gpa);
        System.out.println("grade value(ASCII):"+(int)grade);
        if(age>30)
        
        System.out.println("if age is 30 or older: " + (age>30));
        if(age<30)
        System.out.println("if age is 30 or younger: " + (age<30));

    }
}
    

