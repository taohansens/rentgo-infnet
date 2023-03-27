package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.BookingDTO;
import br.edu.infnet.rentgo.entities.Booking;
import br.edu.infnet.rentgo.entities.Client;
import br.edu.infnet.rentgo.entities.Store;
import br.edu.infnet.rentgo.entities.Vehicle;
import br.edu.infnet.rentgo.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository repository;


    public List<BookingDTO> getAll() {
        Collection<Booking> list = (Collection<Booking>) repository.findAll();
        return list.stream().map(x -> new BookingDTO(x.getId(), x.getDate(), x.getFinalDate(), String.valueOf(x.getPrice()),
                String.valueOf(x.isPayed()), x.getInfo(), x.getClient().getId(), x.getClient().getDocument().getCpf(),
                x.getClient().getName(), x.getVehicle().getId(), x.getVehicle().getPlaca(), x.getStore().getId(),
                x.getStore().getName())).toList();
    }

    public BookingDTO insert(BookingDTO bookingDTO) {
        Booking booking = new Booking(bookingDTO);
        booking.setClient(new Client(bookingDTO.getClientIdForm()));
        booking.setStore(new Store(bookingDTO.getStoreIdForm()));
        booking.setVehicle(new Vehicle(bookingDTO.getVehicleIdForm()));

        Booking bookingDB = repository.save(booking);
        return new BookingDTO(bookingDB.getId(), bookingDB.getClient().getId(), bookingDB.getVehicle().getId(), bookingDB.getStore().getId());
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
