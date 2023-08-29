/*
 * class Fruit {
 *  public static final Fruit APLLE = new Fruit();
 *  public static final Fruit PEACH = new Fruit();
 *  public static final Fruit BANANA = new Fruit();
 */
enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    Fruit(String color) {
        this.color = color;
    }
}
//enum도 약속된 class이고 열거하는 class임, 위의 class Fruit랑 같은 의미임
/*
 * class Company {
 *  public static final Company GOOGLE = new Company();
 *  public static final Company APPLE = new Company();
 *  public static final Company ORACLE = nwe Company();
 */

enum Company {
    GOOGLE("Chrome", "G"), APPLE("Phone", "A"), ORACLE("Eclipse", "O");
    public String famous, first;
    Company(String famous, String first) {
        this.famous = famous;
        this.first = first;
    }
}

public class PracticeEnum {
    public static void main(String[] args) {

        Fruit type = Fruit.APPLE;
        switch(type) {
            case APPLE:
                System.out.println(57+" kcal, color: "+Fruit.APPLE.color);
                break;
            case PEACH:
                System.out.println(34+" kcal, color: "+Fruit.PEACH.color);
                break;
            case BANANA:
                System.out.println(93+" kcal, color: "+Fruit.BANANA.color);
                break;
        }

        for(Fruit f : Fruit.values()) {
            System.out.println(f);
        }
        System.out.println(Company.APPLE.famous + ", first :" + Company.APPLE.first);
    }
    
}
