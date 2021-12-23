package com.develogical;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutMarlowe() throws Exception {
        assertThat(queryProcessor.process("Marlowe"), containsString("playwright"));
    }

    @Test
    public void knowsMyName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("Sue & Ece"));
    }

    @Test
    public void knowsTheBiggestNumber() throws Exception {
        assertThat(queryProcessor.process("6ca26300: which of the following numbers is the largest: 170, 67"), containsString("170"));
    }

    @Test
    public void knowsTheBiggestNumber2() throws Exception {
        assertThat(queryProcessor.process("190e75b0: which of the following numbers is the largest: 127, 542, 34, 45"), containsString("542"));
    }

    @Test
    public void knowsTheAddition() throws Exception {
        assertThat(queryProcessor.process("is 16 plus 18"), containsString("34"));
    }

    @Test
    public void knowsTheSubtraction() throws Exception {
        assertThat(queryProcessor.process("is 19 minus 13"), containsString("6"));
    }

    @Test
    public void knowsTheColourOfBanana() throws Exception {
        assertThat(queryProcessor.process("f2564d20: what colour is a banana"), containsString("yellow"));
    }

}
