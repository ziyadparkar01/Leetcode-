class Solution {
    public boolean isValid(String word) {
if (word.length()<3) {
            return false;
        }
        char t = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch>='0'&&ch<='9') {
                continue;
            } else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                    if (t==0||t==2) {
                        t+=1;
                    }
                } else {
                    if (t==0||t==1) {
                        t+=2;
                    }
                }
            } else {
                return false;
            }
        }
        return t==3;
    }
}
