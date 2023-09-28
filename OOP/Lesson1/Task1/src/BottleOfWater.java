public class BottleOfWater extends Product{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        CheckVolume(volume);
    }

    public BottleOfWater(String brand, String name, double price, int volume){
        super(brand, name, price);
        CheckVolume(volume);
    }

    private void CheckVolume(int volume){
        if (volume < 1){
            if (this.volume >= 1){
                return;
            }
            else {
                this.volume = 1;
            }
        }
        else {
            this.volume = volume;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("[ВОДА] %s - %s - %.2f - объем: %d", brand, name, price, volume);
    }
}
