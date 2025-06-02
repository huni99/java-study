package sec01.exam04.quiz;

import java.util.Objects;

public class Song {
	private String name;
	private String singer;
	public Song() {
	}
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(name,singer);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		else if (obj instanceof Song ong) {
			return ong.name.equals(name)&&ong.singer.equals(singer);
		}
		else {
			return false;
		}

	}
	
	@Override
	public String toString() {
		return "{제목: " + name + " 가수: " + singer+"}";
	}
}
