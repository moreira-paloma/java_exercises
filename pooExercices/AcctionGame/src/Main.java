public class Main {

        public static void main(String[] args) {

            Fighter hero = new Fighter("Hero", 100, 10) {};
            FuryWarrior fury = new FuryWarrior("Fury Warrior", 80, 15);

            hero.attack(fury);
            fury.attack(hero);

            hero.attack(fury);
            hero.attack(fury);
            hero.attack(fury); // aqui a vida dele cai abaixo de 30

            fury.attack(hero); // agora entra em modo fúria
        }
    }

