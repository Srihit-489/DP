//500/596


class Solution {
    public int nthUglyNumber(int n) {
        if(n > 0 && n < 6){
            return n;
        }
        int count = n-5;
        int recent = 5;
        HashMap<Integer,Boolean> mylist = new HashMap<Integer,Boolean>();
        mylist.put(1,true);
        mylist.put(2,true);
        mylist.put(3,true);
        mylist.put(4,true);
        mylist.put(5,true);
        int runner = 6;
        while(count != 0){
            if(runner%2 == 0 && mylist.containsKey(runner/2)){
                count--;
                recent = runner;
                mylist.put(runner,true);
            }else if(runner%3 == 0 && mylist.containsKey(runner/3)){
                count--;
                recent = runner;
                mylist.put(runner,true);
            }else if(runner%5 == 0 && mylist.containsKey(runner/5)){
                count--;
                recent = runner;
                mylist.put(runner,true);
            }
            runner++;
        }
        return recent;
    }
}
