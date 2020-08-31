package mongo.basic.basicmongo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;

import sun.swing.icon.SortArrowIcon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Jai Ram G ki" );
       
        String mongoUri = "mongodb+srv://m220j:m220j@cluster0.zdcig.mongodb.net/student_db";
        
        //Create connection 
        MongoClient client = MongoClients.create(mongoUri);
        
        //Create new DB
        MongoDatabase db = client.getDatabase("student_db"); //If database available then it will return the same else will create new one
        
        //Create new Collection
        // db.createCollection("student");
        
        //get collection
        MongoCollection<Document> studentCollection = db.getCollection("student");
       
        //Insert one record to student 
        /*Document student = new Document("name","Ram G").append("age", 27).append("course", "MCA");
        studentCollection.insertOne(student);
        System.out.println(student.getObjectId("_id")); //acknowledgement to insert success
        
        //find the inserted record
        Document student1 = studentCollection.find(new Document("name", "Ram G")).first();
        System.out.println(student1);
        
        System.out.println("==========insert Many==========");
        //Insert Many
        Document student2 = new Document("name","Laxman G").append("age", 27).append("course", "MCA");
        Document student3 = new Document("name","Sita G").append("age", 22).append("course", "MTech");
        Document student4 = new Document("name","Bharat G").append("age", 27).append("course", "BTech");
        Document student5 = new Document("name","Shatrughan G").append("age", 27).append("course", "BTech");
        
        List<Document> list = new ArrayList<Document>();
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        
        studentCollection.insertMany(list);
        
        //find all
        List<Document> retrievalList = new ArrayList<Document>();
        studentCollection.find().into(retrievalList);
        for(Document d: retrievalList) {
        	System.out.println(d);
        }
        */
       /* 
        //Update one
        Bson filter = Filters.eq("name", "Ram G");
        //1.Fetch record to update
        Document update = studentCollection.find(filter).first();
        //2.Set updated value
        update.put("course", "Phd");
        //3.call updateOne with $set
        UpdateResult result = studentCollection.updateOne(filter, new Document("$set", update));
        
        System.out.println("getMatchedCount = "+result.getMatchedCount());
        System.out.println("getModifiedCount = "+result.getModifiedCount());
        System.out.println("getUpsertedId = "+result.getUpsertedId());
        //Verify
        Document d = studentCollection.find(filter).first();
        System.out.println(d);
        */
        
        //Update many by creating a new column & update the column value
        //to add new column as year in student table which add year & update same value to all records  
        /*UpdateResult res = studentCollection.updateMany(Filters.regex("name", "."), new Document("$set", new Document("year",2021)));
        System.out.println("getMatchedCount = "+res.getMatchedCount());
        System.out.println("getModifiedCount = "+res.getModifiedCount());
        System.out.println("getUpsertedId = "+res.getUpsertedId());*/
        
        //Show all available records
        List<Document> allRecords = new ArrayList<Document>();
        studentCollection
	        .find() //To find all
	        .projection(new Document("name", 1).append("_id", 0)) //To show column [1=show | 0=dont show] 
	        .sort(Sorts.ascending("name"))//To sort
	        .limit(3)//To limit the record to show
	        .skip(2)//To skip number of records from beginning [limit & skip are used in pagination]
	        .into(allRecords); //put all the fetched records in a collection
        for(Document d: allRecords)
        	System.out.println(d);
        
        //BasicOperation.runBasicOperation();
       
        Document dx = new Document("_id","D101").append("name", "Ram G");
        MongoCollection<Document> mx = db.getCollection("custom_id");
        mx.insertOne(dx);
        System.out.println(mx.find().first());
        
    }
}
