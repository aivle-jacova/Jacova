// 코드 처리하기
class Solution1 {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            String c = String.valueOf(code.charAt(i));
            if(mode == 0) {
                if(c.equals("1")) {
                    mode = 1;
                } else {
                    if(i % 2 == 0) {
                        ret += c;
                    }
                }
            } else {
                 if(c.equals("1")) {
                    mode = 0;
                } else {
                     if(i % 2 == 1) {
                        ret += c;
                    }
                }
            }
        }
        
        if(ret.isEmpty()) {
            return "EMPTY";
        }
        
        return ret;
    }
}