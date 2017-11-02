package repositories;

import entity.Order;
import entity.StatusOfOrder;
//import entity.Book;
public class OrderRepository {

	private Order[] orders = new Order[10000];
	public OrderRepository(Order[] orders){
		this.orders=orders;
	}

	public Order[] getOrders() {
		return orders;
	}

	public Order getOrder(int id) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null && orders[i].getId() == id) {
				return orders[i];
			}
		}
		return null;

	}

	public void addOrder(Order order) {
		if (Checker.checkEmptyCells(getOrders())) {
			int position = Checker.getPosition(getOrders());
			getOrders()[position] = order;
			//order.setStatus(StatusOfOrder.DURING);
		}
	}

	public void removeOrder(Order order) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null && orders[i].getId() == order.getId()) {
				orders[i] = null;
				//orders[i].setStatus(StatusOfOrder.MADE);
			}
		}
	}

	public Order[] getMadeOrders() { // ??????
		Order[] madeOrders = new Order[10000];
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null && orders[i].checkMadeOrder() && Checker.checkEmptyCells(madeOrders)) {
				int position = Checker.getPosition(madeOrders);
				madeOrders[position] = orders[i];
			}
		}

		return madeOrders;
	}
	public void cancelStatus(Order order){
		order.setStatus(StatusOfOrder.CANCELED);
	}
   /*public StatusOfOrder changeStatus(StatusOfOrder status){ ///??
	   if(status.equals(StatusOfOrder.DURING)){
		   return status.MADE;
	   }
	   else if(status.equals(StatusOfOrder.MADE)){
		   return status.DURING;
	   }
	   else{
		   return status.CANCELED;
	   }
   }*/
}
