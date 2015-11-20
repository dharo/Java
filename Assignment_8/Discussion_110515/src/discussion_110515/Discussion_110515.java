package discussion_110515;

public class Discussion_110515 {

    public static void main(String[] args) {
        Date a = new Date();
        Date b = new Date(a);
        
        System.out.println("object a: "+a.toString());
        System.out.println("object b: "+b.toString());
        
        b.setYear(2016);
        System.out.println("object b (year should be 2016): "+b.toString());
        
        System.out.println("Is this year a leap year: " + b.isLeapYear());
        System.out.println("Object b, end of feb:"+b.toString());
    }
    
}
