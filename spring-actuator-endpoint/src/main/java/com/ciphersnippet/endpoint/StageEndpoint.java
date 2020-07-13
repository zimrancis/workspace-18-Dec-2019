package com.ciphersnippet.endpoint;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="stage")
public class StageEndpoint {

	Map<String, Stage> stages = new ConcurrentHashMap<>();

	@ReadOperation
	public Map<String, Stage> getAllStages() {
		return stages;
	}

	@ReadOperation
	public Stage getStage(@Selector Stage name) {
		return getStage(name);
	}

	/*
	 * @WriteOperation public void setValue(@Selector String name, Stage stage) {
	 * stages.put(name, stage); }
	 */
	
	@WriteOperation
	public void setValue(@Selector String name, int stage) {
		stages.put(name, new Stage(stage));
	}
/*
	static class Stage {
		String value;

		public Stage(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		} //POST=http://localhost:8080/actuator/stage/st001 st002

	} //GET=http://localhost:8080/actuator/stage/
*/
	
	static class Stage {
		int value;

		public Stage(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

	}

}
