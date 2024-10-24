package Packs;
import Data.PlusData;
import TV.PlusTV;

public class PlusPackage extends Package {
    public PlusPackage() {
        this.data = new PlusData();
        this.tv = new PlusTV();
    }
}
