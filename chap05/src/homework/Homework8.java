package homework;

import java.util.Arrays;

public class Homework8 {
	public static void main(String[] args) {
		String[] menu = {"Burger","Pizza","Pasta"};
		String[] add = {"Salad","Soup"};
		String[] todayMenu = new String[menu.length+add.length];
		System.arraycopy(menu, 0, todayMenu, 0, menu.length);
		System.arraycopy(add, 0, todayMenu,menu.length , add.length);
		for(int i = 0 ; i<todayMenu.length;i++) {
			System.out.print(todayMenu[i]+" ");
		}
	}
}
