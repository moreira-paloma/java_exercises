public abstract class Fighter {

    private String name;
    private int life;
    private int damage;

    public Fighter(String name, int life, int damage){
        this.name = name;
        this.life = life;
        this.damage = damage;
    }

    public void attack(Fighter target){
            target.life -= this.damage;
            System.out.println(this.name + " attacked " + target.name + " causing " + this.damage + " damage.");
        }

    public void takeDamage(int amount){
        this.life -= amount;
        if (this.life < 0) this.life = 0;
    }



    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getDamage() {
        return damage;
    }
}


