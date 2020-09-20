import java.util.*;
import java.io.*;
public class jukebox1
{
ArrayList<String> data=new ArrayList<String>();
public static void main(String args[])
{
new jukebox1().go();
}
public void go()
{
getdata();
System.out.println(data);
Collections.sort(data);
System.out.println(data);
}
void getdata()
{
try
{
File file=new File("data.txt");
BufferedReader reader=new BufferedReader(new FileReader(file));
String line = null;
while((line = reader.readLine())!=null)
{
adddata(line);
}
}
catch (Exception ex)
{
ex.printStackTrace();
}
}
void adddata(String lineToParse)
{
String[] tokens=lineToParse.split(" ");
data.add(tokens[0]);
}
}