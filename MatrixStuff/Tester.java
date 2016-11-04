
public class Tester {

	public static void main(String[] args) {
		int aa[][]= {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
		int bb[][]= {{-1,3},{0,9},{1,-11},{4,-5}};
		int cc[][]={{0,3,5},{5,5,2}};
		int dd[][]={{3,4},{3,-2},{4,-2}};
		MatrixMult problem=new MatrixMult();
		int ff[][]=problem.mult(aa, bb);
		for (int v=0; v<ff.length;v++)
		{
			for (int w=0; w<ff[v].length;w++)
			{
				System.out.print(ff[v][w]+("\t"));
			}
			System.out.println(" ");
		}
		
	}

}
