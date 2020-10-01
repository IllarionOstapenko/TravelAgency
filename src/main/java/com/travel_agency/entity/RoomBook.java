package com.travel_agency.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "room_book")
@Getter
@Setter
@NoArgsConstructor
public class RoomBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_start", nullable = false)
    private String orderStart;

    @Column(name = "order_end", nullable = false)
    private String orderEnd;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
