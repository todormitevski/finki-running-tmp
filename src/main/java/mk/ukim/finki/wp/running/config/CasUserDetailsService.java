package mk.ukim.finki.wp.running.config;

import mk.ukim.finki.wp.running.repository.ProfessorRepository;
import mk.ukim.finki.wp.running.repository.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Profile("cas")
@Service
public class CasUserDetailsService extends FacultyUserDetailsService implements AuthenticationUserDetailsService {


    public CasUserDetailsService(UserRepository userRepository,
                                 ProfessorRepository professorRepository,
                                 PasswordEncoder passwordEncoder) {
        super(userRepository, professorRepository, passwordEncoder);
    }

    @Override
    public UserDetails loadUserDetails(Authentication token) throws UsernameNotFoundException {
        String username = (String) token.getPrincipal();
        return super.loadUserByUsername(username);
    }
}
