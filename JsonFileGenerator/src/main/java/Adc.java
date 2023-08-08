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
    "ch",
    "enable"
})
@Generated("jsonschema2pojo")
public class Adc implements Serializable
{

    @JsonProperty("ch")
    private int ch;
    @JsonProperty("enable")
    private int enable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3092006110919767108L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Adc() {
    }

    /**
     * 
     * @param ch
     * @param enable
     */
    public Adc(int ch, int enable) {
        super();
        this.ch = ch;
        this.enable = enable;
    }

    @JsonProperty("ch")
    public int getCh() {
        return ch;
    }

    @JsonProperty("ch")
    public void setCh(int ch) {
        this.ch = ch;
    }

    @JsonProperty("enable")
    public int getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(int enable) {
        this.enable = enable;
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
        sb.append(Adc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ch");
        sb.append('=');
        sb.append(this.ch);
        sb.append(',');
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.ch);
        result = ((result* 31)+ this.enable);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Adc) == false) {
            return false;
        }
        Adc rhs = ((Adc) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&(this.ch == rhs.ch))&&(this.enable == rhs.enable));
    }

}
