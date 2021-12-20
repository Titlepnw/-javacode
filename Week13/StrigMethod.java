package Week13;

public class StrigMethod {
    public static void main(String[] args) {
        String name = "Panuwat";
        String city =  new String ("Samut Sakhon");
        
        System.out.println(name);
        System.out.println(city);

        //การต่อสติง (.concat())
        System.out.println(name+city);

        String result = name+city;
        System.out.println(result);

        
        String result2 = name+city+".com";
        System.out.println(result2);

        System.out.println(result2+(".ac.th"));


        //หาความยาวของสตริง (.Length())
        System.out.println(name.length());
        System.out.println(city.length());


        int count = name.length();
        System.out.println(count);


        System.out.println(name.charAt(0));
        
        
        char characters = name.charAt(0);
        System.out.println(characters);


    }
}


