 class simple{
    int p,t,r;
    int calculation(int p,int t,int r){
        return (p*t*r)/100;
    }
}

public class interest extends simple{
    public static void main (String[] args){
        interest s=new interest();
        s.p=100;
        s.t=1;
        s.r=2;
    int result=    s.calculation(s.p,s.t,s.r);
    System.out.println("si is "+result);
    }
}