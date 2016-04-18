package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.junit.Assert;
import org.junit.Test;

public class TripServiceTest {
	
	private TripService tripService;


	/**
	 * @see TripService#getTripsByUser(User)
	 * @verifies _throw_exception_when_user_not_logged_in
	 */
	@Test(expected = UserNotLoggedInException.class)
	public void getTripsByUser_should_throw_exception_when_user_not_logged_in() throws Exception {
		tripService = new MockTripService();
		tripService.getTripsByUser(null);
	}
	
	
	private class MockTripService extends TripService {
		@Override
		protected User getLoggedUser() {
			return null;
		}
	}
}