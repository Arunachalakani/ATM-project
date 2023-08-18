package ATMpack;

import java.util.*;
public class signup{


private String name;
private String address;
private long phno;
private int bal;


signup(String n,String a,Long p,int bal)
{
this.name=n;
this.address=a;
this.phno=p;
this.bal=bal;
}

public String getname(){
return name;
}
public String getaddress(){
return address;
}
public long getphno(){
return phno;
}
public int getbal(){
return bal;
}



}   //class