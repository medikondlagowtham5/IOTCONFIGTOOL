import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
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
    "trig1Low",
    "trig2Low",
    "trig2High",
    "trig3Low",
    "trig3High",
    "trig4Low",
    "trig4High",
    "trig1Src",
    "trig2Src",
    "trig3Src",
    "trig4Src",
    "triggerEn"
})
@Generated("jsonschema2pojo")
public class GlobalTrigSetting implements Serializable
{

    @JsonProperty("trig1Low")
    private int trig1Low;
    @JsonProperty("trig2Low")
    private int trig2Low;
    @JsonProperty("trig2High")
    private int trig2High;
    @JsonProperty("trig3Low")
    private int trig3Low;
    @JsonProperty("trig3High")
    private int trig3High;
    @JsonProperty("trig4Low")
    private int trig4Low;
    @JsonProperty("trig4High")
    private int trig4High;
    @JsonProperty("trig1Src")
    private String trig1Src;
    @JsonProperty("trig2Src")
    private String trig2Src;
    @JsonProperty("trig3Src")
    private String trig3Src;
    @JsonProperty("trig4Src")
    private String trig4Src;
    @JsonProperty("triggerEn")
    private List<Integer> triggerEn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4228176126568629805L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GlobalTrigSetting() {
    }

    /**
     * 
     * @param trig2Low
     * @param trig1Low
     * @param trig1Src
     * @param trig2Src
     * @param trig3Low
     * @param trig4High
     * @param trig3Src
     * @param trig3High
     * @param trig4Low
     * @param trig4Src
     * @param trig2High
     * @param triggerEn
     */
    public GlobalTrigSetting(int trig1Low, int trig2Low, int trig2High, int trig3Low, int trig3High, int trig4Low, int trig4High, String trig1Src, String trig2Src, String trig3Src, String trig4Src, List<Integer> triggerEn) {
        super();
        this.trig1Low = trig1Low;
        this.trig2Low = trig2Low;
        this.trig2High = trig2High;
        this.trig3Low = trig3Low;
        this.trig3High = trig3High;
        this.trig4Low = trig4Low;
        this.trig4High = trig4High;
        this.trig1Src = trig1Src;
        this.trig2Src = trig2Src;
        this.trig3Src = trig3Src;
        this.trig4Src = trig4Src;
        this.triggerEn = triggerEn;
    }

    @JsonProperty("trig1Low")
    public int getTrig1Low() {
        return trig1Low;
    }

    @JsonProperty("trig1Low")
    public void setTrig1Low(int trig1Low) {
        this.trig1Low = trig1Low;
    }

    @JsonProperty("trig2Low")
    public int getTrig2Low() {
        return trig2Low;
    }

    @JsonProperty("trig2Low")
    public void setTrig2Low(int trig2Low) {
        this.trig2Low = trig2Low;
    }

    @JsonProperty("trig2High")
    public int getTrig2High() {
        return trig2High;
    }

    @JsonProperty("trig2High")
    public void setTrig2High(int trig2High) {
        this.trig2High = trig2High;
    }

    @JsonProperty("trig3Low")
    public int getTrig3Low() {
        return trig3Low;
    }

    @JsonProperty("trig3Low")
    public void setTrig3Low(int trig3Low) {
        this.trig3Low = trig3Low;
    }

    @JsonProperty("trig3High")
    public int getTrig3High() {
        return trig3High;
    }

    @JsonProperty("trig3High")
    public void setTrig3High(int trig3High) {
        this.trig3High = trig3High;
    }

    @JsonProperty("trig4Low")
    public int getTrig4Low() {
        return trig4Low;
    }

    @JsonProperty("trig4Low")
    public void setTrig4Low(int trig4Low) {
        this.trig4Low = trig4Low;
    }

    @JsonProperty("trig4High")
    public int getTrig4High() {
        return trig4High;
    }

    @JsonProperty("trig4High")
    public void setTrig4High(int trig4High) {
        this.trig4High = trig4High;
    }

    @JsonProperty("trig1Src")
    public String getTrig1Src() {
        return trig1Src;
    }

    @JsonProperty("trig1Src")
    public void setTrig1Src(String trig1Src) {
        this.trig1Src = trig1Src;
    }

    @JsonProperty("trig2Src")
    public String getTrig2Src() {
        return trig2Src;
    }

    @JsonProperty("trig2Src")
    public void setTrig2Src(String trig2Src) {
        this.trig2Src = trig2Src;
    }

