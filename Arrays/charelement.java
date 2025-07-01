package Arrays;
public class onlyproblems {
public static void main(String[] args) {
    char [][] arr= new char[2][3];
    arr[0][0]= 'a';
    arr[0][1]= 'b';
    arr[0][2]= 'c';
    arr[1][0]= 'd';
    arr[1][1] = 'e';
    arr[1][2] = 'f';
    for(int i =0;i<arr.length;i++){
        for(int j =0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
}
}
