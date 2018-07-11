/********************************************************************************* *
 * Purpose: To Perform and learn Spring Boot via an example. Creating a service class in which business logics are represented
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.springboot.model.Topic;


@Service
public class TopicService {

	private List<Topic> topics =new ArrayList<>( Arrays.asList(
			new Topic("spring", "spring framework", "spring framework description"),
			new Topic("java", "core java", "core java description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(id.equals(t.getId())) {
				topics.set(i, topic);
				return;
			}
			
		}
		
	}
	public void deleteTopic(String id) {
		
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(id.equals(t.getId())){
				topics.remove(i);
			}
		}
	}
	
}
