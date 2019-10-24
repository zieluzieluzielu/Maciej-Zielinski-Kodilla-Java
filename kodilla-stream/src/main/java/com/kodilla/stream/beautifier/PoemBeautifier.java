package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beutify(String a, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(a);
        System.out.println("Beutified text: "+result);
    }
}
