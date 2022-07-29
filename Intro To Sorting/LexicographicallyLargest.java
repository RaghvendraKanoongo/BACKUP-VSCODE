public class LexicographicallyLargest {
    public static void main(String[] args) {
        solve("ittmcsvmoa_jktvvblefw");
    }
    static String solve(String str){

        boolean flag = false;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '_'){
                flag = true;
                i++;
            }
            if(!flag)
                str1 += str.charAt(i);// ittmcsvmoa
            else
                str2 += str.charAt(i);// daaz
        }   
        //
        //str1 = ittmcsvmoa
        //str2 = jktvvblefw
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = '_';
            int store = 0;
            
            for (int j = 0; j < str2.length(); j++) {
                if(char1<str2.charAt(j)){
                    if(char2<str2.charAt(j)){
                        store = j;//0
                        char2 = str2.charAt(j);//d
                        flag = false;
                    }
                }
                if(j == str2.length()-1 && !flag){
                    char1 = char2;
                    str1 = str1.substring(0,i) + char1 + str1.substring(i+1);
                    str2 = str2.substring(0,store)+'_'+str2.substring(store+1);
                    flag = true;
                }
            }
        }
        System.out.println(str1);
        return str1;
    }
}
