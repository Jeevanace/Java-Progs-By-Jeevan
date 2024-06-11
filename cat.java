class cats{
    public void meow(){
        System.out.println("Meowing");
    }
    public void eat(){
        System.out.println("Eating");
    }
}

  class kittens extends cats{
        public void baby(){
            System.out.println("Babies of cat");
        }
        public void size(){
            System.out.println("Small in size");
        }
  }



public class cat {
    public static void main(String[] args) {
        kittens k = new kittens();
        k.meow();
        k.eat();
        k.baby();
        k.size();
    }
}
