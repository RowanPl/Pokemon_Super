public class Fire extends SuperPokemon {

    private double temp;
    private String food;

    public Fire(String name, int healthPoints, String type, int experience, int level, double temp, String food) {
        super(name, healthPoints, type, experience, level);
        this.temp = temp;
        this.food = food;
    }
    @Override
   public void pound(){
        System.out.println(super.getName() + " does not know pound, try flamethrower");
   }
    public void flameThrower(){
        System.out.println(super.getName() + " does flamethrower");
    }
    public void eat(){
        System.out.println(super.getName() + " eats " + food);
    }



    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
