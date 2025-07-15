package com.rush.jwt2.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JwtService {

    @Value("${app.jwt_secret}")
    private String secret;

    private final Date issuedAt = new Date();
    private final Date expiration = new Date(System.currentTimeMillis() + 1000 * 60 * 60);
    private Key key;

    @PostConstruct
    public void initKeys(){
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
    }


    public String generateToken(String username){

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(issuedAt)
                .setExpiration(expiration)
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public String extractUsername(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean isExpired(String token){

        Date tokenExp = Jwts.parserBuilder().setSigningKey(key).build()
                .parseClaimsJws(token).getBody().getExpiration();
        return tokenExp.before(new Date());

    }


    public boolean validateToken(String username, String token){

        String extractedUsername = extractUsername(token);
        return extractedUsername.equals(username) && !isExpired(token);

    }

}
