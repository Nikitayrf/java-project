package Lesson_08.Ex002;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(3);
            switch (val) {
                case 0:
                    teams.add(new Priest());
                    break;
                case 1:
                    teams.add(new Magician());
                    break;
                case 2:
                    teams.add(new Druid());
                    break;
                default:
                    break;
            }
            System.out.println(teams.get(i).getInfo());
        }

        System.out.println();

        Priest priest = new Priest(); System.out.println(priest.getInfo());  // Name: Hero_Priest #11  Hp: 103  Type: Priest  Elixir: 64
        Druid druid = new Druid(); System.out.println(druid.getInfo());  // Name: Hero_Druid #12  Hp: 178  Type: Druid  Harmony: 145
        Magician magician = new Magician(); System.out.println(magician.getInfo());  // Name: Hero_Magician #13  Hp: 172  Type: Magician  Mana: 76

        priest.attack(magician); System.out.println(magician.getInfo());  // Name: Hero_Magician #13  Hp: 102  Type: Magician  Mana: 76
        priest.attack(magician); System.out.println(magician.getInfo());  // Name: Hero_Magician #13  Hp: 29  Type: Magician  Mana: 76
        priest.attack(magician); System.out.println(magician.getInfo());  // Magician Die!  // Name: Hero_Magician #13  Hp: 29  Type: Magician  Mana: 76

        druid.healing(magician); System.out.println(magician.getInfo());  // Name: Hero_Magician #13  Hp: 45  Type: Magician  Mana: 76
        druid.healing(magician); System.out.println(magician.getInfo());  // Name: Hero_Magician #13  Hp: 60  Type: Magician  Mana: 76
        druid.healing(magician); System.out.println(magician.getInfo());  // Name: Hero_Magician #13  Hp: 73  Type: Magician  Mana: 76

    }
}