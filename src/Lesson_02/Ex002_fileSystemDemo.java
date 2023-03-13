package Lesson_02;
import java.io.File;
public class Ex002_fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());  // C:\Users\samar\Desktop\Java_project\file.txt

        System.out.println(pathFile);  // C:\Users\samar\Desktop\Java_project/file.txt
        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        System.out.println(f1.getAbsolutePath());  // C:\Users\samar\Desktop\Java_project\file.txt
        System.out.println(f2.getAbsolutePath());  // C:\Users\sk\vscode\java_projects\file.txt
    }
}
