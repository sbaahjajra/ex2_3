package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void testPartion1_1() 
	{
		//(-2,5,4)
		Roots.calculate_roots(-2, 5, 4);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void testPartion_a_min() 
	{
		//(0,5,4)
		Roots.calculate_roots(0, 5, 4);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	
	@Test
	public void testPartion_a_minplos() 
	{
		//(1,5,2)
		Roots.calculate_roots(1, 5, 2);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_a_nominal() 
	{
		//(3,10,2)
		Roots.calculate_roots(3, 10, 2);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_a_max() 
	{
		//(100,50,4)
		Roots.calculate_roots(100, 50, 4);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_a_maxminos() 
	{
		//(99,80,5)
		Roots.calculate_roots(99, 80, 5);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_b_min() 
	{
		//(5,0,4)
		Roots.calculate_roots(5, 0, 4);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	
	@Test
	public void testPartion_b_minplos() 
	{
		//(3,1,3)
		Roots.calculate_roots(3, 1, 3);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_b_nominal() 
	{
		//(4,4,4)
		Roots.calculate_roots(4, 4, 4);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_b_max() 
	{
		//(20,100,50)
		Roots.calculate_roots(20, 100, 50);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_b_maxminos() 
	{
		//(30,99,4)
		Roots.calculate_roots(30, 99, 4);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_c_min() 
	{
		//(3,4,0)
		Roots.calculate_roots(3, 4, 0);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	
	@Test
	public void testPartion_c_minplos() 
	{
		//(4,4,1)
		Roots.calculate_roots(4, 4, 1);
		
		String  root_expected = Root_Types.Equal_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_c_nominal() 
	{
		//(10,10,10)
		Roots.calculate_roots(10, 10, 10);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_c_max() 
	{
		//(40,40,100)
		Roots.calculate_roots(40, 40, 100);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	@Test
	public void testPartion_c_maxminos() 
	{
		//(3,5,99)
		Roots.calculate_roots(3, 5, 99);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}


	

	
	}
