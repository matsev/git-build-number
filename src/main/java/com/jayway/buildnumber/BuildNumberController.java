package com.jayway.buildnumber;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Map;

/**
 * A simple Spring controller that publishes the build number information.
 *
 * @author Mattias Severson, Jayway
 */
@Controller
public class BuildNumberController {

    /**
     * Gets the Git SHA-1 and returns it as a JSON object.
     * @return A JSON object with the Git SHA-1 of the build.
     */
    @RequestMapping(value = "/git-sha-1", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, String> getGitSha1() {
        String gitSha1 = PropertiesFileReader.getGitSha1();
        return Collections.singletonMap("git-sha-1", gitSha1);
    }
}
