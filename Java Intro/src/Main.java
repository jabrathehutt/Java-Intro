

public class Main {
    public static void main(String[] args) {
        //ganze Zahlen
        int w = 3;
        int x = 0;
        int y = 10;
        int z = -5;



        //Dezimalzahlen
        double x1 = 10.5;
        double y1 = -1.0;
        float z1 = 12.75f;

        //Arithmetik
       /* System.out.println(y + w);
        System.out.println(y * w);
        System.out.println(y / w);
        System.out.println(w * x1);
        System.out.println(10.0/3.0);*/

        //besondere Arithmetik
       /* System.out.println(y%w);//Modulo(Divisionsrest)
        y+=1; //y=y+1
        y++; //y=y+1
        System.out.println(y);
        System.out.println(Math.pow(y,2));*/// y hoch 2

        //Zeichen und Zeichenketten
       /* char x2 = 'a';
        char x3 = '7';
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x2+x3);
        String word = "Hello World!";
        System.out.println(word);
        String a1 = "Hello ";
        String b1="World!";
        System.out.println(a1+b1);
        System.out.println(x2+x3);*/


        //Booleanwerte (Wahrheitswerte)
/*        boolean isTrue=true;
        boolean isFalse=false;
        System.out.println(isTrue);
        System.out.println(!isTrue); // ! = not
        System.out.println(isTrue&&isFalse);
        System.out.println(isTrue||isFalse);*/
        // true und true = true, true und false=false, false und false = false
        // true oder true = true, true oder false = true, false oder false = false

        //logische Operation
     /*   System.out.println(y==w);
        System.out.println(y!=w);
        System.out.println(y>w);
        System.out.println(y>=w);
        System.out.println(y==10);
        System.out.println(y==w);*/

        //if else Bedingung
        if(y>=0){
            System.out.println("positiv");
        }
        else{
            System.out.println("negativ");
        }

        int gradCelsius=30;

        if(gradCelsius<20){
            System.out.println("kalt");

        }

        else if(gradCelsius>=20&&gradCelsius<30){
            System.out.println("warm");
        }

        else{
            System.out.println("heiß");
        }


        int grad=13;

        if(grad<20){
            System.out.println("kalt");

        }

        if(grad>=20||grad<15){
            System.out.println("warm");
        }

        else{
            System.out.println("heiß");
        }

        // Aufgabe: Schreibe ein Programm welches bestimmt ob die Variable v gerade oder ungerade ist

        int v = 10;
        int k = 5;

        if((v%2)==0){
            System.out.println("gerade");
        }

        else{
            System.out.println("ungerade");
        }





        //while Schleifen

        int counter = 0;

        while(counter<10){
            System.out.println(counter);
            counter++; // counter=counter+1
        }

    }
}