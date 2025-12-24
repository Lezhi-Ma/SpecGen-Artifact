public class LeapYearSeq {
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
    public  boolean isLeapYear(int year) {
        return ((year % 4 == 0) ? ((year % 100 == 0) ? ((year % 400 == 0) ? true : false) : true) : false);
   }
}
