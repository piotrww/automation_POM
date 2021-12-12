package alexBlockChain;

public class ChainMail {

    public static void main(String[] args) {

        String myStringToChainingTest = "DOUG DIMMA";
        System.out.println(myStringToChainingTest.toLowerCase().charAt(3));

        Student myStudent = new Student();
        myStudent.setName("Roland").setGrade(5);
        System.out.println(myStudent.name);
        System.out.println(myStudent.grade);
        myStudent.setName("Michael").setGrade(3);
        System.out.println(myStudent.name);
        System.out.println(myStudent.grade);
        myStudent.setName("Robert").setGrade(2);

        System.out.println(myStudent.name);
        System.out.println(myStudent.grade);

    }
}
