package animals;


public class Cat{
    public   String name;
    public   int ageInMonths;
    public   Colors color;

    public  Cat(String name, int ageInMonths, Colors color){
        this.name=name;
        this.ageInMonths=ageInMonths;
        this.color=color;
    }

    public  void Meow(){
        System.out.println(name+" is meowing!");
    }

    public  void eat(String food){
        System.out.println(this.name+" is eating "+food);
    }

    public  String getInfo(){
        return "Name: "+name+"\nAge (in months): "+ageInMonths+"\nColor: "+color.toString();
    }
}
