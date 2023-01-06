public class SuperPokemon {


        private int healthPoints;
        private String type;
        private int experience;
        private int level;
        private String name;


    public SuperPokemon(String name,int healthPoints, String type, int experience, int level ){
        this.healthPoints = healthPoints;
        this.type = type;
        this.experience = experience;
        this.level = level;
        this.name = name;
    }

    public void pound(){
        System.out.println(name + " does pound");
    }
    public void scratch(){
        System.out.println(name + " does scratch");
    }



    public int getHealthPoints() {
        return healthPoints;
    }

    public String getType(){
        return type;
    }

    public int getExperience(){
        return experience;
    }

    public int getLevel(){
        return level;
    }

    public void setHealthPoints(int hp) {
        healthPoints = hp;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setExperience(int exp){
        experience = exp;
    }

    public void setLevel(int lvl){
        level = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
