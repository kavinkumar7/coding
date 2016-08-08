import java.util.LinkedHashMap;

import java.util.Map;

import java.util.Map.Entry;

public class misndup {

void method(int a[])

{

LinkedHashMap<integer, integer=""> lm=new LinkedHashMap();

int l=a.length;

for(Integer i=1;i<=l;i++)

{

lm.put(i, -1);

}

for(Integer j:a)

{

if(lm.get(j)!=-1)

lm.put(j, lm.get(j)+1);

else

lm.put(j,1);

}

System.out.println(lm);

for(Map.Entry<integer, integer=""> e: lm.entrySet())

{

if(e.getValue().intValue()>1)

System.out.println("duplicateditem"+e.getKey());

if(e.getValue().intValue()==-1)

System.out.println("missingitem"+e.getKey());

}

}

public static void main(String[] args) {

int a[]={4,2,2,1,3,6};

misndup ms=new misndup();

ms.method(a);

}

}
