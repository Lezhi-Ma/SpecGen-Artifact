public class LeapYear {
    /*@ requires 0 < year; 
    {| 
       @    requires year % 4 != 0; 
       @    ensures \result == false;
       @ also
       @     requires year % 4 == 0 && year % 100 != 0;
       @     ensures \result == true;
       @ also
       @     requires year % 4 == 0 && year % 100 == 0 && year % 400 != 0;
       @     ensures \result == false;
       @ also
       @     requires year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
       @     ensures \result == true;
    |} @*/
    public /*@ pure @*/ boolean isLeapYear(int year) {
        boolean leap = false;
         
        if (year % 4 == 0)
        {
            if ( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
	
	return leap;
   }
}
