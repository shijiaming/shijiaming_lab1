package project;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
  @RunWith(Parameterized.class)
public class Triangle_test {
	private int a,b,c;
	private String str =null;
 public Triangle_test(int a,int b, int c,String str) {
	 this.a=a;
	 this.b=b;
	 this.c=c;
	 this.str=str;
 }
	public Triangle triangle = new Triangle();
	
	@Parameters
	public static Collection<Object[]> getData(){
	return Arrays.asList(new Object[][]{
	{1,1,2,"������������"},
	{3,3,5,"����������"},
	{3,3,3,"�ȱ�������"},
	{3,8,10,"�ȱ�������"},
	});
	}
	@Test
	public void test() {
		assertEquals(this.str,triangle.triangle_shape(a,b,c));
	}

}
