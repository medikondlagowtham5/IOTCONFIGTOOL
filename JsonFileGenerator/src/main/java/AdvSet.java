/*import java.util.List;

public class AdvSet {
    private int id;
    private List<Payload> payload;

    public AdvSet() {
        this.id = id;
        this.payload = payload;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}

 */

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
        "id",
        "bdAddr",
        "addrType",
        "addrKey",
        "addrGenInterval",
        "interval",
        "authEn",
        "authKey",
        "authSaltType",
        "authSaltValue",
        "authEaxCountType",
        "authEaxCountValue",
        "ui_format",
        "uid2tlm_ratio",
        "eddystoneTxPower",
        "chCtrl",
        "advModeTrigEn",
        "sensorTrigerSrc",
        "postTrigCtrlMode",
        "postTrigNumAdv",
        "trigCheckPeriod",
        "is1MPhy",
        "phyRate",
        "isStandardBle",
        "cte",
        "cteLen",
        "randomDlyType",
        "payloadVer",
        "payload"
})
@Generated("jsonschema2pojo")
public class AdvSet implements Serializable
{

    @JsonProperty("id")
    private static int id;
    @JsonProperty("bdAddr")
    private static String bdAddr;
    @JsonProperty("addrType")
    private static String addrType;
    @JsonProperty("addrKey")
    private static int addrKey;
    @JsonProperty("addrGenInterval")
    private static int addrGenInterval;
    @JsonProperty("interval")
    private int interval;
    @JsonProperty("authEn")
    private int authEn;
    @JsonProperty("authKey")
    private int authKey;
    @JsonProperty("authSaltType")
    private int authSaltType;
    @JsonProperty("authSaltValue")
    private int authSaltValue;
    @JsonProperty("authEaxCountType")
    private int authEaxCountType;
    @JsonProperty("authEaxCountValue")
    private int authEaxCountValue;
    @JsonProperty("ui_format")
    private String uiFormat;
    @JsonProperty("uid2tlm_ratio")
    private double uid2tlmRatio;
    @JsonProperty("eddystoneTxPower")
    private int eddystoneTxPower;
    @JsonProperty("chCtrl")
    private int chCtrl;
    @JsonProperty("advModeTrigEn")
    private int advModeTrigEn;
    @JsonProperty("sensorTrigerSrc")
    private List<String> sensorTrigerSrc;
    @JsonProperty("postTrigCtrlMode")
    private int postTrigCtrlMode;
    @JsonProperty("postTrigNumAdv")
    private int postTrigNumAdv;
    @JsonProperty("trigCheckPeriod")
    private int trigCheckPeriod;
    @JsonProperty("is1MPhy")
    private int is1MPhy;
    @JsonProperty("phyRate")
    private String phyRate;
    @JsonProperty("isStandardBle")
    private int isStandardBle;
    @JsonProperty("cte")
    private int cte;
    @JsonProperty("cteLen")
    private int cteLen;
    @JsonProperty("randomDlyType")
    private int randomDlyType;
    @JsonProperty("payloadVer")
    private int payloadVer;
    @JsonProperty("payload")
    private List<Payload> payload;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -2484565383911864313L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AdvSet() {
    }

