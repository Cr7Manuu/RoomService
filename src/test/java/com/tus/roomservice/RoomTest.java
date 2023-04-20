package com.tus.roomservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    public void testGettersAndSetters() {
        long id = 1L;
        String roomName = "Single Room";
        String roomNumber = "1001";
        String bed = "King Size Bed";

        Room room = new Room(0, roomNumber, bed);
        room.setId(id);
        room.setRoomName(roomName);
        room.setRoomNumber(roomNumber);
        room.setBedInfo(bed);

        assertThat(room.getId()).isEqualTo(id);
        assertThat(room.getRoomName()).isEqualTo(roomName);
        assertThat(room.getRoomNumber()).isEqualTo(roomNumber);
        assertThat(room.getBedInfo()).isEqualTo(bed);
    }
}
