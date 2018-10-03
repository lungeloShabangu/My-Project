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
public class MyClass {
   //Squares START
      public void printSquareStar(int row)
      {
          System.out.println("SQUARE STAR PATTERN");
           for(int i = 0; i < row; i++){
            /* Column iterator for loop */
            for(int j = 0; j < row; j++){
                System.out.print("*");
            }
            System.out.print("\n");
            }
    }
    public void printHallowSquare(int row){
        System.out.println("HALLOW SQUARE PATTERN");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
              System.out.print("\n");
        } 
    }
    public void printHallowSquareDiagononal(int row){
        
    }
    
//Squares End
    
   
     //Rhombus START
        
      public void printRhombus(int n){
        System.out.println("THE STAR PATTERN OF RHOMBUS");
                for (int i = 1; i <= n; i++)
        {
            // Print space
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }

            // Print n stars
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
    
    public void printHallowRhombus(int n){
        System.out.println("PRINTING HALLOW RHOMBUS");
              for (int i = 1; i <= n; i++)
        {
            // Print space
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= n; j++)
            {
                // Print '*' for boundaries
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
    public void printMirroredRhombus(int size){
        System.out.println("PRINTING MIRRORED RHOMBUS STAR PATTERN");
           for (int row = 0;row < size ; row++){
           //first print the space
           for (int space = size - row ; space < size ; space ++){
               System.out.print(" ");
           }
           //print the character
           for (int i = 0 ; i<size ; i++){
               System.out.print("*");
           }
           //add a newline
           System.out.println();
             System.out.print("\n");
       }

    }  
   public void printMirroredHallowRhombus(int n){
      System.out.println("PRINTING MIRRORED HALLOW RHOMBUS");
       for(int i=1;i<=n;i++)
          {
             for(int j=i;j>0;j--)
             {
               System.out.print(" ");
             }
	     if(i==1 || i==n)
               for(int j=1;j<=n;j++)
               {
                  System.out.print("*");
               }
               else
                {
                     for(int j=1;j<=n;j++)
                    {  
                       if(j==1 || j==n)
                         System.out.print("*");
                              	
                       else
                       System.out.print(" ");
                     }
                }
                            System.out.println();
                       
           }           
       
   }
    //Rhombus END
 
   //Right-Angled START
   //1
    public void printRightAngle(int row){
        System.out.println("RIGHT ANGLE  TRIANGLE PATTERN");
           for (int i = 1; i < row; i++)   
        { 
            for (int j = i; j < row; j++)
        { 
            System.out.print(""); 
        } 
        for (int k = 1 ; k <(i*2); k++) 
            System.out.print("*"); 
        System.out.println("\n");   
      }
    } 
    //2
   public void printInvertedRightAngledTriangle(int n){
       System.out.println("PRINTING INVERTED RIGHT ANGLE TRIANGLE");
               for (int i = n; i >= 1; i--)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
      }
   //3
   public void printMirrorInvertedRightTriangle(int n){
       System.out.println("PRINTING MIRROR INVERTED RIGHT TRIANGLE"); 
       for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = i; k <= n; k++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
   }
   //4
   public void printHallowInvertedMirroredRightAngleTriangle(int n){
        System.out.println("PRINTING HALLOW INVERTED MIRRORED RIGHT TRIANGLE");
                for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = i; k <= n; k++) {
                // Print '*' for boundaries
                if (i == 1 || k == i || k == n) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
   //5
   public void printHallowRightAngleTriangle(int height){
       System.out.println("PRINTING HALLOW RIGHT ANGLE TRIANGLE");
             for ( int i=1 ; i<=height ; i++ ) {
         for ( int j=1 ; j <= i ; j++ ) {
            if(i==1 || i==2 || i==height || j==1 | j==i)
              System.out.print("*");
            else 
              System.out.print(" ");
         }
         System.out.println();
             }
   }
   //6
    public void printMirroredRightAngleTriangle(int n){
            System.out.println("PRINTING MIRRORED RIGHT ANGLE TRIANGLE");
            for (int i = 1; i <= n; i++)
            {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
                    
            // Loop for printing '*'
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
 //8
   //public void print(){}
   //7
   public void printHallowMirroredRightAngleTriangle(int n){
      System.out.println("PRINTING HALLOW MIRRORED RIGHT ANGLE TRINAGLE"); 
      for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = 1; k <= i; k++)
            {
                // Print '*' for boundaries
                if (i == n || k == 1 || k == i) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            // Move to the next row
            System.out.print(System.lineSeparator());
        }
   }
      public void printHallowInvertedRightAngleTriangle(int n){
          System.out.println("PRINTING HALLOW INVERTED RIGHT ANGLE TRIANGLE");
           for (int i = n; i >= 1; i--)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                {
                    // Print '*' for boundaries
                    if (i == n || j == 1 || j == i) {
                        System.out.print('*');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
            // Move to the next line
            System.out.print(System.lineSeparator());
        }
          
      }
   //Right-Angled END
 
   //Pyramids
    public void printPyramidStar(int row){
        
        //Right Angled Triangles
        System.out.println("PYRAMID STAR PATTERN");
	 for (int i = 1; i < row; i++)   
        { 
            for (int j = i; j < row; j++)
        { 
            System.out.print(" "); 
        } 
        for (int k = 1 ; k <(i*2); k++) 
            System.out.print("*"); 
        System.out.println("\n"); 
        }
    }
    public void printHalfDiamondStar(int n){
         System.out.println("PRINTING HALF DIAMOND");
        int columns = 1;
            for (int i=1;i<n*2;i++) {
                for (int j = 1; j <= columns; j++) {

                    System.out.print("*");
                }
                if (i < n)
                {
                    columns++;
                }
                else
                {
                    columns--;
                }
                System.out.println();
            }
            
    }
        public void printMirroredHalfDiamond(int n){
            System.out.println("PRINTING MIRRORED HALF DIAMOND");
            int spaces = n-1;
            int stars = 1;
            for (int i = 1; i < n * 2; i++)
            {
                System.out.print(" ");
                for (int j = 1; j <= spaces; j++)
                    System.out.print(" ");
                for (int j = 1; j <= stars; j++)
                        System.out.print("*");
          
                    //Console.WriteLine(" ");
            
                if (i < n)
                {
                    stars++;
                    spaces--;
                }
                else
                {
                    stars--;
                    spaces++;
                }          
                System.out.println();
            }

        }
        public void printHalowInvertedPyramid(int n){
            System.out.println("PRINTING HARLOW INVERTED PYRAMID");
            
            int i,j;

            for (i = n; i >= 1; i--)
            {
                for (j = i; j < n; j++)
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= (2 * i - 1); j++)
                {
                    if (i == n || j == 1 || j == (2 * i - 1))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        public void printHallowPyramid(int n){
            System.out.println("PRINTING HALLOW PYRAMID");
            int i, space,star = 0;
            for (i = 1; i < n; i++)
            {
                for (space = 1; space <= n - i; space++)
                {
                    System.out.print(" ");

                }
                while (star != (2 * i - 1))
                {
                    if (star == 0 || star == 2 * i - 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    star++;
                }
                star = 0;
                System.out.println();
            }
            for (i = 0; i < 2 * n - 1; i++)
            {
                System.out.print("*");

            } 
        }
        
        public void printInvertedPyramid(int n){
            System.out.println("\nPRINTING INVERTED PYRAMID\n");
              int i, j, k;
		for (i = 0; i < n; i++)
                  {
                    for (j = 0; j < i; j++)
                        {

                            System.out.print(" ");

                        }
                    for (k = 0; k < n; k++)
                    {
                        System.out.print(" * ");
                    }
                        n--;
                System.out.println();
                 
                 }
        }

}