public class Monster {
  private int health = 100;
  private int nextAttackDmg = 20;

  public int attack(Protagonist hero){
    float chance = Math.random();
    if (chance > 0.3){
      hero.changeHealth(nextAttackDmg);
    }
    else {
      hero.changeHealth(0);
    }
    return nextAttackDmg;
  }

  public void changeHealth(int damage){
    health -= damage;
  }

  public boolean isAlive(){
    return health > 0;
  }
}
