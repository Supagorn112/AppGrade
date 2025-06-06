/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appgrade;

import java.util.Scanner;

/**
 *
 * @author 344_14
 */
public class AppGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int affective,work,exam,total;
        double grade = 0;
        Scanner scan = new Scanner(System.in);
        do{
        System.out.print("Enter affective : ");
        affective = scan.nextInt();
        }while(affective>20);
        do{
        System.out.print("Enter work : ");
        work = scan.nextInt();
        }while(work>40);
        do{
            System.out.print("Enter work : ");
        exam = scan.nextInt();
        }while(exam>40);
        total = affective+exam;
        if(total<50){
           grade=0.0;
        }else if (total<=54){
            grade=1.0;
        }else if (total<=59){
            grade=1.5;
        }else if (total<=64){
            grade=2.0;
        }else if (total<=69){
            grade=2.5;
        }else if (total<=74){
            grade=3.0;
        }else if (total<=79){
            grade=3.5;
        }else if (total<=100){
            grade=4.0;
        }
        System.out.println("total score : "+total);
        System.out.println("You have grade "+grade);
        // TODO code application logic here
    }
    
}
