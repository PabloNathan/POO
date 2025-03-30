package java_poo_1;

public class Controller {

    public static void main(String[] args){
        Pen p1 = new Pen();

        p1.color = "blue";
        p1.tip = 0.5f;
        p1.capped = false;

        System.out.println(p1.color);
    }

}
