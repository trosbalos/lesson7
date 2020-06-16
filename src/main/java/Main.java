

public class Main {
    public static void main(String[] args) {
        Cat barsik1 = new Cat("Barsik1",5,false);
        Cat barsik2 = new Cat("Barsik2",5,false);
        Cat barsik3 = new Cat("Barsik3",5,false);
        Cat barsik4 = new Cat("Barsik4",5,false);
        Cat barsik5 = new Cat("Barsik5",5,false);
        Plate miska1 = new Plate(3);
        Plate miska2 = new Plate(6);
        Plate miska3 = new Plate(7);
        Plate miska4 = new Plate(8);
        Plate miska5 = new Plate(9);



        miska1.info();
        miska2.info();
        miska3.info();
        miska4.info();
        miska5.info();

        barsik1.eat(miska1);
        barsik2.eat(miska2);
        barsik3.eat(miska3);
        barsik4.eat(miska4);
        barsik5.eat(miska5);

        miska1.info();
        miska2.info();
        miska3.info();
        miska4.info();
        miska5.info();
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Рыжик",10,false);
        cats[1] = new Cat("Серик",5,false);
        cats[2] = new Cat("Бобик",10,false);
        Plate vedro = new Plate(16);

        for (int i = 0; i <3; i++) {
            cats[i].eat(vedro);
            vedro.info();
            
        }
        vedro.nakladivaemedy(vedro,40);
        vedro.info();



    }
} 
