 class School {
   void learning(){
        System.out.println("Grade 10 Student");
    }
}
class highSchool extends School{
   void learning(){
        System.out.println("Grade 12 Students");
    }

}
class Run{
    public static void main(String[] args) {
        highSchool hs= new highSchool();
        hs.learning();
    }
}
