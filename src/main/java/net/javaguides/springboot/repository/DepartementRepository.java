package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.entity.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
	//Aissa Chbaba
	@Query("select count(id) from Departement")
	public String DepartementNBR();

}
