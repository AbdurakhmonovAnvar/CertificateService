package uz.isystem.CertificateService.configiration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication()
               .withUser("admin").password("{noop}root").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/api/users").hasRole("ADMIN")
                .antMatchers("/api/direction").hasRole("ADMIN")
                .antMatchers("/api/certificate").hasRole("ADMIN")
                .antMatchers("direction").hasRole("ADMIN")
                .antMatchers("/certificate").hasRole("ADMIN")
                .anyRequest().permitAll().and().httpBasic();
    }
}
