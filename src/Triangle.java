public class Triangle {
    private int a,b,c;
    Triangle(){}
    Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String getTriangle(){
        if(a+b>c && a+c>b && b+c>a){
            boolean canhAB = a == b;
            boolean canhBC = b == c;
            boolean canhAC = a == c;
            if(canhAB || canhAC || canhBC){
                if(canhAB && canhBC){
                    return "equilateral triangle";
                }else {
                    return "isosceles triangle";
                }
            }else {
                return "regular triangle";
            }
        }else {
            return "No triangle";
        }
    }
}
