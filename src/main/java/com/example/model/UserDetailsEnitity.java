//package com.example.model;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.stream.Collectors;
//
//public class UserDetailsEnitity implements UserDetails {
//
//    private final UserEntity entity;
//
//
//    public UserDetailsEnitity(UserEntity entity) {
//        this.entity = entity;
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return entity.getRole()
//                .stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toSet());
//    }
//
//    @Override
//    public String getPassword() {
//        return entity.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return entity.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
