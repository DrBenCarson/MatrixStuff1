
public class MatrixMult {
	private static int jj[][];
	
public static int[][] mult(int a[][],int b[][])
{
	int mult1=0;
	int z=a.length;
	int zz=a[0].length;
	int y=b.length;
	int yy=b[0].length;
	int q, r;
	
	if(z<=y)
	{
		 q=z;
	}
	else
	{
		 q=y;
	}
	if (zz<=yy)
	{
		 r=zz;
	}
	else
	{
		 r=yy;
	}
	
	
	int l=0;
	jj=new int [q][r];
	for (int m=0;m<q-1;m++)
	{
		mult1=0;
		for (int n=0;n<q;n++)
		{
			mult1=0;
			for (l=0;l<r+2;l++)
			{
			mult1+=a[n][l]*b[l][m];
			}
			jj[n][m]=mult1;
		}
	}
	int ii[][]=jj;
	return ii;
	


}
}
