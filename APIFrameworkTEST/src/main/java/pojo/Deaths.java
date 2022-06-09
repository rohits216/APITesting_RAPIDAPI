package pojo;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1


import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Deaths {
	

	 
	
    private Integer total;
    @JsonProperty("new") 
	private String _new;
	@JsonProperty("1M_pop") 
	private String _1MPop;
    public String getNew() {
        return _new;
    }
    public void setNew(String _new) {
        this._new = _new;
    }
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
