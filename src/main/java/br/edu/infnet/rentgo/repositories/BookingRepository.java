package br.edu.infnet.rentgo.repositories;
import br.edu.infnet.rentgo.entities.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer>{
}
