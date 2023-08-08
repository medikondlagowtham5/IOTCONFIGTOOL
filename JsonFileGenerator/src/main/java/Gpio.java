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
    "id",
    "digital",
    "pu-pd",
    "wakeup",
    "advTrig",
    "latch",
    "maskb"
})
@Generated("jsonschema2pojo")
public class Gpio implements Serializable
{

    @JsonProperty("id")
    private int id;
    @JsonProperty("digital")
    private String digital;
    @JsonProperty("pu-pd")
    private int puPd;
    @JsonProperty("wakeup")
    private String wakeup;
    @JsonProperty("advTrig")
    private String advTrig;
    @JsonProperty("latch")
    private int latch;
    @JsonProperty("maskb")
    private int maskb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3260505031468839635L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Gpio() {
    }

    /**
     * 
     * @param digital
     * @param wakeup
     * @param advTrig
     * @param id
     * @param latch
     * @param maskb
     * @param puPd
     */
    public Gpio(int id, String digital, int puPd, String wakeup, String advTrig, int latch, int maskb) {
        super();
        this.id = id;
        this.digital = digital;
        this.puPd = puPd;
        this.wakeup = wakeup;
        this.advTrig = advTrig;
        this.latch = latch;
        this.maskb = maskb;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("digital")
    public String getDigital() {
        return digital;
    }

    @JsonProperty("digital")
    public void setDigital(String digital) {
        this.digital = digital;
    }

    @JsonProperty("pu-pd")
    public int getPuPd() {
        return puPd;
    }

    @JsonProperty("pu-pd")
    public void setPuPd(int puPd) {
        this.puPd = puPd;
    }

    @JsonProperty("wakeup")
    public String getWakeup() {
        return wakeup;
    }

    @JsonProperty("wakeup")
    public void setWakeup(String wakeup) {
        this.wakeup = wakeup;
    }

    @JsonProperty("advTrig")
    public String getAdvTrig() {
        return advTrig;
    }

    @JsonProperty("advTrig")
    public void setAdvTrig(String advTrig) {
        this.advTrig = advTrig;
    }

    @JsonProperty("latch")
    public int getLatch() {
        return latch;
    }

    @JsonProperty("latch")
    public void setLatch(int latch) {
        this.latch = latch;
    }

    @JsonProperty("maskb")
    public int getMaskb() {
        return maskb;
    }

    @JsonProperty("maskb")
    public void setMaskb(int maskb) {
        this.maskb = maskb;
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
        sb.append(Gpio.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("digital");
        sb.append('=');
        sb.append(((this.digital == null)?"<null>":this.digital));
        sb.append(',');
        sb.append("puPd");
        sb.append('=');
        sb.append(this.puPd);
        sb.append(',');
        sb.append("wakeup");
        sb.append('=');
        sb.append(((this.wakeup == null)?"<null>":this.wakeup));
        sb.append(',');
        sb.append("advTrig");
        sb.append('=');
        sb.append(((this.advTrig == null)?"<null>":this.advTrig));
        sb.append(',');
        sb.append("latch");
        sb.append('=');
        sb.append(this.latch);
        sb.append(',');
        sb.append("maskb");
        sb.append('=');
        sb.append(this.maskb);
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
        result = ((result* 31)+((this.digital == null)? 0 :this.digital.hashCode()));
        result = ((result* 31)+((this.wakeup == null)? 0 :this.wakeup.hashCode()));
        result = ((result* 31)+((this.advTrig == null)? 0 :this.advTrig.hashCode()));
        result = ((result* 31)+ this.id);
        result = ((result* 31)+ this.latch);
        result = ((result* 31)+ this.maskb);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.puPd);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gpio) == false) {
            return false;
        }
        Gpio rhs = ((Gpio) other);
        return (((((((((this.digital == rhs.digital)||((this.digital!= null)&&this.digital.equals(rhs.digital)))&&((this.wakeup == rhs.wakeup)||((this.wakeup!= null)&&this.wakeup.equals(rhs.wakeup))))&&((this.advTrig == rhs.advTrig)||((this.advTrig!= null)&&this.advTrig.equals(rhs.advTrig))))&&(this.id == rhs.id))&&(this.latch == rhs.latch))&&(this.maskb == rhs.maskb))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.puPd == rhs.puPd));
    }

}
