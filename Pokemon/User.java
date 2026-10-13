import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    private String name;
    private Pokemon pokemon;
    private int power;
    
    public User(String name){
      this.name=name;  
      this.pokemon=null;
      GreenfootImage img = new GreenfootImage(name.toUpperCase() + " ", 28, Color.WHITE, Color.BLUE);
        this.setImage(img);
    }
    public void setPokemon(Pokemon p){
        this.pokemon=p;
    }
    public Pokemon getPokemon(){
        return pokemon; 
    }
    public void switchPokemon(Pokemon p){
        setPokemon(p);
    }
    public void heal(){
        if(this.pokemon!=null){
           this.pokemon.heal(); 
        }
    }
    public void attack(String name, User enemy){
        if (this.pokemon != null && enemy.getPokemon() != null) {
            this.pokemon.attack(name, enemy.getPokemon());
        }
    }

    public boolean isEndGame(){
       if(this.pokemon==null){
           return true;
       }
    }
    public String getName(){
        return this.name;
    }
    public int getPower(){
        return this.power;
    }
    public void setPower(int power){
        this.power=power;
    }

        

    
    
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
    public void Attack(String name){
        this.name=name;
        this.power=10;
    }
    public void Attack(String name, int power){
        this.name=name;
        this.power=power;
    }
   

    
    public void act()
    {
        // Add your action code here.
    }
}
