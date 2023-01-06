public class Water extends SuperPokemon {

    private boolean hasWaterCanon;
    private int volumeOfWater;

    public Water(String name, int healthPoints, String type, int experience, int level, boolean hasWaterCanon, int volumeOfWater) {
        super(name, healthPoints, type, experience, level);
        this.hasWaterCanon = hasWaterCanon;
        this.volumeOfWater = volumeOfWater;
    }

    @Override
    public void pound(){
        if (volumeOfWater >= 30){
            System.out.println(super.getName() + " don't want to do pound, used surf instead");
        this.volumeOfWater = volumeOfWater - 20;}
        else {super.pound();}
    }

    public void rainDance(){
        System.out.println(super.getName() + " used raindance, and gained 20 water druplets");
        this.volumeOfWater = volumeOfWater + 20;
    }

    public boolean isHasWaterCanon() {
        return hasWaterCanon;
    }

    public void setHasWaterCanon(boolean hasWaterCanon) {
        this.hasWaterCanon = hasWaterCanon;
    }

    public int getVolumeOfWater() {
        return volumeOfWater;
    }

    public void setVolumeOfWater(int volumeOfWater) {
        this.volumeOfWater = volumeOfWater;
    }
}
