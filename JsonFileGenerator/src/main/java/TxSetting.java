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
    "txPower",
    "txPaGain",
    "sleepAftTx",
    "uartSingleWire",
    "uartPinSel",
    "xoCap",
    "xoStableTime",
    "xoGm",
    "ch0",
    "ch1",
    "ch2",
    "key0"
})
@Generated("jsonschema2pojo")
public class TxSetting implements Serializable
{

    @JsonProperty("txPower")
    private int txPower;
    @JsonProperty("txPaGain")
    private int txPaGain;
    @JsonProperty("sleepAftTx")
    private int sleepAftTx;
    @JsonProperty("uartSingleWire")
    private int uartSingleWire;
    @JsonProperty("uartPinSel")
    private int uartPinSel;
    @JsonProperty("xoCap")
    private int xoCap;
    @JsonProperty("xoStableTime")
    private int xoStableTime;
    @JsonProperty("xoGm")
    private int xoGm;
    @JsonProperty("ch0")
    private int ch0;
    @JsonProperty("ch1")
    private int ch1;
    @JsonProperty("ch2")
    private int ch2;
    @JsonProperty("key0")
    private String key0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3402429547110449642L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TxSetting() {
    }

    /**
     * 
     * @param txPower
     * @param key0
     * @param txPaGain
     * @param uartPinSel
     * @param xoCap
     * @param xoGm
     * @param sleepAftTx
     * @param xoStableTime
     * @param ch0
     * @param uartSingleWire
     * @param ch2
     * @param ch1
     */
    public TxSetting(int txPower, int txPaGain, int sleepAftTx, int uartSingleWire, int uartPinSel, int xoCap, int xoStableTime, int xoGm, int ch0, int ch1, int ch2, String key0) {
        super();
        this.txPower = txPower;
        this.txPaGain = txPaGain;
        this.sleepAftTx = sleepAftTx;
        this.uartSingleWire = uartSingleWire;
        this.uartPinSel = uartPinSel;
        this.xoCap = xoCap;
        this.xoStableTime = xoStableTime;
        this.xoGm = xoGm;
        this.ch0 = ch0;
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.key0 = key0;
    }

    @JsonProperty("txPower")
    public int getTxPower() {
        return txPower;
    }

    @JsonProperty("txPower")
    public void setTxPower(int txPower) {
        this.txPower = txPower;
    }

    @JsonProperty("txPaGain")
    public int getTxPaGain() {
        return txPaGain;
    }

    @JsonProperty("txPaGain")
    public void setTxPaGain(int txPaGain) {
        this.txPaGain = txPaGain;
    }

    @JsonProperty("sleepAftTx")
    public int getSleepAftTx() {
        return sleepAftTx;
    }

    @JsonProperty("sleepAftTx")
    public void setSleepAftTx(int sleepAftTx) {
        this.sleepAftTx = sleepAftTx;
    }

    @JsonProperty("uartSingleWire")
    public int getUartSingleWire() {
        return uartSingleWire;
    }

    @JsonProperty("uartSingleWire")
    public void setUartSingleWire(int uartSingleWire) {
        this.uartSingleWire = uartSingleWire;
    }

    @JsonProperty("uartPinSel")
    public int getUartPinSel() {
        return uartPinSel;
    }

    @JsonProperty("uartPinSel")
    public void setUartPinSel(int uartPinSel) {
        this.uartPinSel = uartPinSel;
    }

    @JsonProperty("xoCap")
    public int getXoCap() {
        return xoCap;
    }

    @JsonProperty("xoCap")
    public void setXoCap(int xoCap) {
        this.xoCap = xoCap;
    }

    @JsonProperty("xoStableTime")
    public int getXoStableTime() {
        return xoStableTime;
    }

    @JsonProperty("xoStableTime")
    public void setXoStableTime(int xoStableTime) {
        this.xoStableTime = xoStableTime;
    }

    @JsonProperty("xoGm")
    public int getXoGm() {
        return xoGm;
    }

    @JsonProperty("xoGm")
    public void setXoGm(int xoGm) {
        this.xoGm = xoGm;
    }

    @JsonProperty("ch0")
    public int getCh0() {
        return ch0;
    }

    @JsonProperty("ch0")
    public void setCh0(int ch0) {
        this.ch0 = ch0;
    }

    @JsonProperty("ch1")
    public int getCh1() {
        return ch1;
    }

    @JsonProperty("ch1")
    public void setCh1(int ch1) {
        this.ch1 = ch1;
    }

    @JsonProperty("ch2")
    public int getCh2() {
        return ch2;
    }

    @JsonProperty("ch2")
    public void setCh2(int ch2) {
        this.ch2 = ch2;
    }

    @JsonProperty("key0")
    public String getKey0() {
        return key0;
    }

    @JsonProperty("key0")
    public void setKey0(String key0) {
        this.key0 = key0;
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
        sb.append(TxSetting.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("txPower");
        sb.append('=');
        sb.append(this.txPower);
        sb.append(',');
        sb.append("txPaGain");
        sb.append('=');
        sb.append(this.txPaGain);
        sb.append(',');
        sb.append("sleepAftTx");
        sb.append('=');
        sb.append(this.sleepAftTx);
        sb.append(',');
        sb.append("uartSingleWire");
        sb.append('=');
        sb.append(this.uartSingleWire);
        sb.append(',');
        sb.append("uartPinSel");
        sb.append('=');
        sb.append(this.uartPinSel);
        sb.append(',');
        sb.append("xoCap");
        sb.append('=');
        sb.append(this.xoCap);
        sb.append(',');
        sb.append("xoStableTime");
        sb.append('=');
        sb.append(this.xoStableTime);
        sb.append(',');
        sb.append("xoGm");
        sb.append('=');
        sb.append(this.xoGm);
        sb.append(',');
        sb.append("ch0");
        sb.append('=');
        sb.append(this.ch0);
        sb.append(',');
        sb.append("ch1");
        sb.append('=');
        sb.append(this.ch1);
        sb.append(',');
        sb.append("ch2");
        sb.append('=');
        sb.append(this.ch2);
        sb.append(',');
        sb.append("key0");
        sb.append('=');
        sb.append(((this.key0 == null)?"<null>":this.key0));
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
        result = ((result* 31)+((this.key0 == null)? 0 :this.key0 .hashCode()));
        result = ((result* 31)+ this.txPaGain);
        result = ((result* 31)+ this.uartPinSel);
        result = ((result* 31)+ this.xoGm);
        result = ((result* 31)+ this.xoStableTime);
        result = ((result* 31)+ this.ch0);
        result = ((result* 31)+ this.ch2);
        result = ((result* 31)+ this.ch1);
        result = ((result* 31)+ this.txPower);
        result = ((result* 31)+ this.xoCap);
        result = ((result* 31)+ this.sleepAftTx);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.uartSingleWire);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TxSetting) == false) {
            return false;
        }
        TxSetting rhs = ((TxSetting) other);
        return ((((((((((((((this.key0 == rhs.key0)||((this.key0 != null)&&this.key0 .equals(rhs.key0)))&&(this.txPaGain == rhs.txPaGain))&&(this.uartPinSel == rhs.uartPinSel))&&(this.xoGm == rhs.xoGm))&&(this.xoStableTime == rhs.xoStableTime))&&(this.ch0 == rhs.ch0))&&(this.ch2 == rhs.ch2))&&(this.ch1 == rhs.ch1))&&(this.txPower == rhs.txPower))&&(this.xoCap == rhs.xoCap))&&(this.sleepAftTx == rhs.sleepAftTx))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.uartSingleWire == rhs.uartSingleWire));
    }

}
