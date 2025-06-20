package homework.bookStore.model;

public abstract class Book{
	private String isbn;
	private int price;
	
	
	public Book(String isbn, int price) {
		recoverMissingDigit(isbn);
		this.price = price;
	}
	

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public abstract void  printInfo();
	
	public void recoverMissingDigit(String isbn) {
		String str = isbn;
		int count, num;
		
		if(str.contains("*")) {
			count = str.indexOf("*");
			int result=0;
			for(int i = 0; i<13; i++) {
				if(i==count)continue;
				num = str.charAt(i)-'0';
				if(i%2==0) {
					result += num;
				}
				else {
					result += 3*num;
				}
			}
			if (count % 2 == 0) {
			      for (int i = 0; i <= 9; i++) {
			        if ((result + i) % 10 == 0) {
			          num = i;
			          str=str.substring(0,count)+num+str.substring(count+1);
			          break;
			        }
			      }
			    } 
			else {
			     for (int i = 0; i <= 9; i++) {
			       if ((result + 3 * i) % 10 == 0) {
			         num = i;
			         str=str.substring(0,count)+num+str.substring(count+1);
			         break;
			       }
			     }
			   }
			
			
			
			
		}
		this.isbn=str;
		
		
		
		
		
		
	}
}
