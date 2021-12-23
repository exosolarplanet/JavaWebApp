package com.develogical;

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
        assertThat(queryProcessor.process("numbers is the largest:92,468"), containsString("468"));
    }

    @Test
    public void knowsTheBiggestNumber2() throws Exception {
        assertThat(queryProcessor.process("numbers is the largest:532,94,647,26"), containsString("647"));
    }

}
