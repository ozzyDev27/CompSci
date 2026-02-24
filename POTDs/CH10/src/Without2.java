class Without2 {
    public static String without2(String str) {
        if (str.length()==2) return "";
        if (str.length()<2) return str;
        if (str.substring(str.length()-2).equals(str.substring(0,2))) {
            return str.substring(2);
        }
        return str;
    }
}