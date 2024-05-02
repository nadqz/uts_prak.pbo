//Inheritance
class Monster extends Character implements Attacker {
    private int attackPower;

    public Monster(String name, int health, int attackPower) {
        super(name, health);
        this.attackPower = attackPower;
    }

    @Override
    public void attack() {
        System.out.println(name + " menyerang!");
    }

    @Override
    void attack(Character opponent) {
        System.out.println(name + " menyerang " + opponent.getName());
        opponent.takeDamage(attackPower);
    }
}