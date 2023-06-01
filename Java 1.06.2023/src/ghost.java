public class ghost extends unit{
    int invisible;
    public ghost(String name, int damage, int invisible){
        super(name, damage);
        this.invisible = invisible;
    }
    @Override
    public void uron(int damage){
        if ((int)(Math.random()*100) > invisible)
            super.uron(damage);
    }
}

