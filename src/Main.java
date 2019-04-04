import javax.management.AttributeList;

public class Main {

    public static void main(String[] args) {
        TextFil textFil=new TextFil() {
            @Override
            public String toString() {
                return super.toString();
            }
        };

        SuperBogListe superBogListe=new SuperBogListe(new AttributeList());
        superBogListe.addBog(new Bog(textFil,"Femto","Gren",0));
        System.out.println(superBogListe.getBog(0).toString());

    }
}
