package sec01.homework.homework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {
	private Set<Lottery> lottery= new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		
		return lottery.add(l);
		
	}
	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);
		if(result&&!(win.isEmpty())) {
			win.remove(l);
		}
		return result;
		
	}
	public Set<Lottery> searchObject(){
		return lottery;
	}
	public Set<Lottery> winObject(){
		if(lottery.size()<4) {
			return null;
		}
		
		List<Lottery> list = new ArrayList<Lottery>(lottery);
		while(true) {
			if(win.size()==4) {
				break;
			}
			int num = (int)(Math.random()*list.size());
			win.add(list.get(num));
			
		}
		return win;
		
	}
	public Set<Lottery> sortedwinObject(){
		List<Lottery> List = new ArrayList<Lottery>(win);
		Collections.sort(List);
		Set<Lottery> link = new LinkedHashSet<Lottery>(List);
		return link;
	}
	public boolean searchWinner(Lottery l) {
		if(win.contains(l)) {
			return true;
		}
		return false;
	}
}
