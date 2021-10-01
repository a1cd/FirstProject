
/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: Fraction.kt
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/10/01 at 05:18 PM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: Fraction.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/10/01 at 09:56 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */
package GraphMath

import GraphMath.Fraction

class Fraction(var Numerator: Int, var Denominator: Int): Comparable<Fraction> {
    operator fun times(other: Fraction): Fraction {
        return Fraction(this.Numerator*other.Numerator, this.Denominator*other.Denominator)
    }
    operator fun div(other: Fraction): Fraction {
        return this * other.reciprocal()
    }

    constructor(Number: Int) : this(Number, 1)
    fun FindCommonDenominator(with: Fraction): Pair<Fraction, Fraction> {
        val comparer1: Fraction = Fraction(
            this.Numerator*with.Denominator,
            this.Denominator*with.Denominator
        )
        val comparer2: Fraction = Fraction(
            with.Numerator*this.Denominator,
            with.Denominator*this.Denominator
        )
        return Pair(comparer1, comparer2)
    }
    fun reciprocal(): Fraction {
        return Fraction(this.Denominator, this.Numerator)
    }
    override fun compareTo(other: Fraction): Int {
        // 4 < 3 -> 8 < 9
        // 3 < 2 -> 6 < 6
        val fractions = this.FindCommonDenominator(other)
        val F1 = fractions.first
        val F2 = fractions.second
        return F1.Numerator-F2.Numerator
    }

    override fun toString(): String {
        return this.Numerator.toString()+"/"+this.Denominator.toString()
    }
