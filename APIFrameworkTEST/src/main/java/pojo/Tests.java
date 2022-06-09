package pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; 

public class Tests {
    private String _1MPop;
    private Integer total;
    @JsonProperty("1M_pop") 
    public String get1MPop() {
        return _1MPop;
    }
    public void set1MPop(String _1MPop) {
        this._1MPop = _1MPop;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
}
