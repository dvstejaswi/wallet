package col;
import java.util.Comparator;
public class IntegerComparator implements Comparator<Integer> {
	public int compare(Integer num1, Integer num2) {
		//int num1=(int)o1;
		//int num2=(int)o1;
		if(num1>num2)
		{
			return 1;
		}
		if (num1<num2) {
			return -1;
		}
		else 
			return 0;
	}
}
