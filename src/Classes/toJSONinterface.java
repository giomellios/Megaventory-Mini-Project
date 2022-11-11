package Classes;

import java.io.IOException;

public interface toJSONinterface<T> {

	public String toJSON(T t);
	public void Request(String address,String content) throws IOException, InterruptedException;
}

