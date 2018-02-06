package com.aricent.morphia;

import com.mongodb.Mongo;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class MorphiaMain {

    public static void main(String args[]) {
        Mongo mongo = new Mongo("localhost");
        Datastore datastore = new Morphia().createDatastore(mongo, "bandmanager");
    }
}
