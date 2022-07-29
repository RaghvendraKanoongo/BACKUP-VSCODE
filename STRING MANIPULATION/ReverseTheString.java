class ReverseTheString {
    public static void main(String[] args) {
        System.out.println();
        StringBuffer str = new StringBuffer("lahc laah ayk iahb aah");
        /////                                lahc laah ayk iahb aah 
        System.out.println(solve(str));
        
    }
    static StringBuffer solve(StringBuffer str){
        StringBuffer finalStr = new StringBuffer();
        int count = 0;
        int store = 0;
        StringBuffer tempStr = new StringBuffer();
        for (int i = 0; i < str.length()/2; i++) {
            swap(str, i, str.length()-i-1);
        }
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            
            // if(str.charAt(i) != ' '){
            //     count = i+1-store;
            // }
            // else{//lahc laah ayk iahb aah
            //     for (int j = store; j <(count)/2; j++) {
            //         swap(str, store, count-1-j);
            //         store++;
            //     }
            //     store = count+2;
            // }
        }
        return str;
    }

    static void swap(StringBuffer str, int i, int j){
        
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
}
