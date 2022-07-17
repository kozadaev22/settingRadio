public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxSatation = 9;
    private int maxVolume = 10;
    public Radio(){
        maxSatation = 9;
    }
    public Radio(int stationsCount) {
        maxSatation = stationsCount - 1;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxSatation) {
            return;
        }
        this.currentStation = currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
    public void increaseStation() {
        if (currentStation < maxSatation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxSatation;
        }
    }
}