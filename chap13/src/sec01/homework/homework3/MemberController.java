package sec01.homework.homework3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {
	private Map<String , Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id , Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}else {
			return false;
		}
	}
	public String login(String id , String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
			return null;
		}
		else return null;
	}
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				return true;
				}
			return false;
		}
		return false;
	}
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
		
	}
	public TreeMap<String,String> sameName(String name){
		Iterator<Map.Entry<String, Member>> it = map.entrySet().iterator();
		TreeMap<String,String> tree = new TreeMap<String, String>();
		while(it.hasNext()) {
			Map.Entry<String, Member> im = it.next();
			Member m= im.getValue();
			String id = im.getKey();
			if(m.getName().equals(name)) {
				tree.put(id,name);
			}
		}
		return tree;
	}
}
