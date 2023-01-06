public class Main {
    public static void main(String[] args) {


        Fire charmender = new Fire("Charmender",20, "fire", 30, 6, 30.2, "dogfood");
        SuperPokemon pikachu = new SuperPokemon("Pikachu",20, "electric", 20, 5);
        Water squirtle = new Water("Squirtle", 30, "water", 40, 5, true, 30);
        Grass bulbasaur = new Grass("Bulbasaur", 20, "grass", 34, 5, 5, 6 );



        charmender.pound();
        pikachu.pound();
        charmender.eat();
        bulbasaur.pound();
        squirtle.pound();
        squirtle.pound();
        squirtle.rainDance();
        squirtle.pound();
        bulbasaur.leafthrower();


    }
}

