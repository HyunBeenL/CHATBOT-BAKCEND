package com.aidt.backend.controller;

import com.aidt.backend.service.ChatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatBotService chatBotService;

    @PostMapping("/send")
    public ResponseEntity <Map<String, String>> sendMessage(@RequestBody Map<String, String> request) {
        String userMessage = request.get("message");


        return ResponseEntity.ok(Map.of("reply", userMessage));
    }
}
