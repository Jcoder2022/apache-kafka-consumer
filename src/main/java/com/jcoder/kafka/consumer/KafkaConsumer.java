package com.jcoder.kafka.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//Let us add this as component
@Component
public class KafkaConsumer {

    //Now we need to annotate  this method as kafka Listener
    //we need to pass topic name from which we want to listen messages,  wecan provide multiple topics as well
    //next we need to pass groupid that we provided in kafka configuration
    @KafkaListener(topics = "ComplexObjectTopic" ,groupId = "group_id")
    public void consumeMessage(String message){

        System.out.println("Messaage " + message);
    }
}
