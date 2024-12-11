package com.doublevpartners.ticket_api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubService {
    private final RestTemplate restTemplate;

    @Value("${github.api.url}")
    private String githubApiUrl;

    public GitHubService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String searchUsers(String query) {
        String url = githubApiUrl + "/search/users?q=" + query;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}

