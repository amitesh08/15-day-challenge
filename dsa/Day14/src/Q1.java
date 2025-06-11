public class Q1 {
    public static void main(String[] args) {
        //
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";

        int plen = 0;
        while (true){
            if(plen < strs[0].length()){
                boolean matches = true;
                char ch = strs[0].charAt(plen);

                for (int i = 1; i < strs.length ; i++) {
                    if(plen < strs[i].length() && strs[i].charAt(plen) == ch){
                        //do nothing
                    }else {
                        matches = false;
                        break;
                    }
                }
                if(matches){
                    plen++;
                }else {
                    break;
                }
            }else{
                break;
            }
        }
        return strs[0].substring(0,plen);
    }
}
