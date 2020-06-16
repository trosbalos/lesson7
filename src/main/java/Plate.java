public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(    ){
        System.out.println("plate amount "+ food);
    }
    public void nakladivaemedy(Plate p,int x){
        p.setFood(p.getFood()+x);
    }
}
