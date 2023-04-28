package project.model.entity;

/**
 * The output information generated by the output api after sending a report from the input api
 * Serve as a record with attributes id, type, delete hash, and link
 */
public class Output implements Entity{
    private String id;
    private String type;
    private String deletehash;
    private String link;

    public Output(String id, String type, String deletehash, String link) {
        this.id = id;
        this.type = type;
        this.deletehash = deletehash;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDeletehash() {
        return deletehash;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String getEntityInfo() {
        String info = "Id: " + id +
                "\nType: " + type +
                "\nDelete hash: " + deletehash +
                "\nLink: " + link + "\n";
        return info;
    }
}
