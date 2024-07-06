package com.example.one_to_many_example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Petrepository extends JpaRepository<Pet, Long>{

}
