import java.util.Scanner;
 class Emp1 {
	int id,sal;int tot;
	String nam;
	int bonus;
	int ta,da,hra;
	Emp1(int eid,String enam,int esal){
		id=eid;
		nam=enam;
		sal=esal;
		 ta=1000;
		 da=100;
		 hra=500;
		
		if(sal<8000)
			bonus=500;
		else if (sal<13000) {
			bonus=700;
		}
		else if (sal<18000) {
			bonus=900;
		}
		else if (sal<23000) {
			bonus=1100;
		}
		else {
			bonus=1500;
		}
	}
		void calcu()
		{
			tot=sal+bonus+da+hra;

		}
		void getData()
		{
			System.out.println("Name="+nam+"\nEmployee ID="+id+"\nEmployee Salary="+tot);

		}
	
}

public class Emp{
	public static void main(String args[]){
		
        Scanner s=new Scanner(System.in);
		
		System.out.println("How much Employees");
		int n=s.nextInt();
		String nm;
		int ed;
		int sa;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the  id,Name,salary");
			 ed=s.nextInt();
			nm=s.next();
			
			 sa=s.nextInt();
			Emp1 ei=new Emp1(ed,nm,sa);
			ei.calcu();
			ei.getData();
		}
	}
}


