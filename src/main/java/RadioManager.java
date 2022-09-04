public class RadioManager {
    private int currentVolume;
    private int minVolume;

    private int maxVolume;
    private int minStation;
    private int maxStation;
    private int currentStation;


    public RadioManager(int maxStation) {
        minStation = 0;
        this.maxStation = maxStation--;
        minVolume = 0;
        maxVolume = 100;
        this.maxStation = maxStation;
        currentStation = minStation;
        System.out.println(currentStation);
        System.out.println(currentVolume);


    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume)
            return;
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public int getCurrentVolume() {


        return currentVolume;

    }
    public int getCurrentMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            currentStation = minStation;
            return;
        }

        if (newCurrentStation > maxStation) {
            currentStation = maxStation;
            return;
        }

        currentStation = newCurrentStation;
    }

    public void next() {
        currentStation++;
        if (currentStation > maxStation)
            currentStation = minStation;
    }

    public void prev() {
        if (currentStation < 1) {
            currentStation = maxStation;
        } else {
            currentStation--;


        }
    }

    public void plusVolume() {
        currentVolume++;
        if (currentVolume > maxVolume)
            currentVolume = maxVolume;


    }

    public void minusVolume() {
        currentVolume--;
        if (currentVolume < 1)
            currentVolume = 0;

    }
}
