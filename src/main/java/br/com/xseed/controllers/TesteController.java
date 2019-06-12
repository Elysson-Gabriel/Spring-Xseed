package br.com.xseed.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.xseed.model.Funcionario;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/funcionarios" })
public class TesteController {

	private List<Funcionario> funcionarios = criarLista();

	@GetMapping(produces = "application/json")
	public List<Funcionario> firstPage() {
		return funcionarios;
	}

	@DeleteMapping(path = { "/{id}" })
	public Funcionario delete(@PathVariable("id") String id) {
		Funcionario deletedEmp = null;
		for (Funcionario emp : funcionarios) {
			if (emp.getEmpId().equals(id)) {
				funcionarios.remove(emp);
				deletedEmp = emp;
				break;
			}
		}
		return deletedEmp;
	}

	@PostMapping
	public Funcionario create(@RequestBody Funcionario user) {
		funcionarios.add(user);
		System.out.println(funcionarios);
		return user;
	}

	private static List<Funcionario> criarLista() {
		List<Funcionario> tempEmployees = new ArrayList<>();
		Funcionario emp1 = new Funcionario();
		emp1.setName("Fulano");
		emp1.setDesignation("Desenvolvedor");
		emp1.setEmpId("1");
		emp1.setSalary(5200);
		Funcionario emp2 = new Funcionario();
		emp2.setName("Cicrano");
		emp2.setDesignation("Desenvolvedor");
		emp2.setEmpId("2");
		emp2.setSalary(4600);
		Funcionario emp3 = new Funcionario();
		emp3.setName("Beltrano");
		emp3.setDesignation("Desenvolvedor");
		emp3.setEmpId("3");
		emp3.setSalary(6800);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		tempEmployees.add(emp3);
		return tempEmployees;
	}

}