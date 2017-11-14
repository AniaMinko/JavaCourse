package com.senla.bookshop.ui.menuitem;
import com.senla.bookshop.ui.api.IAction;
import com.senla.bookshop.ui.menu.Menu;
public class MenuItem {
	private String title;
	private IAction action;
	private Menu nextMenu;

	public MenuItem(String title, IAction action, Menu nextMenu){
		this.title=title;
		this.action=action;
		this.nextMenu=nextMenu;
	}
	public String getTitle(){
		return title;
	}
	public Menu getNextMenu(){
		return nextMenu;
	}
	public void doAction(){
		action.execute();
	}
}
