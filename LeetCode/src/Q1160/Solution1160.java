package Q1160;

import java.util.Objects;

public class Solution1160 {
    public static int countCharacters(String[] words, String chars) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char[] c=new char[chars.length()];
                for (int k = 0; k < chars.length(); k++) {
                    char[] a = words[i].toCharArray();
                    char[] b = chars.toCharArray();
                    int count = 0;
                    if (c[k]==1){
                        break;
                    }
                    if (Objects.equals(a[j], b[k])) {
                        c[k]=1;
                        count += 1;
                    }
                    if (count == words[i].length()) {
                        sum += count;
                        break;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat", "bt", "hat", "tree"},"atach"));
    }
}
