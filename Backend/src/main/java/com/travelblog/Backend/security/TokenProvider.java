//package com.travelblog.Backend.security;
//
//import com.travelblog.Backend.entity.UserInfo;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.time.Instant;
//import java.time.temporal.ChronoUnit;
//import java.util.Date;
//
//@Slf4j
//@Service
//public class TokenProvider {
//    private static final String SECRET_KEY = "NMA8JPctFuna59f5";
//
//    public String create(UserInfo member) {
//        Date expiryDate = Date.from(Instant.now().plus(1, ChronoUnit.DAYS));
//        return Jwts.builder()
//                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
//                .setSubject(member.getUseremail())
//                .setIssuer("Buddle")
//                .setIssuedAt(new Date())
//                .setExpiration(expiryDate)
//                .compact();
//    }
//
//    public String validateAndGetUserId(String token) {
//        Claims claims = Jwts.parser()
//                .setSigningKey(SECRET_KEY)
//                .parseClaimsJws(token)
//                .getBody();
//        return claims.getSubject();
//    }
//
//    public static String GetUserId(String token) {
//        Claims claims = Jwts.parser()
//                .setSigningKey(SECRET_KEY)
//                .parseClaimsJws(token)
//                .getBody();
//        return claims.getSubject();
//    }
//}
