
/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: FractionTest.kt
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/10/01 at 02:56 PM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

package GraphMath.Test

import GraphMath.Fraction
import org.junit.Assert.*
import org.junit.Test

class FractionTest {
    @Test
    fun times() {
        val Fraction1 = Fraction(1,2)
        val Fraction2 = Fraction(1,2)
        val actual = Fraction1*Fraction2
        val expected = Fraction(1,4)
        assertEquals(expected, actual)
    }

    @Test
    fun div() {
        val Fraction1 = Fraction(1,2)
        val Fraction2 = Fraction(1,2)
        val actual = Fraction1/Fraction2
        val expected = Fraction(1,1)
        assert(expected == actual)
    }

    @Test
    fun reciprocal() {

        assert(Fraction(1,2) == Fraction(2,1).reciprocal())
    }

    @Test
    fun getNumerator() {
        assert(Fraction(1,2).Numerator == 1)
    }

    @Test
    fun getDenominator() {
        assert(Fraction(1,2).Denominator == 2)
    }
}