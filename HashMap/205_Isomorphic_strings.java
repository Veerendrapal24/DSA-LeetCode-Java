import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set2 = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))==true){
                Character m = map.get(s.charAt(i));
                if(m!=t.charAt(i)) return false;
                else map.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(set2.contains(t.charAt(i))==true) return false;
                else map.put(s.charAt(i),t.charAt(i));set2.add(t.charAt(i));
            }

        }
        return true;

    }
}