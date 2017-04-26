
public class Static {
	
	 int rollno;  
	    String name;  
	  static int count=0;
   static String collage="Static Collage";
   static String subject="Physics";
   static String Type="WE ARE ALL STUDENT";
  Static(){count++; System.out.println("Count value:"+count);}
   
   Static(int r, String n){ rollno=r;name=n; }
   
   static void change(){collage="change static collage";}
   
   void display()
    {System.out.println(rollno+"  "+name+"  "+collage+"  "+subject);
   
   }
  
  
   static int cube(int z){int result=z*z*z;
   System.out.println("Cube value:" +result);
   return result;}
   
   public static void main(String arg[]){
	   Static.cube(3);
	   Static.change();
	   Static obj=new Static(4,"Sagorika");
	   Static obj1=new Static(111,"Karon");
	   Static obj2=new Static(12,"Mitali");
	   obj.display();
	   obj1.display();
	   obj2.display();
	   
	   Static count1=new Static();
	   Static count2=new Static();
	   Static count3=new Static();
	   System.out.println(Type);
   }
   
   

}
