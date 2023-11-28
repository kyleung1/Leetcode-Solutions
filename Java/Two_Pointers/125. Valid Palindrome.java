package Java.Two_Pointers;

class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr = s.toCharArray();
        String fixedStr = "";

        for (char c : charArr) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixedStr += c;
            }
        }

        fixedStr = fixedStr.toLowerCase();
        int front = 0;
        int back = fixedStr.length() - 1; 

        while (front <= back) {
            if (fixedStr.charAt(front) != fixedStr.charAt(back)) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }
}