class Employee implements java.io.Serializable;
{
  int empid;
String ename;
double salary;
public Employee(){}
public Employee(in emoid,String ename,double salary)
{
this.empid=empid;
this.ename=ename;
this.salary=salary;
}
public void setempid(int empid){this.empid=empid};
public void setempid(String ename){this.ename=ename};
public void setempid(double salary){this.salary=salary};
public int getempid(){return empid;}
public string getename{return ename;}
public Double getsalary{return salary;}
}