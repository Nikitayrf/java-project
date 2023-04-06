package Lesson_07.Ex004;

public class Program {
    public static void main(String[] args) {

        //#region Robo3 demo

        Robot3 robot3 = new Robot3("name_3");
        System.out.println("-------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();
        
        //#endregion
    }

}