    /**
     *
     * @param phyRate
     * @param trigCheckPeriod
     * @param authSaltType
     * @param isStandardBle
     * @param bdAddr
     * @param cte
     * @param payload
     * @param postTrigNumAdv
     * @param id
     * @param authEn
     * @param uid2tlmRatio
     * @param addrType
     * @param cteLen
     * @param authKey
     * @param randomDlyType
     * @param advModeTrigEn
     * @param authEaxCountValue
     * @param authEaxCountType
     * @param eddystoneTxPower
     * @param postTrigCtrlMode
     * @param uiFormat
     * @param authSaltValue
     * @param sensorTrigerSrc
     * @param addrKey
     * @param chCtrl
     * @param is1MPhy
     * @param interval
     * @param payloadVer
     * @param addrGenInterval
     */
    public AdvSet(int id, String bdAddr, String addrType, int addrKey, int addrGenInterval, int interval, int authEn, int authKey, int authSaltType, int authSaltValue, int authEaxCountType, int authEaxCountValue, String uiFormat, double uid2tlmRatio, int eddystoneTxPower, int chCtrl, int advModeTrigEn, List<String> sensorTrigerSrc, int postTrigCtrlMode, int postTrigNumAdv, int trigCheckPeriod, int is1MPhy, String phyRate, int isStandardBle, int cte, int cteLen, int randomDlyType, int payloadVer, List<Payload> payload) {
        super();
        this.id = id;
        this.bdAddr = bdAddr;
        this.addrType = addrType;
        this.addrKey = addrKey;
        this.addrGenInterval = addrGenInterval;
        this.interval = interval;
        this.authEn = authEn;
        this.authKey = authKey;
        this.authSaltType = authSaltType;
        this.authSaltValue = authSaltValue;
        this.authEaxCountType = authEaxCountType;
        this.authEaxCountValue = authEaxCountValue;
        this.uiFormat = uiFormat;
        this.uid2tlmRatio = uid2tlmRatio;
        this.eddystoneTxPower = eddystoneTxPower;
        this.chCtrl = chCtrl;
        this.advModeTrigEn = advModeTrigEn;
        this.sensorTrigerSrc = sensorTrigerSrc;
        this.postTrigCtrlMode = postTrigCtrlMode;
        this.postTrigNumAdv = postTrigNumAdv;
        this.trigCheckPeriod = trigCheckPeriod;
        this.is1MPhy = is1MPhy;
        this.phyRate = phyRate;
        this.isStandardBle = isStandardBle;
        this.cte = cte;
        this.cteLen = cteLen;
        this.randomDlyType = randomDlyType;
        this.payloadVer = payloadVer;
        this.payload = payload;
    }

    @JsonProperty("id")
    public static int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("bdAddr")
    public static String getBdAddr() {
        return bdAddr;
    }

    @JsonProperty("bdAddr")
    public void setBdAddr(String bdAddr) {
        this.bdAddr = bdAddr;
    }

    @JsonProperty("addrType")
    public static String getAddrType() {
        return addrType;
    }

    @JsonProperty("addrType")
    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    @JsonProperty("addrKey")
    public static int getAddrKey() {
        return addrKey;
    }

    @JsonProperty("addrKey")
    public void setAddrKey(int addrKey) {
        this.addrKey = addrKey;
    }

    @JsonProperty("addrGenInterval")
    public static int getAddrGenInterval() {
        return addrGenInterval;
    }

    @JsonProperty("addrGenInterval")
    public void setAddrGenInterval(int addrGenInterval) {
        this.addrGenInterval = addrGenInterval;
    }

    @JsonProperty("interval")
    public int getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(int interval) {
        this.interval = interval;
    }

    @JsonProperty("authEn")
    public int getAuthEn() {
        return authEn;
    }

    @JsonProperty("authEn")
    public void setAuthEn(int authEn) {
        this.authEn = authEn;
    }

    @JsonProperty("authKey")
    public int getAuthKey() {
        return authKey;
    }

    @JsonProperty("authKey")
    public void setAuthKey(int authKey) {
        this.authKey = authKey;
    }

    @JsonProperty("authSaltType")
    public int getAuthSaltType() {
        return authSaltType;
    }

    @JsonProperty("authSaltType")
    public void setAuthSaltType(int authSaltType) {
        this.authSaltType = authSaltType;
    }

    @JsonProperty("authSaltValue")
    public int getAuthSaltValue() {
        return authSaltValue;
    }

    @JsonProperty("authSaltValue")
    public void setAuthSaltValue(int authSaltValue) {
        this.authSaltValue = authSaltValue;
    }

    @JsonProperty("authEaxCountType")
    public int getAuthEaxCountType() {
        return authEaxCountType;
    }

    @JsonProperty("authEaxCountType")
    public void setAuthEaxCountType(int authEaxCountType) {
        this.authEaxCountType = authEaxCountType;
    }

    @JsonProperty("authEaxCountValue")
    public int getAuthEaxCountValue() {
        return authEaxCountValue;
    }

