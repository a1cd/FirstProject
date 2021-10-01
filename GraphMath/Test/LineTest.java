
/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: LineTest.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/10/01 at 09:01 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: LineTest.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/10/01 at 08:21 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

package GraphMath.Test;

import GraphMath.Line;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    Line newLine;
    @Before
    public void setUp() throws Exception {
        newLine = new Line(1.0f, 2.0f, 3.0f);
    }

    @Test
    public void getMethods() {
        assertEquals(1f, newLine.getA(), 0.01);
        assertEquals(2f, newLine.getB(), 0.01);
        assertEquals(3f, newLine.getC(), 0.01);
        assertEquals(-0.5f, newLine.getSlope(), 0.01);
    }
}