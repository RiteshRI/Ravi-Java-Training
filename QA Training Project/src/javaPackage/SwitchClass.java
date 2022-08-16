package javaPackage;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int offday=3;
        String day_name;
        
        switch(offday)
        {
        case 1:
            day_name="Monday";
            break;
            
        case 2:
            day_name="Tuesday";
            break;
            
        case 3:
            day_name="Wednesday";
            break;
            
        case 4:
            day_name="Thrusday";
            break;
            
        case 5:
            day_name="Friday";
            break;
        
        case 6:
            day_name="Saturday";
            break;
            
        case 7:
            day_name="Sunday";
            break;
            
        default:
            day_name="Invalid";
            
        }
        System.out.println(day_name);

	}

}

//want to discuss again, how (day_name) is related to day off

