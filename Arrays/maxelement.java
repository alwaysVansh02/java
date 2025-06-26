package Arrays;
public class onlyproblems {
public static void main(String[] args) {
int [] arr ={10,20,3,40,80,50};
int ans = 0;
for(int i = 0; i<arr.length; i++){
    if(arr[i]>ans){
        ans = arr[i];
    }
}
        System.out.println(ans);
    }
}
