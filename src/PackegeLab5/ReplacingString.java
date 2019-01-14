package PackegeLab5;

public class ReplacingString {
        String replace (String str1, String pattern, String replace) {
        int start = 0;
        int pos = 0;
        StringBuffer result = new StringBuffer();

        while((pos=str1.indexOf(pattern,start))>=0)
        {
            result.append(str1.substring(start, pos));
            result.append(replace);
            start = pos + pattern.length();
        }
        result.append(str1.substring(start));
        return result.toString();
    }
}
