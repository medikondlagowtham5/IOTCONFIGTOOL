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
    "version",
    "advSet",
    "txSetting",
    "gpio",
    "vccUnit",
    "tempUnit",
    "adc",
    "calibration",
    "i2c",
    "i2c2",
    "i2c3",
    "pulse",
    "qdec",
    "globalTrigSetting",
    "wdt",
    "edgeCount",
    "sqWave",
    "regSetting",
    "regSettingCust",
    "settingPolice"
})
@Generated("jsonschema2pojo")
public class NBConfig implements Serializable
{

    @JsonProperty("version")
    private String version;
    @JsonProperty("advSet")
    private List<AdvSet> advSet;
    @JsonProperty("txSetting")
    private TxSetting txSetting;
    @JsonProperty("gpio")
    private List<Gpio> gpio;
    @JsonProperty("vccUnit")
    private double vccUnit;
    @JsonProperty("tempUnit")
    private double tempUnit;
    @JsonProperty("adc")
    private List<Adc> adc;
    @JsonProperty("calibration")
    private Calibration calibration;
    @JsonProperty("i2c")
    private I2c i2c;
    @JsonProperty("i2c2")
    private I2c2 i2c2;
    @JsonProperty("i2c3")
    private I2c3 i2c3;
    @JsonProperty("pulse")
    private Pulse pulse;
    @JsonProperty("qdec")
    private Qdec qdec;
    @JsonProperty("globalTrigSetting")
    private GlobalTrigSetting globalTrigSetting;
    @JsonProperty("wdt")
    private Wdt wdt;
    @JsonProperty("edgeCount")
    private EdgeCount edgeCount;
    @JsonProperty("sqWave")
    private SqWave sqWave;
    @JsonProperty("regSetting")
    private List<String> regSetting;
    @JsonProperty("regSettingCust")
    private List<Object> regSettingCust;
    @JsonProperty("settingPolice")
    private int settingPolice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4860265556327152489L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NBConfig() {
    }

