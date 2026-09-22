public class StringMathDemo {

 public static void main(String[] args) {
    String str1= "jidnyasa";
    String str2 ="Nil";
    String str3 = str1.concat(""+ str2);

    System.out.println("concatenation:" +str3);
    System.out.println("Length of str :"+ str1.length());
    System.out.println("character at index 2:"+str1.charAt(2));
    System.out.println("subtracting of str1(0-3):"+ str1.substring(0, 3));
    System.out.println("Equals? str1 and str2 :" +str1.equals(str2));
    System.out.println("uppercase str1:" + str1.toUpperCase());
    System.out.println("Lowercase str1:" + str1.toLowerCase());
    
    double a = 4.0;
    double b = 9.3 ;

    System.out.println("Square root of a:"+ Math.sqrt(a));
    System.out.println("a raised to b:"+ Math.pow(a,b));
    System.out.println("max of a and b:"+Math.max(a,b));
    System.out.println("min of a and b:"+ Math.min (a,b));
    System.out.println("random number(0-1):"+Math.random());
    System.out.println("random number(10-20):" +(15+ Math.random()*(20-10)));
    System.out.println("random number(1-100):" + ( 1+Math.random()* (100-1)));
    System.out.println("ceil of b:" +Math.ceil(b));
    System.out.println("floor of b :"+ Math.floor(b ));
    System.out.println("round of b:"+Math.round(b));

 
    
 }
}