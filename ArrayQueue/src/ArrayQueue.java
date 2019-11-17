  public void rotate(E e) throws IllegalStateException {
    if (sz == data.length) {
    	throw new IllegalStateException("Queue is full");
    	int avail = (f + sz) % data.length;   // use modular arithmetic
    	data[avail] = e;
    	sz++;
    }else if (isEmpty()) {
    	return null;
    	E answer = data[f];
    	data[f] = null;                             // dereference to help garbage collection
    	f = (f + 1) % data.length;
    	sz--;
    	return answer;
  }
  