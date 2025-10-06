class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        for (int i = 0; i < new_id.length(); i++) {
            char word = new_id.charAt(i);

            if (word == '.' || word == '-' || word == '_' || Character.isLetterOrDigit(word))
                sb.append(word);
        }

        // 3단계
        if (sb.length() != 0)
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == '.' && sb.charAt(i + 1) == '.')
                    sb.deleteCharAt(i--);
            }

        // 4단계
        if (sb.length() > 0 && sb.charAt(0) == '.')
            sb.deleteCharAt(0);
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.')
            sb.deleteCharAt(sb.length() - 1);

        // 5단계
        if (sb.length() == 0)
            sb.append("a");

        // 6단계
        if (sb.length() >= 16)
            sb.delete(15, sb.length());
        if (sb.charAt(sb.length() - 1) == '.')
            sb.deleteCharAt(sb.length() - 1);

        // 7단계
        if (sb.length() <= 2)
            while(true) {
                sb.append(sb.charAt(sb.length() - 1));

                if (sb.length() == 3)
                    break;
            }
        
        return sb.toString();
    }
}