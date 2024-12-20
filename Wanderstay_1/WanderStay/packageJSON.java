import java.util.Map;
import java.util.HashMap;

public class PackageJson {

    private String name;
    private String version;
    private String description;
    private String main;
    private Map<String, String> scripts;
    private String[] keywords;
    private String author;
    private String license;
    private Map<String, String> dependencies;

    public PackageJson() {
        this.name = "airbnb-replica-(full-stack-)";
        this.version = "1.0.0";
        this.description = "";
        this.main = "index.js";

        this.scripts = new HashMap<>();
        this.scripts.put("test", "echo \"Error: no test specified\" && exit 1");

        this.keywords = new String[]{};
        this.author = "";
        this.license = "ISC";

        this.dependencies = new HashMap<>();
        this.dependencies.put("connect-flash", "^0.1.1");
        this.dependencies.put("ejs", "^3.1.10");
        this.dependencies.put("ejs-mate", "^4.0.0");
        this.dependencies.put("express", "^4.19.2");
        this.dependencies.put("express-session", "^1.18.0");
        this.dependencies.put("joi", "^17.13.3");
        this.dependencies.put("method-override", "^3.0.0");
        this.dependencies.put("mongoose", "^8.4.4");
        this.dependencies.put("multer", "^1.4.5-lts.1");
        this.dependencies.put("passport", "^0.7.0");
        this.dependencies.put("passport-local", "^1.0.0");
        this.dependencies.put("passport-local-mongoose", "^8.0.0");
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Map<String, String> getScripts() {
        return scripts;
    }

    public void setScripts(Map<String, String> scripts) {
        this.scripts = scripts;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Map<String, String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Map<String, String> dependencies) {
        this.dependencies = dependencies;
    }
}