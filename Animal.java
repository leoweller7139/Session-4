public class Animal{
    public String name;
    public String type;
    public String attacks;

    // Constructor
    public Animal(String name, String type){
        this.name=name;
        this.type=type;
    }

    public void attacks(String p){
        System.out.println("The" + this.type + " " + this.name + "attacks " + p);
    }


}