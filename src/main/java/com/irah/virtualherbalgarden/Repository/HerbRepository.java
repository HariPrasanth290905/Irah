package com.irah.virtualherbalgarden.Repository;

import com.irah.virtualherbalgarden.Model.Herbdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerbRepository extends JpaRepository<Herbdata, Integer> {
	Herbdata findById(int id);
}
