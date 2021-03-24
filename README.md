# Kafka with Spring Boot Demo

This is a simple Spring Boot Kafka Demo.

## Installation

Once you have checked out this repository, go to the base directory and build it using maven

```bash
maven clean install
```

## Running the application

Once the project is successfully built, you can run the following command:

```bash
java -jar .\target\kafka-demo-1.jar
```

This application is configured to run with a Kafka running at localhost:9092.

You can change the Kafka configuration in KafkaConfiguration java class.

```bash
http://localhost:8080/pubsub/user/Martin

http://localhost:8080/pubsub/dept/Finance
```

Above API can be used to publish messages to 'TestTopic'.

You can update the topic names in PubSubController java class.

Listener is running from KafkaConsumer java class. 