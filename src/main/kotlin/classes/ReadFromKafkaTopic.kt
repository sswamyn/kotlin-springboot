package classes

import java.util.*

//import org.apache.* // kafka.clients.consumer.*

/*
// Read from a Kafka topic
fun readFromKafkaTopic(topic: String): List<String> {
    val props = Properties()
    props["bootstrap.servers"] = "localhost:9092"
    props["group.id"] = "my-consumer-group"
    props["key.deserializer"] = StringDeserializer::class.java
    props["value.deserializer"] = StringDeserializer::class.java

    val consumer = KafkaConsumer<String, String>(props)
    consumer.subscribe(listOf(topic))

    val records = mutableListOf<String>()

    while (true) {
        val record = consumer.poll(java.time.Duration.ofMillis(100))
        for (r in record) {
            records.add(r.value())
        }
    }

    consumer.close()
    return records
}
/*
This function takes in a topic as a parameter and uses the KafkaConsumer class from the Apache Kafka library to read messages from the specified topic. The KafkaConsumer class is a popular library for consuming messages from Kafka topics in Java and other JVM languages.

First, the function creates a Properties object and sets some configuration properties for the consumer, such as the list of bootstrap servers and the consumer group ID. Then, the function creates a KafkaConsumer instance and subscribes it to the specified topic.

Next, the function enters an infinite loop and uses the poll() method to retrieve messages from the topic. The poll() method returns a ConsumerRecords object, which is a collection of records received from the topic. The function iterates over the records and adds each record's value to a list.

Finally, the function closes the consumer and returns the list of messages.

Note that this function does not handle any potential exceptions that may be thrown when creating the consumer, subscribing to the topic, or consuming messages. In a production environment, it is recommended to add error handling to the function to ensure that it can gracefully handle any errors that may occur. For example, you can use a try-catch block to catch any exceptions and handle them appropriately.
*/
        */
