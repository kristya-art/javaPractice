package j.strings;

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 */
public class FirstUniqueCharacterInString {
    public static void main(String[]args){
        long startTime = System.nanoTime();
      System.out.println(firstUniqChar("aadadaad")+ " expected = -1");
      System.out.println(firstUniqChar("llkom") + " expected = 2");
      System.out.println(firstUniqChar("jemes")+ " expected= 0");
      System.out.println(firstUniqChar("jejekk")+ " expected= -1");
      System.out.println(firstUniqChar("jjk")+ " expected = 2");
      System.out.println(firstUniqChar("lola")+" expected = 3");



       long stopTime = System.nanoTime();
       System.out.println(stopTime - startTime);
    }

    public static int firstUniqChar(String m){
        int l = m.length();
        int result=-1;
        int count = 0;

        StringBuilder s = new StringBuilder(m);

        if(l<=0){return 0;}

        for(int i=0;i<l;i++){
            if(s.charAt(i)==' '&&i!=l-1){continue;}
            if(i==l-1&&s.charAt(i)!=' '){
                result=i;
                return result;
            }

            count=0;
            for(int j=i+1;j<l;j++) {


                if (s.charAt(i) == s.charAt(j))
                {
                    s.setCharAt(j,' ');;

                }
                else if(s.charAt(i)!=s.charAt(j)&&s.charAt(i)!=' ') {
                    count = count + 1;
                    if (count == l - 1 - i ) {
                        result = i;
                        return result;

                    }
                }
                    else if(i==l-1||s.charAt(i)!=' '){
                        result=i;
                        return result;
                }

                }
            }
        return result;
        }
    }

