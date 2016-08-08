public class ArrangeNumbersToFormLargestNumber {
private static class Sort implements Comparable {
String number;
public Sort(String aa) {
number = aa;
}
@Override
public int compareTo(Object b) {
String firstNumber = number + ((Sort) b).number;
String secondNumber = ((Sort) b).number + number;
return secondNumber.compareTo(firstNumber);
}
}

private static void sort(String arr[]) {
if(arr == null || arr.length == 0)
return;
int length = arr.length;
List<sort> list = new ArrayList<sort>();
for(int i = 0; i < length; ++i) {
list.add(new Sort(arr[i]));
}
Collections.sort(list);
Iterator<sort> it = list.iterator();
while(it.hasNext()) {
System.out.print(it.next().number);
}
}
public static void main(String[] args) {
String arr[] = {"54", "1","546", "548", "60"};

sort(arr);
System.out.println();
String arr1[] = {"34", "3", "98", "9", "76", "45", "4"};
sort(arr1);
}
}
