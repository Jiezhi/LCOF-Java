package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI03Test {

    @Test
    public void replaceSpaces() {
        CCI03 solution = new CCI03();
        assertEquals("Mr%20John%20Smith", solution.replaceSpaces("Mr John Smith    ", 13));
        assertEquals("%20%20%20%20%20", solution.replaceSpaces("               ", 5));
        assertEquals("ds%20sdfs%20afs%20sdfa%20dfssf%20asdf",
                solution.replaceSpaces("ds sdfs afs sdfa dfssf asdf             ", 27));
    }
}