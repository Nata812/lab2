
public class SimpleHashtable<T> implements ISimpleHashtable<T> {    //Iterable
	
	private int elemArr = 20;
	private int num = 0; 			// ���������� ���������� ��������
	private T[] keyArr; 				// ������ ������
	private T[] valueArr; 				// ������ ��������
	public void Array (int elemArr)	{		// ����������� 1
		keyArr = (T[]) new Object[elemArr];	
	}
	public void Array1 (int elemArr)	{		// ����������� 2
		valueArr = (T[]) new Object[elemArr];	
	}

	public T get(T key) {					// ����� ������� �� �����
		int e=0;	
		for(int i = 0; i <  keyArr.length; i++) {
			  if (keyArr[i] == key)  e=i;
			}
		System.out.println(valueArr[e]);
		return valueArr[e];
	}

	public void put(T key, T value) {		// ������ � ������� ������ �� ������ �����
		keyArr[num]=key;
		valueArr[num]=value;
		num++;
	}

	public T remove(T key) {				// ������� ������� � ������. 
		int i;
		for(i = 0; i <  keyArr.length; i++) {
			  if (keyArr[i] == key) 
				  for (int k=i; k<keyArr.length; k++) {
				  keyArr[k]=keyArr[k+1] ;	// �������� ��� �������� �������
				  valueArr[k]=valueArr[k+1];
				  }
			  else keyArr[i]=null;			// ���� ������ ���, ������� null
		} 
		return keyArr[i];
	}

	public int size() {
		return num;
	}
	
	public static void main(String[] args) {
		SimpleHashtable<Integer> element = new SimpleHashtable<Integer> ();
		int a1=12; int a2=234;
		int b1=34; int b2=655;
		int c1=67; int c2=578;
		element.put(a1,a2);
		element.size();
		element.put(b1,b2);
		element.size();
		element.remove(b1);
		element.size();
		element.get(c1);
	}
}
