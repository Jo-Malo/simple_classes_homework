public class Waterbottle {
    public int volume;

    public Waterbottle(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }
    public int getDrink() {
        if (this.volume > 0) {
            this.volume -= 10;
        }
        return this.volume;
    }

    public int getEmpty() {
        if (this.volume > 0) {
            this.volume = 0;
        }
        return this.volume;
    }

    public int getFilled(){
        if (this.volume < 100) {
            this.volume = 100;
        }
        return this.volume;
    }

}
