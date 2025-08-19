package SuperKeyword.collection3;

public class mainClass {

    public static void main(String[] args) {

        SuperKey superk = new SubClass();
        superk.A=54;
        System.out.println(superk.A);
        superk.assign(546);
        System.out.println(superk.A);


        SubClass subC = new SubClass();
        subC.A=475;
        System.out.println(subC.A);
        subC.assign(7714);
        System.out.println(subC.A);

//        System.out.println(super.assign(657));
//        System.out.println(.assign());


    }


}
