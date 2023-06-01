public class wisard extends unit{
    int critical;
    public wisard(String name, int damage, int critical){
        super(name, damage);
        this.critical = critical;
    }
    @Override
    public int getDamage(){
        if ((int)(Math.random()*100)>critical)
            return super.getDamage();
        else
            return super.getDamage()*2;
    }
}
}
