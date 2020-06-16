public class Cat {
        private String name;
        private int appetite;
     boolean sitost = false;
        public Cat(String name,int appetite,boolean sitost){
            this.name = name;
            this.appetite = appetite;
            this.sitost = sitost;
        }



    public void eat(Plate p){

           if (p.getFood()<appetite){

               System.out.println("Cat "+name+ " do not eat  from " +p.toString() + " " + sitost);
        }
           else {
           p.setFood(p.getFood()-appetite);
           sitost = true;
               System.out.println("Cat "+name+ " eats from " +p.toString() + " " + sitost );
           }
        }


}
