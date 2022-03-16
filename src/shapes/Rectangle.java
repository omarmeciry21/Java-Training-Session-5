package shapes;


public class Rectangle{
    double width,height;

   public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    //Overloading
   public Rectangle(double squareSide){
        width=squareSide;
        height=squareSide;
    }

   public void printArea(){
        System.out.println("Area = "+(width*height));
    }
   public void printArea(boolean isSquare){
        if(isSquare){
            System.out.println("Area = "+width*width);
        }
        else{
            System.out.println("Area = "+height*width);
        }
    }
}