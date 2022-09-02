package thuchanh1;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal=new FactoryAnimal();
        Animal a1=factoryAnimal.getAnimal("feline");
        System.out.println("a1 sound:"+a1.makeSound());
        System.out.println("--------------");
        Animal a2=factoryAnimal.getAnimal("Canine");
        System.out.println("a2 sound:"+a2.makeSound());
    }
}
