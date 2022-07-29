public class ChangeDateFormat {
    public static void main(String[] args) {

        String A = "14th Mar 2068"; // 2068-03-16
        System.out.println(solve(A));
    }

    static String solve(String s) {

        int len = 0;
        String date = "";
        String month = "";
        String year = "";

        if (s.length() == 13) {
            len = 1;
        }
        date = s.substring(0, 1 + len);
        if (date.length() == 1) {
            date = "0" + date;
        }
        month = s.substring(4 + len, 5 + len + 2);

        switch (month) {
        case "Jan":
            month = "01";
            break;
        case "Feb":
            month = "02";
            break;
        case "Mar":
            month = "03";
            break;
        case "Apr":
            month = "04";
            break;
        case "May":
            month = "05";
            break;
        case "Jun":
            month = "06";
            break;
        case "Jul":
            month = "07";
            break;
        case "Aug":
            month = "08";
            break;
        case "Sep":
            month = "09";
            break;
        case "Oct":
            month = "10";
            break;
        case "Nov":
            month = "11";
            break;
        case "Dec":
            month = "12";
            break;
        }
        year = s.substring(s.length() - 4, s.length());
        return year + "-" + month + "-" + date;

    }
}

