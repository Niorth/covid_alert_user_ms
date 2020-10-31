package fr.projetiwa.covid_alert_user_ms.repositories;

import fr.projetiwa.covid_alert_user_ms.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
