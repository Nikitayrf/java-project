package Lesson_07.Ex007;

public class Warrior extends BaseHero {
    public Warrior() {
        super( String.format( "Hero_Warrior_%s", ++Warrior.number ),
                Warrior.r.nextInt( 200, 300 ) );
    }

    public String getInfo() {
        return String.format( "%s", super.getInfo() );
    }
}
