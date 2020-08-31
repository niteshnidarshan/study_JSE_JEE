package mongo.basic.basicmongo.operation;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class BasicOperation {
	
	public static void runBasicOperation() {
		 
		String mongoUri = "mongodb+srv://m220j:m220j@cluster0.zdcig.mongodb.net/";
        /*
        // instantiate database and collection objects
        MongoDatabase mflix = MongoClients.create(mongoUri).getDatabase("sample_mflix");
        MongoCollection<Document> movies = mflix.getCollection("movies");
        System.out.println(movies.countDocuments());*/
        
        //Create connection
        MongoClient client = MongoClients.create(mongoUri);
        
        //Get list of databases available
        for(String db: client.listDatabaseNames())
        	System.out.println(db);
        
        System.out.println("=======================");
        //Get list of collections available in particular database
        MongoDatabase db = client.getDatabase("sample_mflix");
        for(String collection: db.listCollectionNames())
        	System.out.println(collection);
        
        System.out.println("=======================");
        //List all the documents from the collection
        MongoCollection collection = db.getCollection("users");
        FindIterable<Document> result = collection.find();
        int count = 0;
        for(Document d: result){
        	if(count<5)
        		System.out.println(d);
        	count++;
        }
        
        System.out.println("=======================");
        //Get first document of the collection
        Document doc = (Document)collection.find().first();
        System.out.println(doc);
        
        System.out.println("=======================");
        //Find a document
        Bson query = Filters.eq("name", "Maester Luwin");
        System.out.println(collection.find(query).first());
        
        System.out.println("=======================");
        //Find a document with like
        //Bson likeQuery = Filters.regex("name", ".*Maester.*"); //List all the matching documents 
        //Bson likeQuery = Filters.regex("name", "^Maester.*"); //All the documents starts with Maester
        //Bson likeQuery = Filters.regex("name", ".Maester."); //All the documents starts with something and ends with someting and in middle Maester
        Bson likeQuery = Filters.regex("name", "Maester."); //All the documents having Maester
        List<Document> list = new ArrayList<Document>();
        collection.find(likeQuery).into(list);
        for(Document x: list) {
        	System.out.println(x);
        }
        
        System.out.println("=======================");
        //Show only name column
        //Bson p1 = new Document("name",1);// select _id, name from table
        Bson pro1 = new Document("name",1).append("_id", 0);// select name from table
        List<Document> l = new ArrayList<Document>();
        //collection.find().into(l);// To find all [select * from table]
        collection.find().projection(pro1).into(l);
        for(Document x: l) {
        	System.out.println(x);
        }
        
        System.out.println("=======================");
        //select only name where name match [select name from users where name = 'Maester Aemon']
        Bson query1 = new Document("name","Maester Aemon");
        Bson projection = new Document("name",1).append("_id", 0);
        List<Document> l1 = new ArrayList<Document>();
        collection.find(query1).projection(projection).into(l1);
        for(Document x: l1) {
        	System.out.println(x);
        }
        //Another way 
        //select only name where name match [select name from users where name = 'Nitesh Kumar']
        Bson query2 = Filters.eq("name", "Nitesh Kumar");
        Bson projection1 = new Document("name",1).append("_id", 0);
        List<Document> l2 = new ArrayList<Document>();
        collection.find(query2).projection(projection1).into(l2);
        for(Document x: l2) {
        	System.out.println(x);
        }
        
        //Find a document having name as 'Nitesh Kumar'
        Object obj = collection.find(new Document("name","Nitesh Kumar")).first();
        System.out.println(obj);
	}
}
