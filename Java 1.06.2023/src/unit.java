public class unit {
    String name;
    int health;
    int damage;

    unit(String name, int damage){
        this.name = name;
        this.damage = damage;
        this.health = 100;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public void unit(int damage){
        this.health -= damage;
    }
    public void print(){
        System.out.println(this.name + " " + this.health);
    }

    public void uron(int damage) {
    }
}
