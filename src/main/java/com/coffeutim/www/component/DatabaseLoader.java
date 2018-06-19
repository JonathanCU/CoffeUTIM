package com.coffeutim.www.component;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.coffeutim.www.model.Empleado;
import com.coffeutim.www.model.Estudiante;
import com.coffeutim.www.model.Rol;
import com.coffeutim.www.model.User;
import com.coffeutim.www.repository.EmpleadoRepository;
import com.coffeutim.www.repository.EstudianteRepository;
import com.coffeutim.www.repository.RolRepository;
//import com.coffeutim.www.model.entity.EmployeeEntity;
//import com.coffeutim.www.repository.EmployeeRepository;
import com.coffeutim.www.repository.UserRepository;

@Component
public class DatabaseLoader implements CommandLineRunner{
	
	@Autowired
	private RolRepository rolRepository;
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... strings) throws Exception {
		
		Rol adminRol = rolRepository.save(new Rol("ADMIN","Administrador"));
		Rol employeeRol = rolRepository.save(new Rol("EMPLOYEE","Empleado"));
		Rol studentRol = rolRepository.save(new Rol("STANDARD_USER","Estudiante"));
		
		Estudiante studentFatima = estudianteRepository.save(new Estudiante(
				"Fatima","Cisneros","Ramirez",15292014,1,"A","5568813517",0.0));
		
		Empleado employeeJosue = empleadoRepository.save(new Empleado(
				"Josue Jafet","Cisneros","Urbina","2431013514"));
		
		userRepository.save(new User("fatima.cisneros","12345678",
				studentFatima,null, Arrays.asList(studentRol)));
		userRepository.save(new User("josue.cisneros","12345678",
				null,employeeJosue, Arrays.asList(employeeRol,adminRol)));

//		SecurityContextHolder.getContext().setAuthentication(
//			new UsernamePasswordAuthenticationToken("itzi", "doesn't matter",
//				AuthorityUtils.createAuthorityList("ROLE_MANAGER")));

//		SecurityContextHolder.clearContext();
	}
}
