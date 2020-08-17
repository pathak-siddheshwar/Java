class Example31{
    double h,w;
    String patientName;
    Example31(String patientName,double h,double w){
        this.h=h;
        this.w=w;
        this.patientName=patientName;
    }
    double computeBMI(){
        return w/(h*h);
    }


    public static void main(String[] s)
    {
        Example31 e=new Example31("Shraddha kapoor",1.65,52);
        System.out.println(e.patientName+" BMI report :"+e.computeBMI());

    }
}