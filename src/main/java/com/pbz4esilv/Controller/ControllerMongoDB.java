package com.pbz4esilv.Controller;

/**
 * Created by khaled on 27/11/2015.
 */
        import com.mongodb.MongoClient;
        import com.mongodb.MongoClientURI;
        import com.mongodb.client.MongoCollection;
        import com.mongodb.client.FindIterable;
        import com.mongodb.client.MongoDatabase;
        import com.pbz4esilv.model.Equity;
        import com.pbz4esilv.model.Index;
        import org.bson.Document;
        import java.util.ArrayList;
        import java.util.Date;
        import java.util.List;


public class ControllerMongoDB {
    private String uriString;
    private MongoClient connectionClient;
    private MongoClientURI uri;
    private MongoDatabase db;


    //connection MongoDb
    public void MongoClient(String _uriString) {
        this.uriString = _uriString;
        this.uri = new MongoClientURI(this.uriString);
        this.connectionClient = new MongoClient((uri));
        this.db = connectionClient.getDatabase(uri.getDatabase());
    }

    //fermer connection mongoDB
    public void CloseClientConnection() {
        this.connectionClient.close();
    }

    //rajouter equity a la bd
    public void AddEquity(Equity equity) {

        MongoCollection coll = db.getCollection("equity");

        Document doc = new Document().append("name", equity.getName())
                .append("price", equity.getPrice())
                .append("dateValuation", equity.getDateValuation())
                .append("volatility", equity.getVolatility())
                .append("dividende", equity.getDividend())
                .append("ticker", equity.getTicker())
                .append("Weight", equity.getWeight());

        coll.insertOne(doc);
    }

    //rajouter une collection d'équity a la bd
    public void AddEquityCollection(List<Equity> collection) {
        List<Document> listDocuments = new ArrayList<Document>();
        MongoCollection coll = db.getCollection("action");

        for (Equity a : collection) {
            AddEquity(a);
        }

    }

    //retrouver un equity dans la db
    public Equity FindEquity(String nameEquity) {
        MongoCollection coll = db.getCollection("equity");

        FindIterable<Document> g = coll.find(new Document("name", nameEquity));
        String name = (String) g.first().get("name");
        String ticker = (String) g.first().get("ticker");
        Double price = (Double) g.first().get("price");
        Double volatility = (double) g.first().get("volatility");
        Date dateValuation = (Date) g.first().get("dateValuation");
        Double dividend = (Double) g.first().get("dividend");
        Double weight = (Double) g.first().get("wieght");

        Equity equity = new Equity(name, ticker, price, volatility, dateValuation, dividend ,weight);
        return equity;
    }

    //mettre à jour un equity dans la bd
    public String UpdateEquity(Equity equity) {

        MongoCollection coll = db.getCollection("equity");

        Document doc = new Document().append("name", equity.getName())
                .append("price", equity.getPrice())
                .append("dateValuation", equity.getDateValuation())
                .append("volatility", equity.getVolatility())
                .append("dividende", equity.getDividend())
                .append("ticker", equity.getTicker())
                .append("Weight", equity.getWeight());

        coll.updateOne(new Document("name", equity.getName()), doc);

        return "Done";
    }

}

