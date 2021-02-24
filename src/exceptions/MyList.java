package exceptions;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List<Object> list = new ArrayList<>();

	public Object getByIndex(int index) {
		if (index < 0 || index >= this.list.size()) {
			throw new IndexOutOfBoundsException();
		}
		return this.list.get(index);
	}
}
