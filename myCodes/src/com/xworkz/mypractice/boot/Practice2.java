package com.xworkz.mypractice.boot;

public class Practice2 {

	public static void main(String[] args) {
	String s1="Dinakar";//Literal object
	String s2="";//Empty String
	String s3=" ";//One White Space Literal
	String s4=new String("Dinakar");
	
	//Object create by using new keyword  
	
	//by using length() Method
	System.out.println("1.length() Method");
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(s3.length());
	System.out.println(s4.length());
	
	//By using isBlank() Method
	//System.out.println(s1.isBlank());
	//By using isEmpty Method
	System.out.println("2.isEmpty() Method");
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	System.out.println(s3.isEmpty());
	System.out.println(s4.isEmpty());
	
	//equals method
	System.out.println("3.equals method");
	if(s1==s4)
	{
		System.out.println("==");
	}
	else
	{
		System.out.println("Not equals");
	}
	if(s1.equals(s4))
	{
		System.out.println("equals");
	}
	else
	{
		System.out.println("Not equals");
	}
	
	String s5=new String("Java");
	String s6=new String("java");
	String s7=new String("PHP");
	
	//equalsIgnoreCase equals event adjust lower and upperCase letters
	System.out.println("4.equalsIgnoreCase Method");
	boolean result=s5.equalsIgnoreCase(s6);
	System.out.println(result);
	
	//CompareTo method compares which one is big   @lexicography
	
	System.out.println("5.compareTo Method");
	int result1=s5.compareTo(s7);
	System.out.println(result1);
	
	int result2=s5.compareTo(s5);
	System.out.println(result2);
	
	int result3=s7.compareTo(s5);
	System.out.println(result3);
	
	int result4=s6.compareTo(s5);
	System.out.println(result4);
	
	
	//compareToIgnore Method
	System.out.println("6.compareToIgnore method");
	int result5=s6.compareToIgnoreCase(s5);
	System.out.println(result5);
	
	//
	String s8=new String("Java");
	String s9=new String("phpjava");
	System.out.println("7.Strartswith method");
	boolean result6=s9.startsWith("php");
	System.out.println(result6);
	boolean result7=s9.startsWith("java");
	System.out.println(result7);
	
	System.out.println("8.Strartswith method");
	boolean result8=s9.endsWith("java");
	System.out.println(result8);
	boolean result9=s9.endsWith("php");
	System.out.println(result9);
	
	System.out.println("9.startswith(prefix,toff)");
	boolean result10=s9.startsWith("php",0);
	System.out.println(result10);
	
	System.out.println("10.contentEquals Method");
	boolean result11=s9.contentEquals(s9);
	System.out.println(result11);
	
	//
	StringBuffer s10=new StringBuffer("phpjava");
	System.out.println("11.contentEquals(StringBuffer) Method");
	boolean result12=s9.contentEquals(s10);
	System.out.println(result12);
	
	System.out.println("----------Searching Methods--------");
	System.out.println("12.Indexof Method");
	String i="Bengaluru City is a beautiful place";
	System.out.println("fisrt occurance of a:"+i.indexOf('a'));
	System.out.println("13.Indexof Method");
	System.out.println(i.indexOf("City"));
	System.out.println("14.Indexof Method");
	System.out.println(i.indexOf('u', 7));
	System.out.println("15.Indexof Method");
	System.out.println(i.indexOf("beautiful", 10));
	System.out.println("16.lastIndexof Method");
	System.out.println(i.lastIndexOf('a'));
	System.out.println("17.lastIndexof Method");
	System.out.println(i.lastIndexOf("place"));
	System.out.println("18.lastIndexof Method");
	System.out.println(i.lastIndexOf("is",5));
	System.out.println("19.lastIndexof Method");
	System.out.println(i.lastIndexOf('i',5));
	
	System.out.println("---------Character extraction--------");
	System.out.println("20.ChartAt Method");
	System.out.println(i.charAt(10));
	System.out.println("21.subString Method");
	System.out.println(i.substring(10));
	System.out.println("22.subString Method");
	System.out.println(i.substring(0, 10));
	System.out.println("23.subSequence Method");
	System.out.println(i.substring(0, 20));
	
	System.out.println("----------STring from String---------");
	String l=" Elephant ";
	System.out.println("23.toLowerCase MEthod");
	System.out.println(l.toLowerCase());
	System.out.println("24.toLowerCase Method");
	System.out.println(l.toUpperCase());
	System.out.println("25.length Method");
	System.out.println(l.length());
	System.out.println("26.Strip Method");
	//System.out.println(l.strip());
	System.out.println("27.Trim Method");
	System.out.println(l.trim());
	System.out.println(l.trim().length());
	System.out.println("28.Strip Method");
	//System.out.println(l.stripLeading());
	System.out.println("29.Trim Method");
	//System.out.println(l.stripTrailing());
	System.out.println("30.Repeate Method");
	//System.out.println(l.repeat(3));
	System.out.println("31.Indent Method");
	//System.out.println(l.indent(20));
	System.out.println("32.charArray Method");
	System.out.println(l.toCharArray());
	System.out.println("Index number of abouve tocharArray");
	//char[] p1=l.toCharArray();
	for(int p=0; p<l.toCharArray().length;p++)
	{
		System.out.println(p);
	}
	
	System.out.println("--------------ststic method,String regular expresiion, text processing,----------");
	System.out.println("33.matches Method");
	String m="Jhon Seena brother";
	System.out.println(m.matches("\\w{4} \\w{5}"));
	System.out.println("34.replace Method");
	System.out.println(m.replace('e', 'a'));
	System.out.println("35.replace Method");
	System.out.println(m.replace("eena", "ins"));
	System.out.println("36.replaceAll Method");
	System.out.println(m.replaceAll("Jhon Seena", "Jhony Sins"));
	System.out.println(m.replaceAll("\\s", "-"));
	System.out.println("37.replaceAll Method");
	System.out.println(m.replaceFirst("\\s", "-"));
	
	System.out.println("38.Split Method");
	String[] ii=i.split(" ");
	int len=ii.length;
	System.out.println("no of words:"+len);
	for(String ii2:ii)
	{
		System.out.println(ii2);
	}
	System.out.println("39.Split Method");
	String[] iii=i.split(" ", 3);
	for(String ii3:iii)
	{
		System.out.println(ii3);
	}
	System.out.println("40. join method");
	System.out.println(String.join("-","14","4","2002"));
	
	System.out.println("41.valueof method");
	int num=5;
	String num1=String.valueOf(5);
	System.out.println(num1+5);
	System.out.println(num+5);
	
	String str="5000";
	 int str1=Integer.valueOf(str);
	System.out.println(str1);
	System.out.println(555+str1);
	System.out.println(l+str1);
	//System.out.println(String.valueOf(true));
	
	System.out.println("42.contains method");
	System.out.println(i.contains("beautiful"));
	
	System.out.println("43.stringBuffer method");
	StringBuffer sb=new StringBuffer("Pollachi");
	System.out.println(sb.append(true));
	
	System.out.println("44.deletestringBuffer method");
	System.out.println(sb.deleteCharAt(4));
	
	System.out.println("45.reverse Method");
	System.out.println(sb.reverse());
	
	String z="Elephant"; 
	System.out.println(l.contains(z));
	
	
	StringBuffer name=new StringBuffer("Jayanth is a good boy");
	/*String[] value45=name.split(" ");
	System.out.println(name.substring(13, 17));
	for(String w:value45)
	{
		if(w.equals("good"))
			System.out.println(w);
	}
	String var=name.substring(13, 17);
	System.out.println(var);
	System.out.println("1.1.to reverse a string");
	for(int nm=name.length()-1; nm>=0;nm--)
	{
		System.out.print(name.charAt(nm));
	}
	System.out.println("2.1");
	for(int nm1=var.length()-1; nm1>=0;nm1--)
	{
		System.out.print(var.charAt(nm1));
	}*/
	
	}
}
