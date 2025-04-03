import java.util.Scanner;

class String_Input{

    public static void print(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // String str = "mansha";
        // print(str);
        // String name;
        
        // Scanner sc = new Scanner(System.in);
        //name = sc.next();  // only print first word tony
        // System.out.println("first name : ");
        // name = sc.nextLine(); // can takef full word tony kakkar
        // System.out.println( name);
       // System.out.println(name.length());

        //concatenation
        // String name2;
        // System.err.println("second name :");
        // name2 = sc.nextLine();
        // String fullname = name + "" + name2;
        // System.out.println( name2);
        // System.out.println("concated name :" + fullname);

        //print index value
       // System.out.println("index value" + fullname.charAt(0));

        //String comparison
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
        // if(s1==s2){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("no equal");
        // }

        if(s1.equals(s3)){
            System.out.println("equal");
        }else{
            System.out.println("no equal");
        }

        

    }
}