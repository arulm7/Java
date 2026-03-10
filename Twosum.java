class TwoSum{ 
    public static void main(String args[]){
        int a[] = {2,7,11,15},i,j,target=9;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}