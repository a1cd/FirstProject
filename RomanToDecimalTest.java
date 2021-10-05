/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: RomanToDecimalTest.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/30 at 08:40 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */
import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.Dictionary;

import static org.junit.Assert.*;
public class RomanToDecimalTest {
    @Test
    public void romanToDecimal() {
        Invalid();
        NormalAndInvariants();
        LogicallyIncorrect();
    }
    @Test 
    public void NormalAndInvariants() {
        Assert.assertEquals(259,RomanToDecimal.romanToDecimal("CCLIX"));
        Assert.assertEquals(4,RomanToDecimal.romanToDecimal("IV"));
        Assert.assertEquals(1983,RomanToDecimal.romanToDecimal("MCMLXXXIII"));
        Assert.assertEquals(1021,RomanToDecimal.romanToDecimal("MXXI"));
        Assert.assertEquals(521,RomanToDecimal.romanToDecimal("DXXI"));
        Assert.assertEquals(1994,RomanToDecimal.romanToDecimal("MCMXCIV"));
        Assert.assertEquals(109,RomanToDecimal.romanToDecimal("CIX"));
        Assert.assertEquals(1090,RomanToDecimal.romanToDecimal("MXC"));
    }
    @Test 
    public void LogicallyIncorrect() {
        Assert.assertNotEquals(47, RomanToDecimal.romanToDecimal("IVIVIVIXIXIX"));
        Assert.assertEquals(9,RomanToDecimal.romanToDecimal("IX"));
        Assert.assertEquals(900,RomanToDecimal.romanToDecimal("CM"));
        Assert.assertEquals(4,RomanToDecimal.romanToDecimal("IV"));
        Assert.assertEquals(8,RomanToDecimal.romanToDecimal("IIX")); // weird but still works

    }
    @Test 
    public void Invalid() {
        Assert.assertEquals(-1,RomanToDecimal.romanToDecimal("IC"));
        Assert.assertEquals(-1,RomanToDecimal.romanToDecimal("HAHA"));
        Assert.assertNotEquals(4,RomanToDecimal.romanToDecimal("BeBopBoop"));
        Assert.assertNotEquals(1000, RomanToDecimal.romanToDecimal("oops"));
    }
    @Test 
    public void TestMain() {
        String[] args = {"XVI", "ICSXXXS"};
        RomanToDecimal.main(args);
    }
    @Test 
    public void TestRTDTests() {
        String[] allTest = {"I", "i", "II", "ii", "III", "iii", "IV", "iv", "V", "v", "VI", "vi", "VII", "vii", "VIII", "viii", "IX", "ix", "X", "x", "XI", "xi", "XIV", "xiv", "XV", "xv", "XIX", "xix", "XXIX", "xxix", "XXXIV", "xxxiv", "XLIX", "xlix", "LXXXIV", "lxxxiv", "XCIV", "xciv", "XCIX", "xcix", "CCCXCIV", "cccxciv", "CDXCIV", "cdxciv", "CMXCIV", "cmxciv", "MCMLXII", "mcmlxii", "MMCDIX", "mmcdix", "MMCDXCIV", "mmcdxciv", "CMXCIV", "cmxciv", "CMXCIV", "cmxciv", "MMCMXCIX", "mmcmxcix", "MMMMCMXCIX", "mmmmcmxcix", "IIVI", "iivi", "IIIVII", "iiivii", "IIIXVIII", "iiixviii", "IXIXIX", "ixixix", "IVIXXLXCCDCM", "ivixxlxccdcm", "XXXXXXXXXX", "xxxxxxxxxx", "LXCID", "lxcid", "XMXVIVIIIIV", "xmxviviiiiv", "MXMXVIVIXII", "mxmxvivixii", "MXMXVIVIXIIVIII", "mxmxvivixiiviii", "MMCCCDLXIIIVIX", "mmcccdlxiiivix", "MMMCMCMCDIIIX", "mmmcmcmcdiiix", "MMMMMCDCDCD", "mmmmmcdcdcd", "I_am_Batman", "ISIS_is_not_a_valid_Roman_numeral", "MMMMMGood", "mmmmmgood", "MMCMLXIJMMCD", "mmcmlxijmmcd", "LXHID", "lxhid", "IVXLCDME", "ivxlcdme", "SWEET_BRUH", "sweet_bruh"};
        RomanToDecimal.main(allTest);
    }

    @SuppressWarnings("CodeBlock2Expr")
    @Test
    public void romanToDecimalThrows() {
        Assert.assertThrows(Exception.class, () -> {RomanToDecimal.romanToDecimalThrows("Oops");});
        Assert.assertThrows(Exception.class, () -> {RomanToDecimal.romanToDecimalThrows("IM");}); // Should throw because it is a level difference > 2
    }

    @Test
    public void main() {
        TestMain();
        TestRTDTests();
    }
}
