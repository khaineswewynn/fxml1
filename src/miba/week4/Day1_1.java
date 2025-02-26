package miba.week4;

public class Day1_1 {
	
	public static int findMax(int []data)
	{
		int max=data[0];
		int maxIndex=0;
		for(int index=1;index<data.length;index++)
		{
			if(max<data[index])
			{
				max=data[index];
				maxIndex=index;
			}
		}
		return maxIndex;
	}
	
	public static int findMax(int num1,int num2)
	{
		if(num1>num2)
			return num1;
		else
			return num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array declare
		int[] numbers= {14,56,100,34,120,13};
		int max_id=findMax(numbers);
		System.out.println(max_id);
		// find max number in array using findMax method 
		int num1=45;
		int num2=89;
		int max_value=findMax(num1,num2);
		System.out.println(max_value);
		System.out.println(Math.max(num1, num2));//Built in method
		int random_number=(int)(1+(Math.random()*50));
		System.out.println("random value \t\u0009"+random_number);
		
		String uni="MIBA University";
		System.out.println(uni.length());
		System.out.println(uni.charAt(5));
		System.out.println(uni.toLowerCase());
		System.out.println(uni.indexOf('i'));
		System.out.println(uni.lastIndexOf('i'));
	}

}
