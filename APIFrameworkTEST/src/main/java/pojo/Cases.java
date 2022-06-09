package pojo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Cases {
	@JsonProperty("new") 
	private int _new;
    private Integer active;
    private Integer critical;
    private Integer recovered;
    @JsonProperty("1M_pop")
    public String _1M_pop;
    private Integer total;
    public int getNew() {
        return _new;
    }
    public void setNew(int _new) {
        this._new = _new;
    }
    public Integer getActive() {
        return active;
    }
    public void setActive(Integer active) {
        this.active = active;
    }
    public Integer getCritical() {
        return critical;
    }
    public void setCritical(Integer critical) {
        this.critical = critical;
    }
    public Integer getRecovered() {
        return recovered;
    }
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }
    public String get1MPop() {
        return _1M_pop;
    }
    public void set1MPop(String _1MPop) {
        this._1M_pop = _1MPop;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
}