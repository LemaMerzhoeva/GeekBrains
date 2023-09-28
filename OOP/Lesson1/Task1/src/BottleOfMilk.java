public class BottleOfMilk extends Product{

    private int volume;
    private int fat;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        CheckVolume(volume);
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        CheckFat(fat);
    }

    public BottleOfMilk(String brand, String name, double price, int volume, int fat){
        super(brand, name, price);
        CheckVolume(volume);
        CheckFat(fat);
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

    private void CheckFat(int fat){
        if (fat < 0){
            if (this.fat >= 0){
                return;
            }
            else {
                this.fat = 0;
            }
        }
        else {
            this.fat = fat;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("[МОЛОКО] %s - %s - %.2f - объем: %d - жирность: %d", brand, name, price, volume, fat);
    }

}
