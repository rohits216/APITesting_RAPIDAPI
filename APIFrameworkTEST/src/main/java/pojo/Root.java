package pojo;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Root {
    private String get;
    private Parameters parameters;
    private List<Object> errors = new ArrayList<Object>();
    private Integer results;
    private List<Response> response = new ArrayList<Response>();
    

    
    
    public String getGet() {
        return get;
    }
    public void setGet(String get) {
        this.get = get;
    }
    public Parameters getParameters() {
        return parameters;
    }
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }
    public List<Object> getErrors() {
        return errors;
    }
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }
    public Integer getResults() {
        return results;
    }
    public void setResults(Integer results) {
        this.results = results;
    }
    public List<Response> getResponse() {
        return response;
    }
    public void setResponse(List<Response> response) {
        this.response = response;
    }
}
