class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return Collections.emptyList();
        }
        return pad("",digits);
    }
    
    public List<String> pad(String p, String up){
        if(up.isEmpty()){
            List<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String>list = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        if(digit == 7  ){
            for(int i = (digit-2)*3;i<=(digit-1)*3;i++){
                char ch= (char)('a'+i);
                list.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else if(digit == 8 ){
            for(int i = (digit-2)*3+1;i<=(digit-1)*3;i++){
                char ch= (char)('a'+i);
                list.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else if(digit == 9 ){
            for(int i = (digit-2)*3+1;i<=(digit-1)*3+1;i++){
                char ch= (char)('a'+i);
                list.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else{
            for(int i = (digit-2)*3;i<(digit-1)*3;i++){
                char ch= (char)('a'+i);
                 list.addAll(pad(p+ch,up.substring(1)));
            }
        }
        return list;
    }
}
