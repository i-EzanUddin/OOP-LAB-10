abstract class Character {
    int health;
    int attackPower;
    String name;

    abstract void specialAbility();

    void attack(Character target) {
        target.health = target.health - this.attackPower;
        System.out.println(this.name + " attacked " + target.name);
        System.out.println(target.name + " health is now: " + target.health);
    }
}

class Warrior extends Character {
    void specialAbility() {
        attackPower = attackPower * 2;
        System.out.println(name + " used special ability. Attack power doubled to: " + attackPower);
    }
}

class Mage extends Character {
    void specialAbility() {
        attackPower = attackPower + 20;
        System.out.println(name + " used special ability. Attack power increased to: " + attackPower);
    }
}

class Archer extends Character {
    void specialAbility() {
        attackPower = attackPower + 15;
        System.out.println(name + " used special ability. Attack power increased to: " + attackPower);
    }
}

public class Two {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.name = "Warrior";
        w.health = 100;
        w.attackPower = 30;

        Mage m = new Mage();
        m.name = "Mage";
        m.health = 80;
        m.attackPower = 25;

        Archer a = new Archer();
        a.name = "Archer";
        a.health = 90;
        a.attackPower = 20;

        w.specialAbility();
        m.specialAbility();
        a.specialAbility();

        w.attack(m);
        m.attack(a);
        a.attack(w);
    }
}