package iterator;

import java.util.List;

public class DepartingCitiesIterator implements ExtendedIterator<String>{

	  private List<String> cities;
	    private int pos;

	    public DepartingCitiesIterator(List<String> cities) {
	        this.cities = cities;
	        this.pos = 0;
	    }

	    @Override
	    public boolean hasNext() {
	        return pos < cities.size();
	    }

	    @Override
	    public String next() {
	        return cities.get(pos++);
	    }

	    @Override
	    public boolean hasPrevious() {
	        return pos > 0;
	    }

	    @Override
	    public String previous() {
	        return cities.get(--pos);
	    }

	    @Override
	    public void goFirst() {
	        pos = 0;
	    }

	    @Override
	    public void goLast() {
	    	pos = cities.size();
	    }
	

}
