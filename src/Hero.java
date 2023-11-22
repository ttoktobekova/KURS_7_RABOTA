public abstract   class Hero implements HaavingSuperAbilitity {
private int health;
private   int damage;
private String superType;

    public Hero(int health, int damage, String superType) {
        this.health = health;
        this.damage = damage;
        this.superType = superType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperType() {
        return superType;
    }

    public void setSuperType(String superType) {
        this.superType = superType;
    }
}
