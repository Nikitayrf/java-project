package Lesson_07.Ex007;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {


        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
        int warriorCount = 0;


        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int randHero = rand.nextInt( 3 );
            if (randHero == 0) {
                teams.add( new Priest() );
                priestCount++;
            } else if (randHero == 1) {
                teams.add( new Magician() );
                magicianCount++;
            } else {
                teams.add( new Warrior() );
                warriorCount++;
            }

            System.out.println( teams.get( i ).getInfo() );
        }
        System.out.println();
        System.out.printf( "magicalCount: %d priestCount: %d warriorCount: %d \n\n\n", magicianCount, priestCount, warriorCount );
    }
}