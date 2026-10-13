import greenfoot.*;
/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor 
{
    // instance variables - replace the example below with your own
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    
    public Pokemon(int hp, int ap, String name, String attack, String type){
        this.hp=hp;
        this.ap=ap;
        this.name=name;
        this.img = new GreenfootImage(name+" .png");
        this.img.scale(160,160);
        setImage(this.img);
        this.attack= new Attack(attack);
        this.type=type;
        this.outStatus = false;
    
        
    }
    public String getType(){
        return this.type;
    }
    public void attack(String aName, User enemy){
        takeDamage(enemy.getPokemon().getAPower(aName, enemy));
    }
    public void takeDamage(int amount){
        this.hp-=this.hp-amount;
        if(this.hp<0){
            this.hp=0;
            outStatus=true;
        }
    }
    public void heal(){
        this.hp=this.hp+20;
    }
    public void printAttack(){
        
    }
    public void getAttackPower(){
        Attack a = enemy.getPokemon().getAttack();
        return a.getAPower;
    }
    public int getAPower(String attackName,User enemy){
       return 0; 
    }
    public int getHp(){
        return hp;
    }
    public int getAp(){
        return ap;
    }
    public String getName(){
        return name;
    }
    public boolean isout(){
        return this.hp<=0;
    }
    public Attack getAttack(){
        return this.attack;
    }

    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
