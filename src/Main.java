
public class Main {
    public static void main(String[] args) {

        HaavingSuperAbilitity [] superType ={ new Magic(1000,100), new Medic(2000,0),
                new Warrior(3000,30)};
        for (int i = 0; i < superType.length; i++) {
            superType[i].applySuperAbilitity();


        }

    }

}