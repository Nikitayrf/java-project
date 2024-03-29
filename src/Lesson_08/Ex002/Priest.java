package Lesson_08.Ex002;
 
public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++number ),
                r.nextInt(100, 200));
        this.maxElixir = r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }

    @Override
    public void die() {
        System.out.println("Dries dead!!!");
    }

    public void attack(BaseHero target) {
        int damage = r.nextInt(70,80);
        target.getDamage(damage);
    }
}