    @JsonProperty("trig3Src")
    public String getTrig3Src() {
        return trig3Src;
    }

    @JsonProperty("trig3Src")
    public void setTrig3Src(String trig3Src) {
        this.trig3Src = trig3Src;
    }

    @JsonProperty("trig4Src")
    public String getTrig4Src() {
        return trig4Src;
    }

    @JsonProperty("trig4Src")
    public void setTrig4Src(String trig4Src) {
        this.trig4Src = trig4Src;
    }

    @JsonProperty("triggerEn")
    public List<Integer> getTriggerEn() {
        return triggerEn;
    }

    @JsonProperty("triggerEn")
    public void setTriggerEn(List<Integer> triggerEn) {
        this.triggerEn = triggerEn;
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
        sb.append(GlobalTrigSetting.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trig1Low");
        sb.append('=');
        sb.append(this.trig1Low);
        sb.append(',');
        sb.append("trig2Low");
        sb.append('=');
        sb.append(this.trig2Low);
        sb.append(',');
        sb.append("trig2High");
        sb.append('=');
        sb.append(this.trig2High);
        sb.append(',');
        sb.append("trig3Low");
        sb.append('=');
        sb.append(this.trig3Low);
        sb.append(',');
        sb.append("trig3High");
        sb.append('=');
        sb.append(this.trig3High);
        sb.append(',');
        sb.append("trig4Low");
        sb.append('=');
        sb.append(this.trig4Low);
        sb.append(',');
        sb.append("trig4High");
        sb.append('=');
        sb.append(this.trig4High);
        sb.append(',');
        sb.append("trig1Src");
        sb.append('=');
        sb.append(((this.trig1Src == null)?"<null>":this.trig1Src));
        sb.append(',');
        sb.append("trig2Src");
        sb.append('=');
        sb.append(((this.trig2Src == null)?"<null>":this.trig2Src));
        sb.append(',');
        sb.append("trig3Src");
        sb.append('=');
        sb.append(((this.trig3Src == null)?"<null>":this.trig3Src));
        sb.append(',');
        sb.append("trig4Src");
        sb.append('=');
        sb.append(((this.trig4Src == null)?"<null>":this.trig4Src));
        sb.append(',');
        sb.append("triggerEn");
        sb.append('=');
        sb.append(((this.triggerEn == null)?"<null>":this.triggerEn));
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
        result = ((result* 31)+ this.trig2Low);
        result = ((result* 31)+ this.trig1Low);
        result = ((result* 31)+ this.trig3Low);
        result = ((result* 31)+ this.trig4High);
        result = ((result* 31)+ this.trig4Low);
        result = ((result* 31)+ this.trig2High);
        result = ((result* 31)+((this.trig1Src == null)? 0 :this.trig1Src.hashCode()));
        result = ((result* 31)+((this.trig2Src == null)? 0 :this.trig2Src.hashCode()));
        result = ((result* 31)+((this.trig3Src == null)? 0 :this.trig3Src.hashCode()));
        result = ((result* 31)+ this.trig3High);
        result = ((result* 31)+((this.trig4Src == null)? 0 :this.trig4Src.hashCode()));
        result = ((result* 31)+((this.triggerEn == null)? 0 :this.triggerEn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalTrigSetting) == false) {
            return false;
        }
        GlobalTrigSetting rhs = ((GlobalTrigSetting) other);
        return (((((((((((((this.trig2Low == rhs.trig2Low)&&(this.trig1Low == rhs.trig1Low))&&(this.trig3Low == rhs.trig3Low))&&(this.trig4High == rhs.trig4High))&&(this.trig4Low == rhs.trig4Low))&&(this.trig2High == rhs.trig2High))&&((this.trig1Src == rhs.trig1Src)||((this.trig1Src!= null)&&this.trig1Src.equals(rhs.trig1Src))))&&((this.trig2Src == rhs.trig2Src)||((this.trig2Src!= null)&&this.trig2Src.equals(rhs.trig2Src))))&&((this.trig3Src == rhs.trig3Src)||((this.trig3Src!= null)&&this.trig3Src.equals(rhs.trig3Src))))&&(this.trig3High == rhs.trig3High))&&((this.trig4Src == rhs.trig4Src)||((this.trig4Src!= null)&&this.trig4Src.equals(rhs.trig4Src))))&&((this.triggerEn == rhs.triggerEn)||((this.triggerEn!= null)&&this.triggerEn.equals(rhs.triggerEn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
