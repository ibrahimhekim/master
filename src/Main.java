public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "ibrahim";
        String ogrenci2 = "sevda";
        String ogrenci3 = "mehtap";
        String ogrenci4 = "derin";

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "ibrahim";
        ogrenciler[1] = "sevda";
        ogrenciler[2] = "mehtap";
        ogrenciler[3] = "derin";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------");

        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
