class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> mylist = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        mylist.add(first);
        if(numRows == 1){
            return mylist;
        }
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        mylist.add(second);
        if(numRows == 2){
            return mylist;
        }
        for(int i=0;i<numRows-2;i++){
           List<Integer> newlist = new ArrayList<Integer>();
            newlist.add(1);
            List<Integer> prevlist = mylist.get(mylist.size()-1);
           for(int j =0;j< prevlist.size()-1;j++){
               newlist.add(prevlist.get(j)+prevlist.get(j+1));
           }
           newlist.add(1);
           mylist.add(newlist);
            
        }
        return mylist;
    }
}
