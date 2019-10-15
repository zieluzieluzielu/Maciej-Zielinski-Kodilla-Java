package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapesList = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }


    public Shape getFigure(int n){
        Shape theShape = null;
        if (n>= 0 && n < shapesList.size()){
            theShape = shapesList.get(n);
            return theShape;
        }
        else {
            theShape = null;
            return theShape;
        }
    }

    public ArrayList<Shape> showFigures(){
        return shapesList;
    }
}
