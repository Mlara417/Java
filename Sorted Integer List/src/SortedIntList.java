import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedIntList extends IntList {

	public SortedIntList(int size) {
		super(size);		
	}
	
	public void add(int value)
	{
		if (numElements == list.length)
		{
			System.out.println("Can't add, list is full");
		}
		else
		{
			for (int i = 0; i < list.length; i++)
			{
				if (value < list[i] || i == numElements)
				{
					for (int j = list.length - 2; j >= i; j--)
					{
						list[j + 1] = list[j];
					}
					list[i] = value;
					numElements++;
					break;
				}
			}
		}
	}
	
	public String toString()
	{
		return "Sorted list:\n" + super.toString();
	}
}
