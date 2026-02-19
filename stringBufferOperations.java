package textops;

public class StringBufferOperations{

private String str;

public StringBufferOperations(String str){
this.str=str;
}
public void exploreStringBufferMethods(String appendstr){
System.out.println("\n---StringBufferMethods---");

StringBuffer sb=new StringBuffer(str0;
 
System.out.println("Original StringBuffer(str);

sb.append(appendstr);
system.out.println("After append:"+sb);

sb.insert(0,"Start-");
system.out.println(After insert:"+sb);

sb.replace(0,5,"Begin");
System.out.println("After replace:"sb);

sb.delete(0,6);
System.out.println(after delete:"+sb);

sb.reverse();
system.out.println("after reverse:"+sb);

System.out.printl(