package com.springcore.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String> friends;
private Map<String , String> courses;
private Properties properties;

public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

public Map<String, String> getCourses() {
	return courses;
}

public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", courses=" + courses + ", properties=" + properties + "]";
}

}
