package com.company;

import static java.lang.Math.sqrt;

public class MultAdd {

        public static double multAdd(double a, double b, double c) {
        //Først inddelte jeg funktionen fra opgaven i "a", "b" og "c",så vi kan benytte "multAdd" som efterspurgt i opgaven.
                return a*b+c;
                //Her foregik inddelingen i parametrene.
        }

        public static double log20(double number) {
        //Her blev vi nødt til at oprette en funktion til at udregne "log20".
                //Jeg måtte spørge om hjælp fra Mikkel/TutorBoye, og fik det forklaret løbende, hvordan funktionen skulle oprettes.
                return Math.log(number)/Math.log(20.0);
                //Der bliver bedt om en "return", så funktionen kan bruges sammen med andre funktioner.
        }

        public static double expSum(double x) {
        //a=x, b=e^-x, c=sqrt(1-e^-x).
                double a=x;
                //"a" bliver sat lig med "x".
                double b=Math.exp(-x);
                //"b" bliver sat lig med matematik-funktionen.
                double c=sqrt(1.0-Math.exp(-x));
                //"c" blievr sat lig med den sidste matematik-funktion.
                return multAdd(a, b, c);
                //Jeg skal huske, at returnere alle parametrene.
        }

        public static void main(String[] args) {
        //Jeg har lavet en "sout" til multAdd og indsat værdierne.
                System.out.println(multAdd(1.0, 2.0, 3.0));
                //Jeg opretter en midlertidig variabel for at gøre funktionen mere overskuelig.
                double temporaryVariable = Math.PI/4.0;
                //Herunder laver man en "sout", der lægger sig til de tidligere parametre.
                System.out.println(multAdd(1.0, Math.sin(temporaryVariable), (Math.cos(temporaryVariable))/2.0));
                //Tjekkede resultatet med https://www.rapidtables.com/calc/math/Log_Calculator.html
                System.out.println(Math.log10(1.0)+log20(1.0));
                //Herover anvendes den funktion, jeg har lavet til lejligheden, for at få resultatet "souted".
                System.out.println(expSum(1.0));
                //Herover anvendes funktionen til lejligheden, for at "soute" mit resultat.
        }
}