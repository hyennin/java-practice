import java.util.Scanner;
public class Rectangle {
    int width;
    int height;

    public int getArea(){
        return width * height;
    }

    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.println(">> ");

        rect.width = scan.nextInt();
        rect.height= scan.nextInt();

        System.out.println("사각형의 면적은 "+rect.getArea());
    }
}
