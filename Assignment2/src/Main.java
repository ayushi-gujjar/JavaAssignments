
public class Main {
    public static void main(String[] args) {
        checkForAZ("qwertyuiopasdfghjklzxcvbnm");
        checkForAZ("sjfhskjhfks");
    }

   public static void checkForAZ(String str){
       boolean[] alphaList = new boolean[26];
       int index = 0;
       int flag = 1;
       for (int i = 0; i < str.length(); i++) {
           if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
               index = str.charAt(i) - 'a';
           }
           alphaList[index] = true;
       }
       for (int i = 0; i <= 25; i++) {
           if (alphaList[i] == false)
               flag = 0;
       }
       System.out.print(str + " : ");
       if (flag == 1)
           System.out.print("\nString matches the pattern.\n ");
       else
           System.out.print("\nString does not match the pattern.\n ");
        System.out.println();
    }

}