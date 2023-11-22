public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "Magic");
    }

    @Override
    public void applySuperAbilitity() {
        System.out.println(" Magic  приминил суперспособность CRITICAL DAMAGE");
    }
}
