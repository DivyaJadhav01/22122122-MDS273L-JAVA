
import java.util.Scanner;
public class Lab01 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = obj.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(obj.nextLine());
        System.out.println("Enter your gender: ");
        //obj.next();//will read the "/n"
        String gender = obj.nextLine();
        System.out.println("Enter your reg. no.: ");
        int reg = Integer.parseInt(obj.nextLine());
        System.out.println("Enter your class: ");
        //obj.next();
        String Class = obj.nextLine();
        System.out.println("Enter las Semester marks: ");
        float marks = Float.parseFloat(obj.nextLine());
        System.out.println("Enter your State: ");
        String state = obj.nextLine();

        System.out.println("Student name : "+ name);
        System.out.println("sudent age : "+ age);
        System.out.println("sudent gender : "+ gender);
        System.out.println("sudent register number : "+ reg);
        System.out.println("sudent Class : "+ Class);
        System.out.println("Student marks: "+ marks);
        System.out.println("Student state: "+ state);

        
        if(gender.equals("f")){
            System.out.println("Female");
        }
        else{
            System.out.println("Male");
        }

        switch(state.toLowerCase()){
            case "karnataka":
                System.out.println("Student is from southern part of India");
                break;
            case "kerala":
                System.out.println("Student is from southern part of India");
                break;
            case "telangana":
                System.out.println("Student is from southern part of India");
                break;
            case "tamilnadu":
                System.out.println("Student is from southern part of India");
                break;
            case "andhra pradesh":
                System.out.println("Student is from southern part of India");
                break;
            case "goa":
                System.out.println("Student is from southern part of India");
                break;
            case "maharshtra":
                System.out.println("Student is from western part of India");
                break;
            case "rajasthan":
                System.out.println("Student is from western part of India");
                break;
            case "gujarat":
                System.out.println("Student is from western part of India");
                break;
            case "madhyapradesh":
                System.out.println("Student is from western part of India");
                break;
            case "west bengal":
                System.out.println("Student is from eastern part of India");
                break;
            case "orissa":
                System.out.println("Student is from eastern part of India");
                break;
            case "assam":
                System.out.println("Student is from eastern part of India");
                break;
            case "manipur":
                System.out.println("Student is from eastern part of India");
                break;
            case "sikkim":
                System.out.println("Student is from eastern part of India");
                break;
            case "meghalaya":
                System.out.println("Student is from eastern part of India");
                break;
            case "arunachal pradesh":
                System.out.println("Student is from eastern part of India");
                break;
            case "nagaland":
                System.out.println("Student is from eastern part of India");
                break;
            case "tirupura":
                System.out.println("Student is from eastern part of India");
                break;
            case "chattisgarh":
                System.out.println("Student is from eastern part of India");
                break;
            case "jharkhand":
                System.out.println("Student is from eastern part of India");
                break;
            case "panjab":
                System.out.println("Student is from nothern part of India");
                break;
            case "hariyana":
                System.out.println("Student is from nothern part of India");
                break;
            case "delhi":
                System.out.println("Student is from nothern part of India");
                break;
            case "uttar pradesh":
                System.out.println("Student is from nothern part of India");
                break;
            case "bihar":
                System.out.println("Student is from nothern part of India");
                break;
            case "uttarakhand":
                System.out.println("Student is from nothern part of India");
                break;
            case "himachal pradesh":
                System.out.println("Student is from nothern part of India");
                break;
            default :
                System.out.println("Student is from nothern part of India");
                break;




        }





    }
    
}
