package Packs;
import Data.Data;
import TV.TV;

public class Package {
    public Data data;
    public TV tv;

    public int getDownloads() {
        return this.data.getDownloads();
    }

    public int getChannels() {
        return this.tv.getChannels();
    }

    public String toString(){
        return (" package has " + this.getDownloads() + " download and " + this.getChannels() + " channels"); //outputs information about the package
    }
}
