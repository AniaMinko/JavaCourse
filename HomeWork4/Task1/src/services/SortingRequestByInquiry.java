package services;

import java.util.Comparator;
import entity.Request;

public class SortingRequestByInquiry implements Comparator<Request> {

	@Override
	public int compare(Request request1, Request request2) {
		if (request1 != null && request2 != null) {
			int quantity1 = request1.getQuantity();
			int quantity2 = request2.getQuantity();

			if (quantity1 > quantity2) {
				return 1;
			} else if (quantity1 < quantity2) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}

	}

}
