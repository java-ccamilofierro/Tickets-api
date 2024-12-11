package com.doublevpartners.ticket_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.doublevpartners.ticket_api.service.GitHubService;

@RestController
@RequestMapping("/github")
public class GitHubController {
    private final GitHubService gitHubService;

    public GitHubController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @GetMapping("/users")
    public ResponseEntity<String> getUsers(@RequestParam String name) {
        return ResponseEntity.ok(gitHubService.searchUsers(name));
    }
}
