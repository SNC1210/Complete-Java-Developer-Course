public class jaggedArray {
    public static void main(String[] args) {
        int nums[][]= new int[3][];//jagged array 
        int nums1[][][] = new int[3][4][5];//3Dimensional array
        //defining the numer of rows for ech array
        nums[0] =new int[3];
        nums[1]= new int[4];
        nums[2]= new int[5];

        //getting the random values in the array

        for (int i=0;i< nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j]= (int)(Math.random()*10);
            }
        }

        //printing the array values
        for(int n[] : nums)
        {
            for(int m:n)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }

    }
}
