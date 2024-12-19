package mk.ukim.finki.wp.lab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{

    private final PasswordEncoder passwordEncoder;


    public WebSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Bean

    public SecurityFilterChain securityFilterChain( HttpSecurity http) throws Exception{
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/", "/home", "/assets/**", "/register", "/login", "/events", "/events/events-list/","/events/events-list/event-details/{id}")
                        .permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/events/add-form", "/events/edit-form/**")
                        .hasAnyRole("ADMIN", "MODERATOR")
                        .requestMatchers("/events/events-list/delete/**")
                        .hasRole("ADMIN")
                        .anyRequest()
                        .authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                        .failureUrl("/login?error=BadCredentials")
                        .defaultSuccessUrl("/events/events-list", true)
                )
                .logout((logout) -> logout
                        .logoutUrl("/logout")
                        .clearAuthentication(true)
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .logoutSuccessUrl("/events/events-list")
                );
//                .exceptionHandling((exception) -> exception
//                        .accessDeniedPage("/acces_denied")
//                );
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("elena"))
                .roles("ADMIN")
                .build();
        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("user1"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin,user);
    }
}