class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();
         for( int num :nums)
         {
            if(num >0)
            {
                list1.add(num);
            }else{
                list2.add(num);
            }
         }

         // merge both arraylist

         int[] arr = new int[nums.length];
         int i=0;
         int j=0;

         for(int k =0;k<nums.length;k++)
         {
            
            if(k%2 ==0)
            {
                arr[k] = list1.get(i++);
                
            }else{
                arr[k] = list2.get(j++);
                
            }
         }
        return arr;
    }
}