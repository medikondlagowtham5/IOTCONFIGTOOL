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
    "coldBootEn",
    "warmBootEn"
})
@Generated("jsonschema2pojo")
public class I2c3 implements Serializable
{

    @JsonProperty("coldBootEn")
    private int coldBootEn;
    @JsonProperty("warmBootEn")
    private int warmBootEn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 2721976615082838326L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public I2c3() {
    }

    /**
     * 
     * @param coldBootEn
     * @param warmBootEn
     */
    public I2c3(int coldBootEn, int warmBootEn) {
        super();
        this.coldBootEn = coldBootEn;
        this.warmBootEn = warmBootEn;
    }

    @JsonProperty("coldBootEn")
    public int getColdBootEn() {
        return coldBootEn;
    }

    @JsonProperty("coldBootEn")
    public void setColdBootEn(int coldBootEn) {
        this.coldBootEn = coldBootEn;
    }

    @JsonProperty("warmBootEn")
    public int getWarmBootEn() {
        return warmBootEn;
    }

    @JsonProperty("warmBootEn")
    public void setWarmBootEn(int warmBootEn) {
        this.warmBootEn = warmBootEn;
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
        sb.append(I2c3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coldBootEn");
        sb.append('=');
        sb.append(this.coldBootEn);
        sb.append(',');
        sb.append("warmBootEn");
        sb.append('=');
        sb.append(this.warmBootEn);
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
        result = ((result* 31)+ this.coldBootEn);
        result = ((result* 31)+ this.warmBootEn);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof I2c3) == false) {
            return false;
        }
        I2c3 rhs = ((I2c3) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&(this.coldBootEn == rhs.coldBootEn))&&(this.warmBootEn == rhs.warmBootEn));
    }

}
