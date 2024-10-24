import Packs.*; 
import Packs.Package;

public class Main {
    public static void main(String[] args) {
        String[] packages = {"Lite","Plus","Lite","Lite"};
        PackageFactory factory = new PackageFactory();

        for (String p:packages){
            Package pkg = factory.createPackage(p);
            if(pkg != null){
                System.out.println(p + pkg.toString());
            }else{
                System.out.println("Invalid package type.");
            }
        }
    }
}