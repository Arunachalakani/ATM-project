
package ATMpack;
import java.util.*;

public class atmproject{
public static void main(String[] args){

HashMap<Integer,signup> hm=new HashMap<Integer,signup>();

HashMap<Integer,String> hm2=new HashMap<Integer,String>();

HashMap<Integer,Integer> hm3=new HashMap<Integer,Integer>();

Scanner input=new Scanner(System.in);

boolean op=true;
while(op){
System.out.println();
System.out.println();
System.out.println("    Welcome to the ATM    ");
System.out.println();
System.out.println("1. signup");
System.out.println("2. login");         
System.out.println("3. exit");
System.out.println();
System.out.println();

int y=0;
System.out.println("Enter the number");
int num=input.nextInt();
switch(num)
{
case 1:
{
System.out.println("Enter the acc number");
int accno=input.nextInt();

System.out.println("Enter the name");
input.nextLine();
String name=input.nextLine();  
                                                
System.out.println("Enter the address");
String address=input.nextLine();
System.out.println("Enter the phone number");
long phno=input.nextLong();
System.out.println("Enter the balance");
int bal=input.nextInt();
		

if(hm.containsKey(accno)){
System.out.println("This account was already created");
}
else
{
hm.put(accno,new signup(name,address,phno,bal));
hm3.put(accno,bal);
System.out.println("  Sucessfully signup is conformed  ");
}
}
break;





case 2:
{
System.out.println("Enter the acc number");
int accno=input.nextInt();
System.out.println("Enter the username");
String username=input.next();
int count=0;
for(Map.Entry<Integer,signup> ss:hm.entrySet())
{
if((ss.getKey()==accno) && (ss.getValue().getname().equals(username)))
{
count++;
}
}

if(count==1)
{
System.out.println("  Sucessfully login is conformed  ");
}

else {
System.out.println(" incorrect Username&Password");
}

boolean oi=true;
int dep=0;
int with=0;
while(oi)
{
System.out.println();
System.out.println();
System.out.println("    Welcome to the ATM    ");
System.out.println();
System.out.println("1. Deposite ");
System.out.println("2. Withdraw");
System.out.println("3. Balance");
System.out.println("4. Exit");
System.out.println();



System.out.println("Enter the choice");
int choice=input.nextInt();
switch(choice)
{
case 1:
{
System.out.println("ENter the deposite amount");
dep=input.nextInt();
int re=0;
for(Map.Entry a:hm3.entrySet()){
if(a.getKey().equals(accno)) 
{
re=(Integer) a.getValue();
}
}
int g=dep+re;
hm3.put(accno,g);
}
break;
case 2:
{
System.out.println("ENter the withdraw amount");
with=input.nextInt();
int res=0;


for(Map.Entry b:hm3.entrySet()){
if(b.getKey().equals(accno)){
res=(Integer) b.getValue();
}
}

if(res<with){
System.out.println("Your account has low value");
}
else if(res>with)
{
System.out.println();
int g=res-with;
hm3.put(accno,g);

System.out.println();
System.out.println("please collect your money");
System.out.println();

}

}//case 2--------->close
break;


case 3:
{
System.out.println();

System.out.println();
System.out.println("    Welcome to the ATM    ");
System.out.println();
System.out.println("Deposite : "+dep);
System.out.println("Withdraw : "+with);

for(Map.Entry uu:hm3.entrySet())
{
if(uu.getKey().equals(accno)) 
{

System.out.println("Balance  : "+uu.getValue());
dep=0;
with=0;
System.out.println();
System.out.println();
}

}
}

break;

case 4:
{
oi=false;
}
break;



}  //switch(choice)--->   close



}   //while loop------>  close



}
break;

     


case 3:
{
op=false;
}
break;

}  //switch

}  //while


   }
}


















































//  original program 



/*
package ATMpack;
import java.util.*;

public class atmproject{
public static void main(String[] args){

HashMap<Integer,signup> hm=new HashMap<Integer,signup>();

HashMap<Integer,String> hm2=new HashMap<Integer,String>();

Scanner input=new Scanner(System.in);

boolean op=true;
while(op){
System.out.println();
System.out.println();
System.out.println("    Welcome to the ATM    ");
System.out.println();
System.out.println("1. signup");
System.out.println("2. login");
System.out.println("3. exit");
System.out.println();
System.out.println();

System.out.println("Enter the number");
int num=input.nextInt();
switch(num)
{
case 1:
{
System.out.println("Enter the acc number");
int accno=input.nextInt();

System.out.println("Enter the name");
input.nextLine();
String name=input.nextLine();  
                                                
System.out.println("Enter the address");
String address=input.nextLine();
System.out.println("Enter the phone number");
long phno=input.nextLong();
			

if(hm.containsKey(accno)){
System.out.println("This account was already created");
}
else
{
hm.put(accno,new signup(name,address,phno));
System.out.println("  Sucessfully signup is conformed  ");

}



}
break;

case 2:
{
System.out.println("Enter the acc number");
int accno=input.nextInt();
System.out.println("Enter the username");
String username=input.next();
int count=0;
for(Map.Entry<Integer,signup> ss:hm.entrySet())
{


if((ss.getKey()==accno) && (ss.getValue().getname().equals(username)))
{
count++;
}
}

if(count==1)
{
System.out.println("  Sucessfully login is conformed  ");
}

else {
 System.out.println(" incorrect Username&Password");
}

boolean oi=true;
//int balance=500;
int dep=0;
int with=0;
while(oi)
{
System.out.println();
System.out.println();
System.out.println("    Welcome to the ATM    ");
System.out.println();
System.out.println("1. Deposite ");
System.out.println("2. Withdraw");
System.out.println("3. Balance");
System.out.println("4. Exit");
System.out.println();



System.out.println("Enter the choice");
int choice=input.nextInt();
switch(choice)
{
case 1:
{
System.out.println("ENter the deposite amount");
dep=input.nextInt();
balance=dep+balance;
hm2.put(accno,balance);
}
break;

case 2:
{
System.out.println("ENter the withdraw amount");
with=input.nextInt();

if(balance<with)
{
System.out.println("Your account has low value");
}
else if(balance>with)
{
System.out.println("please collect your money");
System.out.println();
balance=balance-with;
hm2.put(accno,with);
}

}//case 2--------->close
break;


case 3:
{
System.out.println();

for(Map.Entry<Integer,String> uu:hm2.entrySet<Integer,String>())
{


if((uu.getKey()==accno) && (uu.getValue().getname().equals(username)))
{

System.out.println();
System.out.println("    Welcome to the ATM    ");
System.out.println();
System.out.println("Deposite : "+dep);
System.out.println("Withdraw : "+with);
System.out.println("Balance  : "+balance);
System.out.println();
System.out.println();
}
}


}
break;

case 4:
{
oi=false;
}
break;



}  //switch(choice)--->   close



}   //while loop------>  close



}
break;

     
  



case 3:
{
op=false;
}
break;

}  //switch

}  //while


   }
}

*/