public class FuryWarrior extends Fighter {

    public FuryWarrior(String name, int life, int damage) {
        super(name, life, damage);
    }

    @Override
    public void attack(Fighter target) {

        int finalDamage = getDamage();

        if (getLife() < 30) {
            System.out.println(getName() + " entered FURY MODE! Damage doubled!");
            finalDamage = getDamage() * 2;
        }

        target.takeDamage(finalDamage);

        System.out.println(getName() + " attacked " + target.getName() +
                " causing " + finalDamage + " damage.");
    }
}