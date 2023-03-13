package Lesson_02;

public class Ex001_stringsDemo {
    public static void main(String[] args) {
        String[] name = { "N", "i", "k", "i", "t", "a" };
        String sk = "NIKITA КА.";
        System.out.println(sk.toLowerCase()); // nikita ка.
        System.out.println(String.join("", name)); // Nikita
        System.out.println(String.join("", "N", "i", "k", "i", "t", "a")); // Nikita
        System.out.println(String.join(",", "N", "i", "k", "i", "t", "a"));  // N,i,k,i,t,a
    }
}
