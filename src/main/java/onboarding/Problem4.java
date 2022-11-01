package onboarding;

public class Problem4 {
    public static String solution(String word) {
        // 알파벳이 소문자일 경우 반대로 바꿔주는 함수 changeLowerCase()
        // 알파벳이 대문자일 경우 반대로 바꿔주는 함수 changeUpperCase()

        // answer를 가변적인 클래스인 StringBuffer로 변경
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < word.length(); i++) {
            // 현재 index의 character가 소문자일 경우, changeLowerCase()에서 리턴된 character를 answer에 추가
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') answer.append(changeLowerCase(word.charAt(i)));
        }

        return answer.toString();
    }

    public static char changeLowerCase(char alphabet) {
        int start = 97;
        int end = 122;
        return (char)(end - (int)alphabet + start);
    }

}
