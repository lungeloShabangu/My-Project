/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatterns;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class StarPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MyClass myObj= new MyClass();
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
       //Squares
        myObj.printSquareStar(rows);
        myObj.printHallowSquare(rows);
        
        
        //Rhombus
        myObj.printRhombus(rows);
        myObj.printHallowRhombus(rows);
        myObj.printMirroredHallowRhombus(rows);
        myObj.printMirroredRhombus(rows);
        
        //Right-Angled Triangle
        myObj.printHallowInvertedMirroredRightAngleTriangle(rows);
        myObj.printHallowRightAngleTriangle(rows);
        myObj.printInvertedRightAngledTriangle(rows);
        myObj.printRightAngle(rows);
        myObj.printMirrorInvertedRightTriangle(rows);
        myObj.printMirroredRightAngleTriangle(rows);
        myObj.printHallowMirroredRightAngleTriangle(rows);
        myObj.printHallowInvertedRightAngleTriangle(rows);

      //Pyramids
      myObj.printPyramidStar(rows);
      myObj.printHalfDiamondStar(rows);
      myObj.printMirroredHalfDiamond(rows);
      myObj.printHalowInvertedPyramid(rows);
      myObj.printHallowPyramid(rows);
      myObj.printInvertedPyramid(rows);
    }
}