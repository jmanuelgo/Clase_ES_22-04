public class pEcuacion {

        public double r1;
        public double r2;
    public  void ecua_grado2(double a, double b, double c){
        double d;
        double nu1,nu2,de;
        d= (b*b)- (4*a*c);
        if (d<0){
            nu1=-b+Math.sqrt(d);
            nu2=b+Math.sqrt(d);
            de= 2*a;
            r1=nu1/de;
            r2=nu2/de;

        }
        else {
          r1=0;
        }
    }

    }

