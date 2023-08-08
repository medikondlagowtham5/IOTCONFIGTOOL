import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timerWraparound",
    "enable",
    "wakeupChip",
    "initValue"
})
@Generated("jsonschema2pojo")
public class Wdt implements Serializable
{

    @JsonProperty("timerWraparound")
    private int timerWraparound;
    @JsonProperty("enable")
    private int enable;
    @JsonProperty("wakeupChip")
    private int wakeupChip;
    @JsonProperty("initValue")
    private int initValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3175379673552011904L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wdt() {
    }

    /**
     * 
     * @param enable
     * @param timerWraparound
     * @param wakeupChip
     * @param initValue
     */
    public Wdt(int timerWraparound, int enable, int wakeupChip, int initValue) {
        super();
        this.timerWraparound = timerWraparound;
        this.enable = enable;
        this.wakeupChip = wakeupChip;
        this.initValue = initValue;
    }

    @JsonProperty("timerWraparound")
    public int getTimerWraparound() {
        return timerWraparound;
    }

    @JsonProperty("timerWraparound")
    public void setTimerWraparound(int timerWraparound) {
        this.timerWraparound = timerWraparound;
    }

    @JsonProperty("enable")
    public int getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(int enable) {
        this.enable = enable;
    }

    @JsonProperty("wakeupChip")
    public int getWakeupChip() {
        return wakeupChip;
    }

    @JsonProperty("wakeupChip")
    public void setWakeupChip(int wakeupChip) {
        this.wakeupChip = wakeupChip;
    }

    @JsonProperty("initValue")
    public int getInitValue() {
        return initValue;
    }

    @JsonProperty("initValue")
    public void setInitValue(int initValue) {
        this.initValue = initValue;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Wdt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timerWraparound");
        sb.append('=');
        sb.append(this.timerWraparound);
        sb.append(',');
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
        sb.append(',');
        sb.append("wakeupChip");
        sb.append('=');
        sb.append(this.wakeupChip);
        sb.append(',');
        sb.append("initValue");
        sb.append('=');
        sb.append(this.initValue);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+ this.timerWraparound);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.wakeupChip);
        result = ((result* 31)+ this.initValue);
        result = ((result* 31)+ this.enable);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wdt) == false) {
            return false;
        }
        Wdt rhs = ((Wdt) other);
        return (((((this.timerWraparound == rhs.timerWraparound)&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.wakeupChip == rhs.wakeupChip))&&(this.initValue == rhs.initValue))&&(this.enable == rhs.enable));
    }

}
