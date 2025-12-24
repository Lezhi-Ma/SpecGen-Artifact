public class PerimeterDriver {
	
	 public  long driver(int select, int w, int x, int y, int z, short shortNum, long longNum) {

		Perimeter p = new Perimeter();
		long result = 0;

		switch (select) {
		case 0:
			result = p.Perimeter(shortNum);
			break;
		case 1:
			result = p.Perimeter(w);
			break;
		case 2:
			result = p.Perimeter(longNum);
			break;
		case 3:	
			result = p.Perimeter(w, x);
			break;
		case 4:
			result = p.Perimeter(w, x, y);
			break;
		case 5:
			result = p.Perimeter(w, x, y, z);
			break;
		}
		return result;
	}
}
