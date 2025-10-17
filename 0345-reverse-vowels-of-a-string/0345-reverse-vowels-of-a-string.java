class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;

        while (i < j) {
            // move i forward until it finds a vowel
            if (!isVowel(a[i])) {
                i++;
                continue;
            }
            // move j backward until it finds a vowel
            if (!isVowel(a[j])) {
                j--;
                continue;
            }

            // both are vowels → swap
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
        return new String(a);
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
