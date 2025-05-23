package context;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
	private final Map<String, Object> data = new HashMap<>();

	public void setData(String key, Object value) {
		data.put(key, value);
	}

	public Object getData(String key) {
		return data.get(key);
	}
}
