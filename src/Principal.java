public class Principal {
    public static void main (String []args){
    pEcuacion ec = new pEcuacion();
    double a=1.0,b=-2.0,c=4.0;
    ec.ecua_grado2(a,b,c);
    if (ec.r1 ==0){
        System.out.println("Las raices son imaginarias");
    }
    else {
        System.out.println(ec.r1);
        System.out.println(ec.r2);
    }
    }
}
