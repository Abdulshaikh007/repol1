kl/class Test{
public static void main(String args[]){
      int arr[]={10,-20,30,-40,50,-60,70,-80};
      int n=arr.length;
      int temp;
      int start=0; 
      int end=n-1;
      while(start<end){
          if(arr[start]>0 & arr[end]<0){
           temp=arr[end];
           arr[end]=arr[start];
           arr[start]=temp;      
          start++;
          end--; 
         }
        if(arr[start]>0 & arr[end]>0){
           end--;
      }
        if(arr[start]<0 & arr[end]<0){
           end--;
      }
        if(arr[start]<0 & arr[end]>0){
        start++;
        end--;
}
}
  
        for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
 }
}
}