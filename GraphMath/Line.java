/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: Line.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/10/01 at 08:14 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

package GraphMath;

public class Line {
    private Float YIntercept;
    private Float XIntercept;
    private Float Slope;
    private Float A, B, C;

    public Line(Float a, Float b, Float c) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.Slope = -(a / b);
    }

    public Float XIntercept() {
        return XIntercept;
    }

    public Float getSlope() {
        return Slope;
    }

    public Float getA() {
        return A;
    }

    public Float getB() {
        return B;
    }

    public Float getC() {
        return C;
    }
}