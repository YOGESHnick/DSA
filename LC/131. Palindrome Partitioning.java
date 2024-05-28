class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> bucket = new ArrayList<>();
        function(0,s,bucket,res);
        return res;
    }
    public void function(int index,String s, List<String> bucket, List<List<String>> res){
        if(index == s.length() ){
            res.add(new ArrayList<>(bucket) );
            return;
        }
        for(int i=index;i<s.length();i++){
            if( isPallindrome(s,index,i) ){
                bucket.add(s.substring(index,i+1));
                function(i+1,s,bucket,res);
                bucket.remove(bucket.size()-1);
            }
        }
    }
    boolean isPallindrome(String s, int start, int end){
        while(start<=end){
            if( s.charAt(start++) !=s.charAt(end--) ){
                return false;
            }
        }
        return true;
    }
}
