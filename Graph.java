/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: Graph.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/17 at 11:21 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

@SuppressWarnings("ALL")
public class Graph {
    float maxY;
    float minY;
    int times;
    float dist;
    String printString = "";
    List<Float> xs = new ArrayList<>(List.of());
    List<Float> ys = new ArrayList<>(List.of());
    public static void main(String[] args) {
        Graph testGraph = new Graph(20, 0.5f);
        testGraph.print();
    }
    public float func(float x) {
//        return x;
        return ((float) Math.pow(x, 2)); // x^2-1
    }
    public Graph(int points, float pointDist) {
        this.times = points;
        this.dist = pointDist;
        this.iterate();
        this.findRange();
    }
    public void iterate() {
        xs = new ArrayList<>(List.of());
        ys = new ArrayList<>(List.of());
        for (int i = -round(times/2); i < round(times/2); i++) {
            float amt = ((float) i)*dist;
            xs.add(amt);
            ys.add(func(amt));
        }
    }
    public void findRange() {
        for (float y : ys) {
            maxY = max(y, maxY);
            minY = min(y, minY);
        }
    }

    private void EvalPrintString() {
        System.out.println("EvalPrint");
        findRange();
        System.out.println("Min: "+minY+"; Max: "+maxY);
        for (float y = maxY; y > minY; y--) {
//            System.out.println("y:"+y);
            for (float x : xs) {
                float currentYTop = y+1;
                float currentYBottom = y-1;
                boolean XIsInCurrentY = (x>currentYBottom) && (x<currentYTop);
//                System.out.println(XIsInCurrentY);
                if (!XIsInCurrentY) {
                    this.printString = this.printString + " ";
                } else {
                    this.printString = this.printString + "*";
                }
            }
            this.printString = this.printString + "|\n|";
        }
    }

    public void print() {
        System.out.println(xs);
        System.out.println(ys);
        System.out.println("Beginning Print");
        EvalPrintString();
        System.out.println(printString);
    }
}
