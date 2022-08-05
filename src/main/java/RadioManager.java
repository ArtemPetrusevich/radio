public class RadioManager {
    public int currentVolume;

    public int currentStation;

    public int getCurrentVolume() {


        return currentVolume;

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0)
            return;
        if (newCurrentVolume > 10){
            currentVolume = 10;
            return;}
        currentVolume = newCurrentVolume;

    }

    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0){
            currentStation = 0;
            return;}

        if (newCurrentStation > 9){
            currentStation = 9;
            return;}

        currentStation = newCurrentStation;
    }

    public void next() {
        currentStation++;
        if (currentStation > 9)
            currentStation = 0;
    }

    public void prev() {
        if (currentStation < 1) {
            currentStation = 9;
        } else {
            currentStation--;


        }
    }

    public void plusVolume() {
        currentVolume++;
        if (currentVolume > 10)
            currentVolume = 10;


    }

    public void minusVolume() {
        currentVolume--;
        if (currentVolume < 1)
            currentVolume = 0;

    }
}
