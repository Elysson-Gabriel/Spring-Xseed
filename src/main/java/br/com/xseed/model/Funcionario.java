package br.com.xseed.model;

public class Funcionario {
	private String id;
	private String nome;
	private String funcao;
	private double salario;

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getDesignation() {
		return funcao;
	}

	public void setDesignation(String designation) {
		this.funcao = designation;
	}

	public double getSalary() {
		return salario;
	}

	public void setSalary(double salary) {
		this.salario = salary;
	}

	public String getEmpId() {
		return id;
	}

	public void setEmpId(String empId) {
		this.id = empId;
	}

}
