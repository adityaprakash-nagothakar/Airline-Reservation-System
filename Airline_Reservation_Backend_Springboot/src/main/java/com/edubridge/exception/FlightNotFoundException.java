package com.edubridge.exception;

	public class FlightNotFoundException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public FlightNotFoundException(String str) {
			super(str);
		}
}
