

public class SortColors 
{
	public int[] sortColors(int[] nums)
	{
		int left = 0;
		int right = nums.length - 1;
		int i = 0;
		
		while(i<=right && left < right)
		{
			if(nums[i]==0)
			{
				swap(nums,i,left);
				i++;
				left++;				
			}
			else if(nums[i]==1)
			{
				i++;
			}
			else
			{
				swap(nums,i,right);
				right--;
			}
			i++;
		}
		
		return nums;
	}
	
	public void swap(int[] nums, int i, int j)
	{
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	
	public static void main(String [] args)
	{
		SortColors sc = new SortColors();
		int[] color = {2,0,2,1,1,0};
		int[] res = sc.sortColors(color);
		for(int i=0; i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}
