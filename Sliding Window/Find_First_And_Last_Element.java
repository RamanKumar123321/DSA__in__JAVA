import java.util.*;
class SFind_First_And_Last_Element {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i] =sc.nextInt();
            }
            int target=sc.nextInt();
            int f=firstIndex(nums,target);
            int l=lastIndex(nums,target);
            System.out.println(f+ " " + l);
        }
        static int firstIndex(int nums[],int target){
            int l=0,r=nums.length-1, f=-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]==target){
                    f=mid;
                    r=mid-1;
                }
                else if(target>nums[mid])l=mid+1;
                else r=mid-1;
            }
            return f;
        }

        static int lastIndex(int nums[],int target){
            int l=0,r=nums.length-1, f=-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]==target){
                    f=mid;
                    l=mid+1;
                }
                else if(target>nums[mid])l=mid+1;
                else r=mid-1;
            }
            return f;

        }
    }
