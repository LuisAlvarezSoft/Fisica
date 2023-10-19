import java.io.IOException;
import java.util.List;
import java.util.Scanner;
public class MainPhysics {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Double F1 = null;
        Double F2 = null;
        Double F3;
        Double F3x = null;
        Double F3y = null;
        Double FR;
        Double tetaFR;
        double tetaFRf = 0;
        String FRr=null;
        Double FRx;
        Double FRy;
        int potenciaDe10 = 0;
        Integer k = (9*(10^9));
        PhInterface repo = new Servicio();
        Scanner s = new Scanner(System.in);
        System.out.println("Benvenute, por favor, ingrese la figurita :0 \n1. Cuadrado \n2.Triangulito \n:-0");
        String opcSwitch = s.next();
        switch (opcSwitch){
            case "1":{
                System.out.println("Ingrese el valor de Q1 (ingresar los valores en bases de 10)");
                Integer Q1 =Integer.parseInt(s.next());
                System.out.println("Ingrese el valor de Q2");
                Integer Q2 =Integer.parseInt(s.next());
                System.out.println("Ingrese el valor de Q3");
                Integer Q3 = Integer.parseInt(s.next());
                System.out.println("Ingrese el valor de Q4");
                Integer Q4 = Integer.parseInt(s.next());
                System.out.println("Ingrese la longitud de un lado");
                Integer longitud = Integer.parseInt(s.next());
                Integer angulo1 = 90;
                Integer angulo2 = 45;
                    System.out.println("Sobre cual se quiere ver las cosas al respecto \n1.Q1\n2.Q2\n3.Q3\n4.Q4 \n(toca cambiar varios textos q se me olvida como se llaman)");
                    String opcMolecula= s.next();
                    switch (opcMolecula){
                        case "1":{
                            if(Q1>0){
                            if (Q2>0){
                                F1 = (double) (k*-(Math.abs(Q1*Q2)/longitud^2));
                            }else if (Q2<0){
                                F1 = (double) (k*(Math.abs(Q2*Q1)/longitud^2));
                            }
                            if (Q3>0){
                                F2 = (double) (k*(Math.abs(Q1*Q3)/longitud^2));
                            }else if (Q3<0){
                                F2 = (double) (k*-(Math.abs(Q3*Q1)/longitud^2));
                            }
                            if (Q4>0){
                                F3 = (double) (k*(Math.abs(Q1*Q4)/longitud^2));
                                F3x = -(Math.cos(angulo2)*F3);
                                F3y = Math.sin(angulo2)*F3;
                            } else if (Q4<0) {
                                    F3 = (double) (k*(Math.abs(Q1*Q4)/longitud^2));
                                    F3x = Math.cos(angulo2)*F3;
                                    F3y = -(Math.sin(angulo2)*F3);
                            }
                            }else if (Q1<0){
                                if (Q2>0){
                                    F1 = (double) (k*(Math.abs(Q1*Q2)/longitud^2));
                                }else if (Q2<0){
                                    F1 = (double) (k*(-Math.abs(Q2*Q1)/longitud^2));
                                }
                                if (Q3>0){
                                    F2 = (double) (k*(-Math.abs(Q1*Q3)/longitud^2));
                                }else if (Q3<0){
                                    F2 = (double) (k*(Math.abs(Q3*Q1)/longitud^2));
                                }
                                if (Q4>0){
                                    F3 = (double) (k*(Math.abs(Q1*Q4)/longitud^2));
                                    F3x = Math.cos(angulo2)*F3;
                                    F3y = -(Math.sin(angulo2)*F3);
                                } else if (Q4<0){
                                        F3 = (double) (k*(Math.abs(Q1*Q4)/longitud^2));
                                        F3x = Math.cos(angulo2)*-F3;
                                        F3y = Math.sin(angulo2)*F3;
                                }
                            }
                            FRx=(F1+0+F3x);
                            FRy=(0+F2+F3y);
                            FR=(Math.sqrt((Math.pow(FRx,2))+(Math.pow(FRy,2))));

                                    while (FR >= 10.0) {
                                        FR /= 10.0;
                                        potenciaDe10++;
                                    }

                                    while (FR < 1.0) {
                                        FR *= 10.0;
                                        potenciaDe10--;
                                    }
                                    FRr=FR+"*"+10+"^"+potenciaDe10;
                                    tetaFR=(Math.atan(Math.abs(FRy/FRx)));
                                    if(FRy>0&&FR>0){
                                        tetaFRf=tetaFR;
                                    }else if (FRy<0&&FR>0){
                                        tetaFRf=270+tetaFR;
                                    } else if (FRy>0&&FRx<0) {
                                        tetaFRf=180-tetaFR;
                                    } else if (FRy<0&&FRx<0) {
                                        tetaFRf=180+tetaFR;
                                    }
                                System.out.println("El vector resultante es: ("+FRx+","+FRy+")\nLa magnitud es: "+FR+" y la direccion es: "+tetaFRf);

                        }
                        case "2":{

                        }
                        case "3":{

                        }
                        case "4":{

                        }
                    }
            }
        }
    }
}
