package Packs;

public class PackageFactory {
    public Package createPackage(String type) { //creates relevant package based on String input
        if (type.equals("Lite")) {
            return new LitePackage();
        } else if (type.equals("Plus")) {
            return new PlusPackage();
        }
        return null;
    }
}
