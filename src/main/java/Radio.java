public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void NextCurrentStation() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void PrevCurrentStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void NextCurrentVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void PrevCurrentVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}


