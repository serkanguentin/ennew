package controller;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController
{
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;

    // Zwischen CalculatorController und CalculatorModel besteht eine Ganze-Teile Beziehung (Der Controller ist das
    // Ganze und das Model ist sein Teil. Ein Controller ohne Model bzw. ohne View kann es nicht geben, da wir alle
    // Abhängigkeiten über den Konstruktor injizieren. Es handelt sich also um Aggregationsbeziehungen zwischen
    // Controller und View und Controller und Model.
    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel)
    {
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
    }

}