    @JsonProperty("authEaxCountValue")
    public void setAuthEaxCountValue(int authEaxCountValue) {
        this.authEaxCountValue = authEaxCountValue;
    }

    @JsonProperty("ui_format")
    public String getUiFormat() {
        return uiFormat;
    }

    @JsonProperty("ui_format")
    public void setUiFormat(String uiFormat) {
        this.uiFormat = uiFormat;
    }

    @JsonProperty("uid2tlm_ratio")
    public double getUid2tlmRatio() {
        return uid2tlmRatio;
    }

    @JsonProperty("uid2tlm_ratio")
    public void setUid2tlmRatio(double uid2tlmRatio) {
        this.uid2tlmRatio = uid2tlmRatio;
    }

    @JsonProperty("eddystoneTxPower")
    public int getEddystoneTxPower() {
        return eddystoneTxPower;
    }

    @JsonProperty("eddystoneTxPower")
    public void setEddystoneTxPower(int eddystoneTxPower) {
        this.eddystoneTxPower = eddystoneTxPower;
    }

    @JsonProperty("chCtrl")
    public int getChCtrl() {
        return chCtrl;
    }

    @JsonProperty("chCtrl")
    public void setChCtrl(int chCtrl) {
        this.chCtrl = chCtrl;
    }

    @JsonProperty("advModeTrigEn")
    public int getAdvModeTrigEn() {
        return advModeTrigEn;
    }

    @JsonProperty("advModeTrigEn")
    public void setAdvModeTrigEn(int advModeTrigEn) {
        this.advModeTrigEn = advModeTrigEn;
    }

    @JsonProperty("sensorTrigerSrc")
    public List<String> getSensorTrigerSrc() {
        return sensorTrigerSrc;
    }

    @JsonProperty("sensorTrigerSrc")
    public void setSensorTrigerSrc(List<String> sensorTrigerSrc) {
        this.sensorTrigerSrc = sensorTrigerSrc;
    }

    @JsonProperty("postTrigCtrlMode")
    public int getPostTrigCtrlMode() {
        return postTrigCtrlMode;
    }

    @JsonProperty("postTrigCtrlMode")
    public void setPostTrigCtrlMode(int postTrigCtrlMode) {
        this.postTrigCtrlMode = postTrigCtrlMode;
    }

    @JsonProperty("postTrigNumAdv")
    public int getPostTrigNumAdv() {
        return postTrigNumAdv;
    }

    @JsonProperty("postTrigNumAdv")
    public void setPostTrigNumAdv(int postTrigNumAdv) {
        this.postTrigNumAdv = postTrigNumAdv;
    }

    @JsonProperty("trigCheckPeriod")
    public int getTrigCheckPeriod() {
        return trigCheckPeriod;
    }

    @JsonProperty("trigCheckPeriod")
    public void setTrigCheckPeriod(int trigCheckPeriod) {
        this.trigCheckPeriod = trigCheckPeriod;
    }

    @JsonProperty("is1MPhy")
    public int getIs1MPhy() {
        return is1MPhy;
    }

    @JsonProperty("is1MPhy")
    public void setIs1MPhy(int is1MPhy) {
        this.is1MPhy = is1MPhy;
    }

    @JsonProperty("phyRate")
    public String getPhyRate() {
        return phyRate;
    }

    @JsonProperty("phyRate")
    public void setPhyRate(String phyRate) {
        this.phyRate = phyRate;
    }

    @JsonProperty("isStandardBle")
    public int getIsStandardBle() {
        return isStandardBle;
    }

    @JsonProperty("isStandardBle")
    public void setIsStandardBle(int isStandardBle) {
        this.isStandardBle = isStandardBle;
    }

    @JsonProperty("cte")
    public int getCte() {
        return cte;
    }

    @JsonProperty("cte")
    public void setCte(int cte) {
        this.cte = cte;
    }

    @JsonProperty("cteLen")
    public int getCteLen() {
        return cteLen;
    }

    @JsonProperty("cteLen")
    public void setCteLen(int cteLen) {
        this.cteLen = cteLen;
    }

