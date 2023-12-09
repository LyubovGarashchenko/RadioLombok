package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxCurrentStation;

    public Radio() {
    }

    public Radio(int currentRadioStation, int currentVolume, int maxCurrentStation) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
        this.maxCurrentStation = maxCurrentStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMaxCurrentStation() {
        return this.maxCurrentStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxCurrentStation(int maxCurrentStation) {
        this.maxCurrentStation = maxCurrentStation;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentRadioStation() != other.getCurrentRadioStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else {
                return this.getMaxCurrentStation() == other.getMaxCurrentStation();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        boolean prime = true;
        int result = 1;
        result = result * 59 + this.getCurrentRadioStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getMaxCurrentStation();
        return result;
    }

    public String toString() {
        int var10000 = this.getCurrentRadioStation();
        return "Radio(currentRadioStation=" + var10000 + ", currentVolume=" + this.getCurrentVolume() + ", maxCurrentStation=" + this.getMaxCurrentStation() + ")";
    }
}

