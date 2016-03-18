package project;

public class Triangle {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}
public static String triangle_shape(int a,int b,int c){
	int triangle[] = new int [4];
	triangle [0] = a;
	triangle [1] = b;
	triangle [2] = c;
	int min = triangle [0];
	boolean flag = true;
	while (flag)
	{
		flag = false;
		for(int i = 0; i < 2;i++){
			
			if(triangle[i]>triangle[i+1])
			{
				int m = triangle[i+1];
				triangle[i+1]=triangle[i];
				triangle[i] = m;
		        flag = true;
			}
				
		}
	}
	int m = triangle[0]+triangle[1];
	if(m<=triangle[2])
		return "它不是三角形";
	else{
		
	
	if(triangle[0]==triangle[1]&&triangle[1]==triangle[2]){
	return "等边三角形";
		
	}
	else if(triangle[0]==triangle[1]|| triangle[1]==triangle[2]) {
		return "等腰三角形";
	}
	else 
		return "不规则三角形";
	
}
 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = triangle_shape(3,2,2);
		System.out.println(str);

	}

}
