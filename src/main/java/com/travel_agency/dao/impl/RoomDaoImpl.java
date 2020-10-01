package com.travel_agency.dao.impl;

import com.travel_agency.dao.RoomDao;
import com.travel_agency.entity.Room;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class RoomDaoImpl implements RoomDao {

    private final SessionFactory sessionFactory;

    @Override
    public void add(Room room) {
        try (Session session = sessionFactory.openSession()) {
            session.save(room);
        }
    }

    @Override
    public List getRoomByHotelId(int id) {
        try (Session session = sessionFactory.openSession()) {
            final List room = session.createQuery("from Room where hotel.id=?1")
                    .setParameter(1, id).list();
            if (room == null) {
                throw new RuntimeException("There in no room");
            }else {
                return room;
            }
        }
    }

    @Override
    public Room getRoomByRoomNumber(int roomNumber) {
        try (Session session = sessionFactory.openSession()) {
            final Object room = session.createQuery("FROM Room where number=?1").setParameter(1, roomNumber).uniqueResult();
            if (room == null) {
                throw new RuntimeException("There is no room");
            } else {
                return (Room) room;
            }
        }
    }

    @Override
    public List<Room> getAvailableRoomsOnDateInHotel(String startDate, String endDate, int hotelId) {
        try (Session session = sessionFactory.openSession()) {

            List<Room> rooms =
                    session
                            .createQuery(
                                    "SELECT r from Hotel h join h.rooms r left join r.roomBooks rb where "
                                            + " (rb.orderStart > ?2 OR rb.orderEnd < ?1"
                                            + "OR rb.orderStart is null) AND h.id = ?3",
                                    Room.class)
                            .setParameter(1, startDate)
                            .setParameter(2, endDate)
                            .setParameter(3, hotelId)
                            .list();
            if (rooms == null) {
                throw new RuntimeException("There is no rooms");
            } else {
                return rooms;
            }
        }
    }

//    @Override
//    public int getRoomIdByHotelIdAndRoomNumber(int hotelId, int roomNumber) {
//        try (Session session = sessionFactory.openSession()) {
//            Query<RoomBook> roomId = session.createQuery(
//                    "SELECT * from Hotel h join h.rooms r left join r.roomBooks rb where"
//                            + "(rb.room.number = ?1 and h.id = ?2)", RoomBook.class)
//                    .setParameter(1, roomNumber)
//                    .setParameter(2, hotelId);
//        }
//        return 0;
//    }

}
