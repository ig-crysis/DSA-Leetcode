import java.util.*;

class Maxproduct {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0], minProd = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) { 
                int temp = maxProd; 
                maxProd = minProd; 
                minProd = temp; 
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }

    public static void main(String[] args) {
        Maxproduct obj = new Maxproduct();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter values: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(obj.maxProduct(nums)); // 6
    }
}
