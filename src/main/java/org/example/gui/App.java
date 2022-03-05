package org.example.gui;

import javafx.application.Application;
import javafx.stage.Stage;

import org.mariuszgromada.math.mxparser.*;
import java.beans.*;
import java.util.Scanner;
import org.example.model.Bisection;
import org.example.model.Falsi;
import org.mariuszgromada.math.mxparser.Expression;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Bisection bisection = new Bisection("xd");
        Falsi falsi = new Falsi("xd");
        Function f = new Function("f(x) = 1/(sin(x*x+1))");
        Argument x = new Argument("x = 0");
        Expression expression = new Expression("f(x)",f,x);
        System.out.println(expression.calculate());

//        double lowerLimit , upperLimit, dokladnosc;
//
//        //podajemy dolny i gorny przedzial oraz dokladnosc
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Podaj dolny przedzial: ");
//        lowerLimit = sc.nextDouble();
//        System.out.print("Podaj gorny przedzial: ");
//        upperLimit = sc.nextDouble();
//        System.out.print("Podaj dokladnosc: ");
//        dokladnosc = sc.nextDouble();
//
//        //wynik
//        System.out.println(bisection.bisectionAlgorithm(lowerLimit,upperLimit,dokladnosc));
//        System.out.println(bisection.bisectionAlgorithm(0,1,10));
//        System.out.println(falsi.falsiAlgorithm(0,1,10));
        System.exit(0);
    }

    public static void main(String[] args) {
        launch();
    }
}