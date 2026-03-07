class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         int m = arr.length;
        int n=arr[0].length;
    
        // spiral print
        ArrayList<Integer>ans= new ArrayList<>();
        int minrow=0 ,maxrow =m-1;
        int mincol=0 ,maxcol=n-1;
 while(minrow<=maxrow && mincol<=maxcol){
    //left to right
     for(int j =mincol;j<=maxcol;j++){
        ans.add (arr[minrow][j]);
     }
     minrow++;
     // top to bottom
     if(minrow>maxrow || mincol>maxcol) break;
     for(int i=minrow;i<=maxrow;i++) {
                ans.add(arr[i][maxcol]);
     }
     maxcol--;
   //right to left
    if(minrow>maxrow || mincol>maxcol) break;
     for(int j =maxcol;j>=mincol;j--){
                 ans.add(arr[maxrow][j]);
     }
     maxrow--;
     // bottom to top
      if(minrow>maxrow || mincol>maxcol) break;
     for(int i=maxrow;i>=minrow;i--) {
        ans.add(arr[i][mincol]);
     }  mincol++;
 }
return ans;
    }}


        
    