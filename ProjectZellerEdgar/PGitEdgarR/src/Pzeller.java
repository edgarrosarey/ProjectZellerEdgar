
import java.util.Scanner;


//Edgar Rosa Rey
//proyecto dia internacional programador
//24-02-2021 Monlau 


public class Pzeller {

static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
       
    int day=04,month=01, year=2001;
    int ddmmyyyy;
    System.out.println("birth day? ddmmyyy: ");
    ddmmyyyy=keyboard.nextInt();

        day=ddmmyyyy/1000000;
        year=ddmmyyyy%10000;
        month=(ddmmyyyy/10000)%100;
        
    String stDat = birthDay_ZellerMonlau(day,month,year);
        System.out.println("International programmer's day: "+stDat+" sep2021");
        
        
    }

    private static String birthDay_ZellerMonlau(int day, int month, int year) {
      String[] ArrayWeek ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int a,y,m,d;
        a=(14-month) /12;
        y=year -a;
        m= month +12*a-2;
        d= (day+y+y/4-y/100+y/400+(31*m)/12)%7;
        
        return ArrayWeek[d];
    }
    
}
