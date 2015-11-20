package discussion_110515;

public class Date {
    private int month;
    private int day;
    private int year;
    
    private static final int[] daysInMonth = 
            { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    // no argument constructor
    public Date()
    {
        this.month = 2;
        this.day = 27;
        this.year = 1801;
    }
    
    // constructor with parameters: month, day, year
    public Date(int month, int day, int year)
    {
        if ( setMonth(month) == false )
        {
            throw new IllegalArgumentException("Invalid month: "+month);
        }
        if ( setDay(day) == false )
        {
            throw new IllegalArgumentException("Invalid day: "+day);
        }
        if ( setYear(year) == false )
        {
            throw new IllegalArgumentException("Invalid year: "+year);
        }
    }        
    
    // copy constructor
    public Date(Date original)
    {
        this.month = original.month;
        this.day = original.day;
        this.year = original.year;
    }
    
    // setMonth method
    public boolean setMonth(int month)
    {
        boolean result = false;
        if ( month >= 1 && month <= 12 ) 
        {
            this.month = month;
            result = true;
        }        
        return result;
    }
    
    // setDay method
    public boolean setDay(int day)
    {
        boolean result = false;
        boolean leapYear; // divisible by 4
        
        // borrowed from:
        // http://introcs.cs.princeton.edu/java/12types/LeapYear.java.html
        leapYear = (this.year % 4 == 0);

        // divisible by 4 and not 100
        leapYear = leapYear && (this.year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        leapYear = leapYear || (this.year % 400 == 0);
        
        int daysInCurrentMonth = this.daysInMonth[this.month-1];
        if ( this.month == 2 && leapYear ) daysInCurrentMonth=29;
        
        if ( day >= 1 && day <= daysInCurrentMonth )
        {
            this.day = day;
            result = true;
        }
        return result;
    }
    
    // setYear method
    public boolean setYear(int year)
    {
        boolean result = false;
        
        if ( year >= 0 && year <= 9999 )
        {
            this.year = year;
            result = true;
        }
        return result;
    }
    
    // getMonth
    public int getMonth()
    {
        return this.month;
    }
    
    // getDay
    public int getDay()
    {
        return this.day;
    }
    
    // getYear
    public int getYear()
    {
        return this.year;
    }
    //next day/next month/ next year
    public void nextDay(){
        boolean endOfMonth = (this.day == daysInMonth[this.month - 1]);
        //this method will take the current day and make it the next day
        //this method will make sure the next date is valid by performing 2 tasks
            //1. If day is greater than possible for that month, it will increment month AND reset day to 1
            //2. If day and month is greater than possible, increment year AND reset day to 1
        
        if(this.month == 2 && this.day == 28 && isLeapYear() == true)
            setDay(this.day+1);         //add one day to date, set day will check if it is valid.
        else if(this.month == 2 && this.day == 29){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 1 && endOfMonth == true){
            //next month AND setDay to 1
        }
        else if(this.month == 3 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 4 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 5 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 6 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 7 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 8 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 9 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 10 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 11 && endOfMonth == true){
            //nextMonth AND setDay to 1
        }
        else if(this.month == 12 && endOfMonth == true){
            //nexthMonth, nextYear, AND setDay to 1
        }
        
        
        
        
        
    }
    
    //method for checking if year is a leap year
    public boolean isLeapYear(){
        boolean isLeap;
        isLeap = (this.year % 4 == 0);
        

        // divisible by 4 and not 100
        isLeap = isLeap && (this.year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        isLeap = isLeap || (this.year % 400 == 0);
        
        return isLeap;
    }
    
    //previous day/previous month/previous year
    @Override
    public String toString()
    {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
}
