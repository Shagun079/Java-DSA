package conditionalsStatements;

public class code1 {
    public static void main(String[]args){
        int marks = 91;
        if(marks>90){
            System.out.println("Excellent");
        }
        else if(marks>80&&marks<=90){
            System.out.println("good");
        }
        else if(marks>70&&marks<=80){
            System.out.println("fair");
        }
        else if(marks>60&&marks<=70){
            System.out.println("meet Expectations");
        }
        else if(marks<=60){
            System.out.println("below percentage");
        }
        else{
            System.out.println("enter a number ");
        }
    }
}