    /**
     * 
     * @param adc
     * @param qdec
     * @param wdt
     * @param edgeCount
     * @param regSettingCust
     * @param tempUnit
     * @param i2c2
     * @param i2c3
     * @param sqWave
     * @param txSetting
     * @param version
     * @param settingPolice
     * @param vccUnit
     * @param advSet
     * @param globalTrigSetting
     * @param pulse
     * @param regSetting
     * @param i2c
     * @param calibration
     * @param gpio
     */
    public NBConfig(String version, List<AdvSet> advSet, TxSetting txSetting, List<Gpio> gpio, double vccUnit, double tempUnit, List<Adc> adc, Calibration calibration, I2c i2c, I2c2 i2c2, I2c3 i2c3, Pulse pulse, Qdec qdec, GlobalTrigSetting globalTrigSetting, Wdt wdt, EdgeCount edgeCount, SqWave sqWave, List<String> regSetting, List<Object> regSettingCust, int settingPolice) {
        super();
        this.version = version;
        this.advSet = advSet;
        this.txSetting = txSetting;
        this.gpio = gpio;
        this.vccUnit = vccUnit;
        this.tempUnit = tempUnit;
        this.adc = adc;
        this.calibration = calibration;
        this.i2c = i2c;
        this.i2c2 = i2c2;
        this.i2c3 = i2c3;
        this.pulse = pulse;
        this.qdec = qdec;
        this.globalTrigSetting = globalTrigSetting;
        this.wdt = wdt;
        this.edgeCount = edgeCount;
        this.sqWave = sqWave;
        this.regSetting = regSetting;
        this.regSettingCust = regSettingCust;
        this.settingPolice = settingPolice;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("advSet")
    public List<AdvSet> getAdvSet() {
        return advSet;
    }

    @JsonProperty("advSet")
    public void setAdvSet(List<AdvSet> advSet) {
        this.advSet = advSet;
    }

    @JsonProperty("txSetting")
    public TxSetting getTxSetting() {
        return txSetting;
    }

    @JsonProperty("txSetting")
    public void setTxSetting(TxSetting txSetting) {
        this.txSetting = txSetting;
    }

    @JsonProperty("gpio")
    public List<Gpio> getGpio() {
        return gpio;
    }

    @JsonProperty("gpio")
    public void setGpio(List<Gpio> gpio) {
        this.gpio = gpio;
    }

    @JsonProperty("vccUnit")
    public double getVccUnit() {
        return vccUnit;
    }

    @JsonProperty("vccUnit")
    public void setVccUnit(double vccUnit) {
        this.vccUnit = vccUnit;
    }

    @JsonProperty("tempUnit")
    public double getTempUnit() {
        return tempUnit;
    }

    @JsonProperty("tempUnit")
    public void setTempUnit(double tempUnit) {
        this.tempUnit = tempUnit;
    }

    @JsonProperty("adc")
    public List<Adc> getAdc() {
        return adc;
    }

    @JsonProperty("adc")
    public void setAdc(List<Adc> adc) {
        this.adc = adc;
    }

    @JsonProperty("calibration")
    public Calibration getCalibration() {
        return calibration;
    }

    @JsonProperty("calibration")
    public void setCalibration(Calibration calibration) {
        this.calibration = calibration;
    }

    @JsonProperty("i2c")
    public I2c getI2c() {
        return i2c;
    }

    @JsonProperty("i2c")
    public void setI2c(I2c i2c) {
        this.i2c = i2c;
    }

    @JsonProperty("i2c2")
    public I2c2 getI2c2() {
        return i2c2;
    }

    @JsonProperty("i2c2")
    public void setI2c2(I2c2 i2c2) {
        this.i2c2 = i2c2;
    }

    @JsonProperty("i2c3")
    public I2c3 getI2c3() {
        return i2c3;
    }

    @JsonProperty("i2c3")
    public void setI2c3(I2c3 i2c3) {
        this.i2c3 = i2c3;
    }

    @JsonProperty("pulse")
    public Pulse getPulse() {
        return pulse;
    }

    @JsonProperty("pulse")
    public void setPulse(Pulse pulse) {
        this.pulse = pulse;
    }

    @JsonProperty("qdec")
    public Qdec getQdec() {
        return qdec;
    }

    @JsonProperty("qdec")
    public void setQdec(Qdec qdec) {
        this.qdec = qdec;
    }

    @JsonProperty("globalTrigSetting")
    public GlobalTrigSetting getGlobalTrigSetting() {
        return globalTrigSetting;
    }

    @JsonProperty("globalTrigSetting")
    public void setGlobalTrigSetting(GlobalTrigSetting globalTrigSetting) {
        this.globalTrigSetting = globalTrigSetting;
    }

    @JsonProperty("wdt")
    public Wdt getWdt() {
        return wdt;
    }

    @JsonProperty("wdt")
    public void setWdt(Wdt wdt) {
        this.wdt = wdt;
    }

    @JsonProperty("edgeCount")
    public EdgeCount getEdgeCount() {
        return edgeCount;
    }

    @JsonProperty("edgeCount")
    public void setEdgeCount(EdgeCount edgeCount) {
        this.edgeCount = edgeCount;
    }

    @JsonProperty("sqWave")
    public SqWave getSqWave() {
        return sqWave;
    }

    @JsonProperty("sqWave")
    public void setSqWave(SqWave sqWave) {
        this.sqWave = sqWave;
    }

    @JsonProperty("regSetting")
    public List<String> getRegSetting() {
        return regSetting;
    }

    @JsonProperty("regSetting")
    public void setRegSetting(List<String> regSetting) {
        this.regSetting = regSetting;
    }

    @JsonProperty("regSettingCust")
    public List<Object> getRegSettingCust() {
        return regSettingCust;
    }

    @JsonProperty("regSettingCust")
    public void setRegSettingCust(List<Object> regSettingCust) {
        this.regSettingCust = regSettingCust;
    }

    @JsonProperty("settingPolice")
    public int getSettingPolice() {
        return settingPolice;
    }

    @JsonProperty("settingPolice")
    public void setSettingPolice(int settingPolice) {
        this.settingPolice = settingPolice;
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
        sb.append(NBConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("advSet");
        sb.append('=');
        sb.append(((this.advSet == null)?"<null>":this.advSet));
        sb.append(',');
        sb.append("txSetting");
        sb.append('=');
        sb.append(((this.txSetting == null)?"<null>":this.txSetting));
        sb.append(',');
        sb.append("gpio");
        sb.append('=');
        sb.append(((this.gpio == null)?"<null>":this.gpio));
        sb.append(',');
        sb.append("vccUnit");
        sb.append('=');
        sb.append(this.vccUnit);
        sb.append(',');
        sb.append("tempUnit");
        sb.append('=');
        sb.append(this.tempUnit);
        sb.append(',');
        sb.append("adc");
        sb.append('=');
        sb.append(((this.adc == null)?"<null>":this.adc));
        sb.append(',');
        sb.append("calibration");
        sb.append('=');
        sb.append(((this.calibration == null)?"<null>":this.calibration));
        sb.append(',');
        sb.append("i2c");
        sb.append('=');
        sb.append(((this.i2c == null)?"<null>":this.i2c));
        sb.append(',');
        sb.append("i2c2");
        sb.append('=');
        sb.append(((this.i2c2 == null)?"<null>":this.i2c2));
        sb.append(',');
        sb.append("i2c3");
        sb.append('=');
        sb.append(((this.i2c3 == null)?"<null>":this.i2c3));
        sb.append(',');
        sb.append("pulse");
        sb.append('=');
        sb.append(((this.pulse == null)?"<null>":this.pulse));
        sb.append(',');
        sb.append("qdec");
        sb.append('=');
        sb.append(((this.qdec == null)?"<null>":this.qdec));
        sb.append(',');
        sb.append("globalTrigSetting");
        sb.append('=');
        sb.append(((this.globalTrigSetting == null)?"<null>":this.globalTrigSetting));
        sb.append(',');
        sb.append("wdt");
        sb.append('=');
        sb.append(((this.wdt == null)?"<null>":this.wdt));
        sb.append(',');
        sb.append("edgeCount");
        sb.append('=');
        sb.append(((this.edgeCount == null)?"<null>":this.edgeCount));
        sb.append(',');
        sb.append("sqWave");
        sb.append('=');
        sb.append(((this.sqWave == null)?"<null>":this.sqWave));
        sb.append(',');
        sb.append("regSetting");
        sb.append('=');
        sb.append(((this.regSetting == null)?"<null>":this.regSetting));
        sb.append(',');
        sb.append("regSettingCust");
        sb.append('=');
        sb.append(((this.regSettingCust == null)?"<null>":this.regSettingCust));
        sb.append(',');
        sb.append("settingPolice");
        sb.append('=');
        sb.append(this.settingPolice);
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
        result = ((result* 31)+((this.adc == null)? 0 :this.adc.hashCode()));
        result = ((result* 31)+((this.qdec == null)? 0 :this.qdec.hashCode()));
        result = ((result* 31)+((this.wdt == null)? 0 :this.wdt.hashCode()));
        result = ((result* 31)+((this.edgeCount == null)? 0 :this.edgeCount.hashCode()));
        result = ((result* 31)+((this.regSettingCust == null)? 0 :this.regSettingCust.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.tempUnit)^(Double.doubleToLongBits(this.tempUnit)>>> 32))));
        result = ((result* 31)+((this.i2c2 == null)? 0 :this.i2c2 .hashCode()));
        result = ((result* 31)+((this.i2c3 == null)? 0 :this.i2c3 .hashCode()));
        result = ((result* 31)+((this.sqWave == null)? 0 :this.sqWave.hashCode()));
        result = ((result* 31)+((this.txSetting == null)? 0 :this.txSetting.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+ this.settingPolice);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.vccUnit)^(Double.doubleToLongBits(this.vccUnit)>>> 32))));
        result = ((result* 31)+((this.advSet == null)? 0 :this.advSet.hashCode()));
        result = ((result* 31)+((this.globalTrigSetting == null)? 0 :this.globalTrigSetting.hashCode()));
        result = ((result* 31)+((this.pulse == null)? 0 :this.pulse.hashCode()));
        result = ((result* 31)+((this.regSetting == null)? 0 :this.regSetting.hashCode()));
        result = ((result* 31)+((this.i2c == null)? 0 :this.i2c.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.calibration == null)? 0 :this.calibration.hashCode()));
        result = ((result* 31)+((this.gpio == null)? 0 :this.gpio.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NBConfig) == false) {
            return false;
        }
        NBConfig rhs = ((NBConfig) other);
        return ((((((((((((((((((((((this.adc == rhs.adc)||((this.adc!= null)&&this.adc.equals(rhs.adc)))&&((this.qdec == rhs.qdec)||((this.qdec!= null)&&this.qdec.equals(rhs.qdec))))&&((this.wdt == rhs.wdt)||((this.wdt!= null)&&this.wdt.equals(rhs.wdt))))&&((this.edgeCount == rhs.edgeCount)||((this.edgeCount!= null)&&this.edgeCount.equals(rhs.edgeCount))))&&((this.regSettingCust == rhs.regSettingCust)||((this.regSettingCust!= null)&&this.regSettingCust.equals(rhs.regSettingCust))))&&(Double.doubleToLongBits(this.tempUnit) == Double.doubleToLongBits(rhs.tempUnit)))&&((this.i2c2 == rhs.i2c2)||((this.i2c2 != null)&&this.i2c2 .equals(rhs.i2c2))))&&((this.i2c3 == rhs.i2c3)||((this.i2c3 != null)&&this.i2c3 .equals(rhs.i2c3))))&&((this.sqWave == rhs.sqWave)||((this.sqWave!= null)&&this.sqWave.equals(rhs.sqWave))))&&((this.txSetting == rhs.txSetting)||((this.txSetting!= null)&&this.txSetting.equals(rhs.txSetting))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&(this.settingPolice == rhs.settingPolice))&&(Double.doubleToLongBits(this.vccUnit) == Double.doubleToLongBits(rhs.vccUnit)))&&((this.advSet == rhs.advSet)||((this.advSet!= null)&&this.advSet.equals(rhs.advSet))))&&((this.globalTrigSetting == rhs.globalTrigSetting)||((this.globalTrigSetting!= null)&&this.globalTrigSetting.equals(rhs.globalTrigSetting))))&&((this.pulse == rhs.pulse)||((this.pulse!= null)&&this.pulse.equals(rhs.pulse))))&&((this.regSetting == rhs.regSetting)||((this.regSetting!= null)&&this.regSetting.equals(rhs.regSetting))))&&((this.i2c == rhs.i2c)||((this.i2c!= null)&&this.i2c.equals(rhs.i2c))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.calibration == rhs.calibration)||((this.calibration!= null)&&this.calibration.equals(rhs.calibration))))&&((this.gpio == rhs.gpio)||((this.gpio!= null)&&this.gpio.equals(rhs.gpio))));
    }

}
