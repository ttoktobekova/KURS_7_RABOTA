public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, "Warrior");
    }

    @Override
    public void applySuperAbilitity() {
        System.out.println(" Warrior приминил суперспособность CRITICAL DAMAGE");

    }
}
