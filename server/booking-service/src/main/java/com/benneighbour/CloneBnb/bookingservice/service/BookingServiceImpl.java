package com.benneighbour.CloneBnb.bookingservice.service;

import com.benneighbour.CloneBnb.bookingservice.dao.BookingDao;
import com.benneighbour.CloneBnb.bookingservice.model.Booking;
import com.benneighbour.CloneBnb.bookingservice.model.BookingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

/**
 * @author Ben Neighbour
 * @created 31/08/2020
 * @project CloneBnb
 */
@Service
public class BookingServiceImpl implements BookingService {

  private final BookingDao bookingDao;

  public BookingServiceImpl(final BookingDao bookingDao) {
    this.bookingDao = bookingDao;
  }

  @Override
  @Transactional
  public ResponseEntity<BookingResponse> makeBooking(Booking booking) {
    try {
      // Dispatch event here

      BookingResponse response = new BookingResponse();
      response.setMESSAGE("STAY BOOKED SUCCESSFULLY");
      response.setSTATUS(BookingResponse.STATUS.SUCCESS);
      return ResponseEntity.ok(response);
    } catch (Exception e) {
      BookingResponse response = new BookingResponse();
      response.setMESSAGE("UNABLE TO BOOK STAY");
      response.setSTATUS(BookingResponse.STATUS.ERROR);

      return ResponseEntity.badRequest().body(response);
    }
  }

  @Override
  public ResponseEntity<BookingResponse> deleteBooking(UUID bookingId) {
    try {
      BookingResponse response = new BookingResponse();
      response.setMESSAGE("BOOKING REMOVED");
      response.setSTATUS(BookingResponse.STATUS.SUCCESS);

      return ResponseEntity.ok().body(response);
    } catch (Exception e) {
      BookingResponse response = new BookingResponse();
      response.setMESSAGE("SOMETHING WENT WRONG...");
      response.setSTATUS(BookingResponse.STATUS.ERROR);

      return ResponseEntity.badRequest().body(response);
    }
  }

  @Override
  public ResponseEntity<BookingResponse> checkBookingAvailability(Booking booking) {
    return null;
  }
}