package myprojectrutuja;

public class demo {
	void mydem()
	{
		int a[]= {1,2,3,4,5};
		int i;
		int n;
		for(i=0;i<a.length;i++)
		{
			n=a[i];
			int cnt=0;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.println("prime="+a[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.mydem();

	}

}
