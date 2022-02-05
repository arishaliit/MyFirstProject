public class MyFirstClass {

    public int a;

    public int transform(int a){
        return a*3+4;
    }

    public static void main(String[] args) {

        MyFirstClass mfc = new MyFirstClass();
        mfc.a = mfc.transform(7);
        mfc.a = mfc.transform(mfc.a);
        System.out.println("Transforming a "+mfc.a);
    }

}
