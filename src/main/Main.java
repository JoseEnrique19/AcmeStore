package main;

import view.*;
import models.*;
import controllers.*;

public class Main {
    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
    
    private static ViewProveedores viewProveedores;
        
    public static void main(String[]kgp){
        viewProveedores = new ViewProveedores();
        
        viewMain = new ViewMain();
        modelMain = new ModelMain();
        controllerMain= new ControllerMain(viewMain, viewProveedores, modelMain); 
    }
}
