public class Grass extends SuperPokemon {

    private int amountOfLeaves;
    private int amountOfLegs;

    public Grass(String name,int healthPoints, String type, int experience, int level, int amountOfLeaves, int amountOfLegs) {
        super(name, healthPoints, type, experience, level);
        this.amountOfLeaves = amountOfLeaves;
        this.amountOfLegs = amountOfLegs;
    }

    @Override
    public void pound(){
        System.out.println(super.getName() + " does not know pound, try leafthrower");
    }
    public void leafthrower(){
        System.out.println(super.getName() + " used leafthrower");
    }

    public int getAmountOfLeaves() {
        return amountOfLeaves;
    }

    public void setAmountOfLeaves(int amountOfLeaves) {
        this.amountOfLeaves = amountOfLeaves;
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }
}
