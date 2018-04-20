package controller;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import model.Benutzern;

public interface CustomerRepository extends CrudRepository<Benutzern, Long> {
	/**
	 * these methode will be routed into the customer Repository
	 * implementation of the store of your choice provided by Spring Data
	 * @param id
	 * @return
	 */
	Optional <Benutzern> findByfullName(String fullName);

	
	
}
