package alexCourse;

public class Main {
    public static void main(String[] args) {
     Mouse mouse = new Mouse();
     mouse.leftClick();

     Mouse1 mouse1 = new Mouse1();
     mouse1.leftClick();
     mouse1.rightClick();
     mouse1.jumpFromTable();

     System.out.println("Mixed");

     Mouse mouseMix = new Mouse1();
     mouseMix.leftClick();

   //  Mouse1 mouseMixB = new Mouse();
  //   mouseMixB.leftClick();

//     mouse.leftClick();
//     mouse.rightClick();
//     mouse.scroolUp();
//
//     String s = "test";
//     System.out.println(s);
//
//     String s3 = new String("test2");
//     System.out.println(s3);
//
//
//     Mouse1 myMouse1 = new Mouse1();
//     myMouse1.leftClick();
//     myMouse1.leftClick();
//
//     myMouse1.setShape("test shape");
//     Mouse1.setColor("color test red");


    }



}
