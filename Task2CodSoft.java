package task2codsoft;

import java.util.Scanner;

public class Task2CodSoft {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects.");
        int n = in.nextInt();
        
        double[] array = new double[n];
        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Enter the grade of subject " + (i + 1) + ":");
            double grade = in.nextDouble();
            array[i] = grade;
        }
        double tatalMarks = calculateTotalMarks(array);
        double aveargePercentage = calculateAveragePercentage(tatalMarks ,n) ;
         System.out.println("Your total grades : " + tatalMarks);
         System.out.println("Your average percentage : " + aveargePercentage);
         assignGrades(array);
         
    }
    
    public static double calculateTotalMarks(double[] array){
      double sum = 0 ;
      for(int i = 0 ; i < array.length ; i ++){
        sum += array[i]; 
      }  
        return sum ;
    }
    
    public static double calculateAveragePercentage(double num , int n){
      double averagePercentage = (num / n);
        return averagePercentage ;
    }
    
    public static void assignGrades(double[] array){
       for(int i = 0 ; i < array.length ; i ++){
        
           if(array[i] >= 90 )
               System.out.println("Your grade in subject " + (i + 1) +" is A");
           else if(array[i] >= 80 )
               System.out.println("Your grade in subject " + (i + 1) + " is B");
           else if(array[i] >= 70)
               System.out.println("Your grade in subject " + (i + 1) + " is C");
           else if(array[i] >= 60 )
               System.out.println("Your grade in subject " + (i + 1) + " is D");
           else
               System.out.println("Your grade in subject " + (i + 1) + " is F");
      }  
        
    }
}
