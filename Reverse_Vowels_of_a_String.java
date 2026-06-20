public class Reverse_Vowels_of_a_String {
    public static void  main(String args[]) {
        String s="IceCreAm";
        int p=s.length()-1;
        int o=0;
        StringBuilder sb=new StringBuilder(s);
        while(o<p){
            if(!("AEIOUaeiou".contains(String.valueOf(s.charAt(o))))){
                o++;
            }
            if(!("AEIOUaeiou".contains(String.valueOf(s.charAt(p))))){
                p--;         
            }
            if(("AEIOUaeiou".contains(String.valueOf(s.charAt(o)))) && ("AEIOUaeiou".contains(String.valueOf(s.charAt(p)))) ){
                    sb.setCharAt(o,s.charAt(p));
                    sb.setCharAt(p,s.charAt(o));
                    o++;
                    p--;

            }
        }
        System.out.print(sb.toString());
    }
}