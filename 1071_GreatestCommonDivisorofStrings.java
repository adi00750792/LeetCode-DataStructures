class Solution {

    public static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int greatestCommonDivisorOfStringLength = findGcd(str1.length(), str2.length());
            return str1.substring(0, greatestCommonDivisorOfStringLength);
        } else {
            return "";
        }
    }
}