    @JsonProperty("randomDlyType")
    public int getRandomDlyType() {
        return randomDlyType;
    }

    @JsonProperty("randomDlyType")
    public void setRandomDlyType(int randomDlyType) {
        this.randomDlyType = randomDlyType;
    }

    @JsonProperty("payloadVer")
    public int getPayloadVer() {
        return payloadVer;
    }

    @JsonProperty("payloadVer")
    public void setPayloadVer(int payloadVer) {
        this.payloadVer = payloadVer;
    }

    @JsonProperty("payload")
    public List<Payload> getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(List<Payload> payload) {
        this.payload = payload;
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
        sb.append(AdvSet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("bdAddr");
        sb.append('=');
        sb.append(((this.bdAddr == null)?"<null>":this.bdAddr));
        sb.append(',');
        sb.append("addrType");
        sb.append('=');
        sb.append(((this.addrType == null)?"<null>":this.addrType));
        sb.append(',');
        sb.append("addrKey");
        sb.append('=');
        sb.append(this.addrKey);
        sb.append(',');
        sb.append("addrGenInterval");
        sb.append('=');
        sb.append(this.addrGenInterval);
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(this.interval);
        sb.append(',');
        sb.append("authEn");
        sb.append('=');
        sb.append(this.authEn);
        sb.append(',');
        sb.append("authKey");
        sb.append('=');
        sb.append(this.authKey);
        sb.append(',');
        sb.append("authSaltType");
        sb.append('=');
        sb.append(this.authSaltType);
        sb.append(',');
        sb.append("authSaltValue");
        sb.append('=');
        sb.append(this.authSaltValue);
        sb.append(',');
        sb.append("authEaxCountType");
        sb.append('=');
        sb.append(this.authEaxCountType);
        sb.append(',');
        sb.append("authEaxCountValue");
        sb.append('=');
        sb.append(this.authEaxCountValue);
        sb.append(',');
        sb.append("uiFormat");
        sb.append('=');
        sb.append(((this.uiFormat == null)?"<null>":this.uiFormat));
        sb.append(',');
        sb.append("uid2tlmRatio");
        sb.append('=');
        sb.append(this.uid2tlmRatio);
        sb.append(',');
        sb.append("eddystoneTxPower");
        sb.append('=');
        sb.append(this.eddystoneTxPower);
        sb.append(',');
        sb.append("chCtrl");
        sb.append('=');
        sb.append(this.chCtrl);
        sb.append(',');
        sb.append("advModeTrigEn");
        sb.append('=');
        sb.append(this.advModeTrigEn);
        sb.append(',');
        sb.append("sensorTrigerSrc");
        sb.append('=');
        sb.append(((this.sensorTrigerSrc == null)?"<null>":this.sensorTrigerSrc));
        sb.append(',');
        sb.append("postTrigCtrlMode");
        sb.append('=');
        sb.append(this.postTrigCtrlMode);
        sb.append(',');
        sb.append("postTrigNumAdv");
        sb.append('=');
        sb.append(this.postTrigNumAdv);
        sb.append(',');
        sb.append("trigCheckPeriod");
        sb.append('=');
        sb.append(this.trigCheckPeriod);
        sb.append(',');
        sb.append("is1MPhy");
        sb.append('=');
        sb.append(this.is1MPhy);
        sb.append(',');
        sb.append("phyRate");
        sb.append('=');
        sb.append(((this.phyRate == null)?"<null>":this.phyRate));
        sb.append(',');
        sb.append("isStandardBle");
        sb.append('=');
        sb.append(this.isStandardBle);
        sb.append(',');
        sb.append("cte");
        sb.append('=');
        sb.append(this.cte);
        sb.append(',');
        sb.append("cteLen");
        sb.append('=');
        sb.append(this.cteLen);
        sb.append(',');
        sb.append("randomDlyType");
        sb.append('=');
        sb.append(this.randomDlyType);
        sb.append(',');
        sb.append("payloadVer");
        sb.append('=');
        sb.append(this.payloadVer);
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
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
        result = ((result* 31)+((this.phyRate == null)? 0 :this.phyRate.hashCode()));
        result = ((result* 31)+ this.trigCheckPeriod);
        result = ((result* 31)+ this.authSaltType);
        result = ((result* 31)+ this.isStandardBle);
        result = ((result* 31)+((this.bdAddr == null)? 0 :this.bdAddr.hashCode()));
        result = ((result* 31)+ this.cte);
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+ this.postTrigNumAdv);
        result = ((result* 31)+ this.id);
        result = ((result* 31)+ this.authEn);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.uid2tlmRatio)^(Double.doubleToLongBits(this.uid2tlmRatio)>>> 32))));
        result = ((result* 31)+((this.addrType == null)? 0 :this.addrType.hashCode()));
        result = ((result* 31)+ this.cteLen);
        result = ((result* 31)+ this.authKey);
        result = ((result* 31)+ this.randomDlyType);
        result = ((result* 31)+ this.advModeTrigEn);
        result = ((result* 31)+ this.authEaxCountValue);
        result = ((result* 31)+ this.authEaxCountType);
        result = ((result* 31)+ this.eddystoneTxPower);
        result = ((result* 31)+ this.postTrigCtrlMode);
        result = ((result* 31)+((this.uiFormat == null)? 0 :this.uiFormat.hashCode()));
        result = ((result* 31)+ this.authSaltValue);
        result = ((result* 31)+((this.sensorTrigerSrc == null)? 0 :this.sensorTrigerSrc.hashCode()));
        result = ((result* 31)+ this.addrKey);
        result = ((result* 31)+ this.chCtrl);
        result = ((result* 31)+ this.is1MPhy);
        result = ((result* 31)+ this.interval);
        result = ((result* 31)+ this.payloadVer);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.addrGenInterval);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvSet) == false) {
            return false;
        }
        AdvSet rhs = ((AdvSet) other);
        return (((((((((((((((((((((((((((((((this.phyRate == rhs.phyRate)||((this.phyRate!= null)&&this.phyRate.equals(rhs.phyRate)))&&(this.trigCheckPeriod == rhs.trigCheckPeriod))&&(this.authSaltType == rhs.authSaltType))&&(this.isStandardBle == rhs.isStandardBle))&&((this.bdAddr == rhs.bdAddr)||((this.bdAddr!= null)&&this.bdAddr.equals(rhs.bdAddr))))&&(this.cte == rhs.cte))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&(this.postTrigNumAdv == rhs.postTrigNumAdv))&&(this.id == rhs.id))&&(this.authEn == rhs.authEn))&&(Double.doubleToLongBits(this.uid2tlmRatio) == Double.doubleToLongBits(rhs.uid2tlmRatio)))&&((this.addrType == rhs.addrType)||((this.addrType!= null)&&this.addrType.equals(rhs.addrType))))&&(this.cteLen == rhs.cteLen))&&(this.authKey == rhs.authKey))&&(this.randomDlyType == rhs.randomDlyType))&&(this.advModeTrigEn == rhs.advModeTrigEn))&&(this.authEaxCountValue == rhs.authEaxCountValue))&&(this.authEaxCountType == rhs.authEaxCountType))&&(this.eddystoneTxPower == rhs.eddystoneTxPower))&&(this.postTrigCtrlMode == rhs.postTrigCtrlMode))&&((this.uiFormat == rhs.uiFormat)||((this.uiFormat!= null)&&this.uiFormat.equals(rhs.uiFormat))))&&(this.authSaltValue == rhs.authSaltValue))&&((this.sensorTrigerSrc == rhs.sensorTrigerSrc)||((this.sensorTrigerSrc!= null)&&this.sensorTrigerSrc.equals(rhs.sensorTrigerSrc))))&&(this.addrKey == rhs.addrKey))&&(this.chCtrl == rhs.chCtrl))&&(this.is1MPhy == rhs.is1MPhy))&&(this.interval == rhs.interval))&&(this.payloadVer == rhs.payloadVer))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.addrGenInterval == rhs.addrGenInterval));
    }

}
