package mediatheque;

public abstract class Item extends VisitItem implements Visitable{
	private String title;

	public Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
        
        public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "title=" + title ;
	}

	
}
