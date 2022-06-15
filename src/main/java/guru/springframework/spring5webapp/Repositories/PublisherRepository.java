package guru.springframework.spring5webapp.Repositories;

import guru.springframework.spring5webapp.Domain.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.concurrent.Flow;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {

    }

