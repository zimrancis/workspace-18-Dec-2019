package com.ciphersnippet.rentacar.demoapplication;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component 
@Endpoint(id = "stage")
public class StageEdPoint {

	Map<String, Stage> stages = new ConcurrentHashMap<>();

	@ReadOperation
	public Map<String, Stage> getAllStages() {
		return stages;
	}
	@ReadOperation
	public Stage getStage(@Selector String name) {
		return stages.get(name);
	}
	/*	@WriteOperation
	public void setValu(@Selector String name, Stage stage) {
		stages.put(name, stage);

	}
*/	@WriteOperation
	public void setValu(@Selector String name, int stage) {
		stages.put(name, new Stage(stage));

	}

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
	
//	static class Stage {
//	String value;
//
//	public Stage(String value) {
//		this.value = value;
//	}
//
//	public String getValue() {
//		return value;
//	}
//
//	public void setValue(String value) {
//		this.value = value;
//	}
}	















//package com.ciphersnippet.rentacar.demoapplication;
//
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
//import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
//import org.springframework.boot.actuate.endpoint.annotation.Selector;
//import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
//import org.springframework.stereotype.Component;
//
//@Component // <--extends from <@Serv, @repo, @Bea> these all simply create beans
//@Endpoint(id = "stage")
//public class StageEdPoint {
//
//	Map<String, Stage> stages = new ConcurrentHashMap<>();
//
//	// for this map I'm going to get Stages like
//
//	@ReadOperation
//	public Map<String, Stage> getAllStages() {
//		return stages;
//	}

	// but here you need the name, so we use something called Selector
	// what it does is it tells ok, I need to operate this based on this values
	// POST: http://localhost:8080/actuator/{name} it's a POST Request. JSON)
//	@ReadOperation
//	public Stage getStage(@Selector String name) {
//		return stages.get(name);
//	}

	// here I need to add this to my stages so what I'm going to do is
	// so for that also I need a selector
	// [http://localhost:8080/actuator/{name}] so selector is a String name
	// and I need a stage, and since it is a write operation
	// so here we need to add this to map to put my name and stage....

	
	/*	@WriteOperation
	public void setValu(@Selector String name, Stage stage) {
		stages.put(name, stage);

	}
*/	
//	@WriteOperation
//	public void setValu(@Selector String name, int stage) {
//		stages.put(name, new Stage(stage));
//
//	}
	
	
	// if you want you can write a @DeleteOperation also...

	/*
	 * So we have a Stage class which has an int value so keep hold the value for
	 * this stages or threshold value and we have on constructor which we can take
	 * the threshold value and return a new stages because every stages has to have
	 * a value and you have basic getters and setters..
	 * 
	 * so let's keep a map case of string and value is a stages
	 */

//	static class Stage {
//		int value;
//
//		public Stage(int value) {
//			this.value = value;
//		}
//
//		public int getValue() {
//			return value;
//		}
//
//		public void setValue(int value) {
//			this.value = value;
//		}
//	}
	
	/*
	 * static class Stage { String value;
	 * 
	 * public Stage(String value) { this.value = value; }
	 * 
	 * public String getValue() { return value; }
	 * 
	 * public void setValue(String value) { this.value = value; }
	 */
//}	