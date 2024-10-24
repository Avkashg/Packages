package Packs;
import Data.LiteData;
import TV.LiteTV;

public class LitePackage extends Package {
    public LitePackage() {
        this.data = new LiteData();
        this.tv = new LiteTV();
    }
}
