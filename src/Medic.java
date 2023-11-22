public class Medic extends Hero{


    public Medic(int health, int damage) {
        super(health, damage,"Medic");
    }

    @Override
    public void applySuperAbilitity() {
        System.out.println(" Medic приминил суперспособность CRITICAL DAMAGE");

    }


}
