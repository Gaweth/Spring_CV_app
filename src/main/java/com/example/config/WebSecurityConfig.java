package com.example.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.repository.UserEntityRepository;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    private final UserEntityRepository repository;

    public WebSecurityConfig(UserEntityRepository repository) {
        this.repository = repository;
    }



//    @Bean
//    protected PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        AppUserDetailsService appUserDetailsService = new AppUserDetailsService(repository);
//        provider.setUserDetailsService(appUserDetailsService);
//        return provider;
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("test").password("test").roles("USER")
                .and()
                .withUser("admin").password("admin").roles("ADMIN");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/about_edit")
                .hasAnyAuthority("ROLE_ADMIN")
//                .antMatchers("/contact")
//                .hasAnyAuthority("ROLE_USER")
                .and() // dopisujemy aby kontynuowa?? konfiguracje kolejnego bloku
                .csrf().disable() // wy????czamy zabezpieczenie CSRF w celu u??ycia np postmana
                .headers().frameOptions().disable()
                .and()
                .formLogin() // wskazujemy ??e teraz b??dziemy konfigurowa?? formularz autoryzacji
                .loginPage("/login") // wskazujemy endpointa w kt??rym b??dzie si?? odbywa?? autoryzacja
                .usernameParameter("username") // nadajemy nazw?? jaka b??dzie jako name w inpucie loginu w formularzu
                .passwordParameter("password") //nadajemy nazw?? jaka b??dzie jako name w inpucie has??a w formularzu
                .loginProcessingUrl("/")
                .defaultSuccessUrl("/index")
                .failureForwardUrl("/login?error") // co si?? stanie w momencie b????dnego wpisania loginu lub has??a
                .and()
                .logout()
                .logoutSuccessUrl("/login"); // wskazujemy endpoint na kt??ry nas przekieruje kiedy si?? wylogujemy
    }
}





//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/about_edit")
//                .hasAnyAuthority("ROLE_ADMIN")
//                .antMatchers("/contact")
//                .hasAnyAuthority("ROLE_USER")
//                .and()
//                .csrf().disable()
//                .headers().frameOptions().disable()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .loginProcessingUrl("/about")
//                .failureForwardUrl("/login?error")
//                .defaultSuccessUrl("/index")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/about");
//
//
//    }
//
//
//}
//
//

