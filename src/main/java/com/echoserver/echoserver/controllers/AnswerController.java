package com.echoserver.echoserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AnswerController {

    @RequestMapping(value = "/answer", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String answer(HttpServletRequest request)
    {
        return "[\n" +
                "  {\n" +
                "    \"action\":\"talk\",\n" +
                "    \"text\":\"Hi, Welcome to echo server.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"action\":\"connect\",\n" +
                "    \"eventUrl\":[\n" +
                "      \"https://example.com/events\"\n" +
                "    ],\n" +
                "    \"from\":\"447700900000\",\n" +
                "    \"endpoint\":[\n" +
                "      {\n" +
                "        \"type\":\"websocket\",\n" +
                "        \"uri\":\"" + this.getWebSocketUrl(request) + "/nexmo/websocket\",\n" +
                "        \"content-type\":\"audio/l16;rate=16000\",\n" +
                "        \"headers\":{\n" +
                "          \"whatever\":\"metadata_you_want\"\n" +
                "        }\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";
    }

    private static String getWebSocketUrl(HttpServletRequest request) {
        return  String.format("ws://%s:%d", request.getServerName(), request.getServerPort());
    }
}
