package com.jayway.buildnumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;


public class PropertiesFileReaderTest {

    @Test
    public void shouldGetGitSha1() {
        String gitSha1 = PropertiesFileReader.getGitSha1();

        assertFalse(gitSha1.isEmpty());
    }
}
