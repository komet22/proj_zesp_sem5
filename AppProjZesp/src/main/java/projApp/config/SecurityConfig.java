package projApp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @authors Pawe� Miszkiel & Rafa� Teodorowski
 * 
 * 		PW, Wydzia� Elektryczny - Informatyka - semestr VI
 *
 * 2017-06-13
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            	.antMatchers("/", "home" , "/css/**").permitAll()
            	.antMatchers("/registerClient", "/addCooperationOffer").permitAll() // TEST
            	.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
            	.antMatchers("/employee/**").access("hasRole('ROLE_EMPLOYEE')")
            	.antMatchers("/home").access("hasRole('ROLE_ADMIN') OR hasRole('ROLE_EMPLOYEE')")
            	.anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/home")
                .permitAll()
                .and()
            .logout()
                .permitAll()
            .and().exceptionHandling().accessDeniedPage("/403");
    }
    
    @Autowired
    DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
      auth.jdbcAuthentication().dataSource(dataSource)
      	  .usersByUsernameQuery("select username,password, enabled from spring_users where username=?")
      	  .authoritiesByUsernameQuery("select username, role from spring_user_roles where username=?");
    }
    
}