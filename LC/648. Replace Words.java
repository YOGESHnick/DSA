class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words=sentence.split(" ");
        for(int i=0;i<dictionary.size();i++){
            for(int j=0;j<words.length;j++){
                if(words[j].startsWith(dictionary.get(i))){
                    words[j] = dictionary.get(i);
                }
            }
        }
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            if(i!=words.length-1){
               sb.append(" ");
            }
        }
        return sb.toString();
    }
}
