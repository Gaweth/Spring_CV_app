//package com.example.config;
//
//
//import com.example.model.UserDetailsEnitity;
//import com.example.repository.UserEntityRepo;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class AppUserService implements UserDetailsService {
//
//    private final UserEntityRepo userEntityRepo;
//
//    public AppUserService(UserEntityRepo userEntityRepo) {
//        this.userEntityRepo = userEntityRepo;
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userEntityRepo
//                .findUsernameIgnoreCase(username)
//                .map(UserDetailsEnitity::new)
//                .orElseThrow(() -> new UsernameNotFoundException(username));
//    }
//}
