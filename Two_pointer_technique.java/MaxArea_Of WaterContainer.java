package Two_pointer_Technique;

public class Container_withMost_Water_Area {
    public int maxarea(int[] height){
        int l =0, r = height.length-1,maxarea= 0;
        while (l<r){
            int len = r-l;
                    int hei= Math.min(height[l],height[r]);
            int curarea = len * hei;
            maxarea = Math.max(maxarea,curarea);
            if (height[l]<height[r]){
                l++;
            }
            else
                r--;
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,48,3,7};
        Container_withMost_Water_Area obj = new Container_withMost_Water_Area();
        System.out.println("Max Area:" +  obj.maxarea(height));
    }
}
