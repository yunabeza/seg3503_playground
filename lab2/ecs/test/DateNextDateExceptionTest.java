import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
    private int year;
    private int month;
    private int day;
    private String message;

    public DateNextDateExceptionTest(int year, int month, int day, String message){
        this.year = year;
        this.month = month;
        this.day = day;
        this.message =message;
    }

    @Parameters
	public static List<Object[]> data( )
	{
		List<Object[]> params = new LinkedList<Object[]>();
        params.add(new Object[] {1500,2,31,new String("day must less than 28 for month February on a non leap year.")});
		params.add(new Object[] {1500,2,29,new String("day must less than 28 for month February on a non leap year.")});
		params.add(new Object[] {-1,10,20,new String("year must be greater or equal to 0.")});
        params.add(new Object[] {1458,15,12,new String("month must be between 1 and 12.")});
        params.add(new Object[] {1975,6,-50,new String("day must greater or equal to 1.")});
		return params;
	}

    @Test
	public void Except_test1()
	{
		Assert.assertThrows(message,IllegalArgumentException.class,()->{new Date (this.year,this.month,this.day);});
	}

}