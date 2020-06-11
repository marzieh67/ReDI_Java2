package RomanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    @Test
    void convertShouldConvert1ToI(){
        String result=RomanNumerals.convert(1);
        assertEquals("I",result);
    }
    @Test
    void convertShouldConvert4ToIV(){
        String result=RomanNumerals.convert(4);
        assertEquals("IV",result);
    }
    @Test
    void convertShouldConvert14ToXIV(){
        String result=RomanNumerals.convert(14);
        assertEquals("XIV",result);
    }
    @Test
    void convertShouldConvert98ToXCVIII(){
        String result=RomanNumerals.convert(98);
        assertEquals("XCVIII",result);
    }
    @Test
    void convert_romanShouldConvert4ToIX(){
        int result=RomanNumerals.convert_roman("IV");
        assertEquals(4,result);
    }
    @Test
    void convert_romanShouldConvert10ToX(){
        int result=RomanNumerals.convert_roman("X");
        assertEquals(10,result);
    }
    @Test
    void convert_romanShouldConvert6ToVI(){
        int result=RomanNumerals.convert_roman("VI");
        assertEquals(6,result);
    }
    @Test
    void convert_romanShouldConvert8ToVIII(){
        int result=RomanNumerals.convert_roman("VIII");
        assertEquals(8,result);
    }
    @Test
    void convert_romanShouldConvert48ToXLVIII(){
        int result=RomanNumerals.convert_roman("XLVIII");
        assertEquals(48,result);
    }
    @Test
    void convert_romanShouldConvert75ToLXXV(){
        int result=RomanNumerals.convert_roman("LXXV");
        assertEquals(75,result);
    }

}