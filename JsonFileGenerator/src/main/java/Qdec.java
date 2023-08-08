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
    "enable",
    "runGpioEdgeDetect",
    "clearCount",
    "endCode",
    "twoStep",
    "interval",
    "timeout",
    "gpio",
    "code"
})
@Generated("jsonschema2pojo")
public class Qdec implements Serializable
{

    @JsonProperty("enable")
    private int enable;
    @JsonProperty("runGpioEdgeDetect")
    private int runGpioEdgeDetect;
    @JsonProperty("clearCount")
    private int clearCount;
    @JsonProperty("endCode")
    private int endCode;
    @JsonProperty("twoStep")
    private int twoStep;
    @JsonProperty("interval")
    private int interval;
    @JsonProperty("timeout")
    private int timeout;
    @JsonProperty("gpio")
    private List<Object> gpio;
    @JsonProperty("code")
    private List<Object> code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4722179970432718561L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Qdec() {
    }

    /**
     * 
     * @param endCode
     * @param code
     * @param enable
     * @param clearCount
     * @param interval
     * @param runGpioEdgeDetect
     * @param timeout
     * @param twoStep
     * @param gpio
     */
    public Qdec(int enable, int runGpioEdgeDetect, int clearCount, int endCode, int twoStep, int interval, int timeout, List<Object> gpio, List<Object> code) {
        super();
        this.enable = enable;
        this.runGpioEdgeDetect = runGpioEdgeDetect;
        this.clearCount = clearCount;
        this.endCode = endCode;
        this.twoStep = twoStep;
        this.interval = interval;
        this.timeout = timeout;
        this.gpio = gpio;
        this.code = code;
    }

    @JsonProperty("enable")
    public int getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(int enable) {
        this.enable = enable;
    }

    @JsonProperty("runGpioEdgeDetect")
    public int getRunGpioEdgeDetect() {
        return runGpioEdgeDetect;
    }

    @JsonProperty("runGpioEdgeDetect")
    public void setRunGpioEdgeDetect(int runGpioEdgeDetect) {
        this.runGpioEdgeDetect = runGpioEdgeDetect;
    }

    @JsonProperty("clearCount")
    public int getClearCount() {
        return clearCount;
    }

    @JsonProperty("clearCount")
    public void setClearCount(int clearCount) {
        this.clearCount = clearCount;
    }

    @JsonProperty("endCode")
    public int getEndCode() {
        return endCode;
    }

    @JsonProperty("endCode")
    public void setEndCode(int endCode) {
        this.endCode = endCode;
    }

    @JsonProperty("twoStep")
    public int getTwoStep() {
        return twoStep;
    }

    @JsonProperty("twoStep")
    public void setTwoStep(int twoStep) {
        this.twoStep = twoStep;
    }

    @JsonProperty("interval")
    public int getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(int interval) {
        this.interval = interval;
    }

    @JsonProperty("timeout")
    public int getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @JsonProperty("gpio")
    public List<Object> getGpio() {
        return gpio;
    }

    @JsonProperty("gpio")
    public void setGpio(List<Object> gpio) {
        this.gpio = gpio;
    }

    @JsonProperty("code")
    public List<Object> getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(List<Object> code) {
        this.code = code;
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
        sb.append(Qdec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
        sb.append(',');
        sb.append("runGpioEdgeDetect");
        sb.append('=');
        sb.append(this.runGpioEdgeDetect);
        sb.append(',');
        sb.append("clearCount");
        sb.append('=');
        sb.append(this.clearCount);
        sb.append(',');
        sb.append("endCode");
        sb.append('=');
        sb.append(this.endCode);
        sb.append(',');
        sb.append("twoStep");
        sb.append('=');
        sb.append(this.twoStep);
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(this.interval);
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(this.timeout);
        sb.append(',');
        sb.append("gpio");
        sb.append('=');
        sb.append(((this.gpio == null)?"<null>":this.gpio));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+ this.endCode);
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+ this.enable);
        result = ((result* 31)+ this.clearCount);
        result = ((result* 31)+ this.interval);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.runGpioEdgeDetect);
        result = ((result* 31)+ this.timeout);
        result = ((result* 31)+ this.twoStep);
        result = ((result* 31)+((this.gpio == null)? 0 :this.gpio.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Qdec) == false) {
            return false;
        }
        Qdec rhs = ((Qdec) other);
        return ((((((((((this.endCode == rhs.endCode)&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&(this.enable == rhs.enable))&&(this.clearCount == rhs.clearCount))&&(this.interval == rhs.interval))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.runGpioEdgeDetect == rhs.runGpioEdgeDetect))&&(this.timeout == rhs.timeout))&&(this.twoStep == rhs.twoStep))&&((this.gpio == rhs.gpio)||((this.gpio!= null)&&this.gpio.equals(rhs.gpio))));
    }

}
