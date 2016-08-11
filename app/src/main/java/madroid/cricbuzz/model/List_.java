
package madroid.cricbuzz.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("matchDesc")
    @Expose
    private String matchDesc;
    @SerializedName("seriesId")
    @Expose
    private Integer seriesId;
    @SerializedName("seriesDesc")
    @Expose
    private String seriesDesc;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("teamAName")
    @Expose
    private String teamAName;
    @SerializedName("teamAShortName")
    @Expose
    private String teamAShortName;
    @SerializedName("teamBName")
    @Expose
    private String teamBName;
    @SerializedName("teamBShortName")
    @Expose
    private String teamBShortName;
    @SerializedName("teamAImageId")
    @Expose
    private Integer teamAImageId;
    @SerializedName("teamBImageId")
    @Expose
    private Integer teamBImageId;
    @SerializedName("isPrevDay")
    @Expose
    private Boolean isPrevDay;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The matchDesc
     */
    public String getMatchDesc() {
        return matchDesc;
    }

    /**
     * 
     * @param matchDesc
     *     The matchDesc
     */
    public void setMatchDesc(String matchDesc) {
        this.matchDesc = matchDesc;
    }

    /**
     * 
     * @return
     *     The seriesId
     */
    public Integer getSeriesId() {
        return seriesId;
    }

    /**
     * 
     * @param seriesId
     *     The seriesId
     */
    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * 
     * @return
     *     The seriesDesc
     */
    public String getSeriesDesc() {
        return seriesDesc;
    }

    /**
     * 
     * @param seriesDesc
     *     The seriesDesc
     */
    public void setSeriesDesc(String seriesDesc) {
        this.seriesDesc = seriesDesc;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The teamAName
     */
    public String getTeamAName() {
        return teamAName;
    }

    /**
     * 
     * @param teamAName
     *     The teamAName
     */
    public void setTeamAName(String teamAName) {
        this.teamAName = teamAName;
    }

    /**
     * 
     * @return
     *     The teamAShortName
     */
    public String getTeamAShortName() {
        return teamAShortName;
    }

    /**
     * 
     * @param teamAShortName
     *     The teamAShortName
     */
    public void setTeamAShortName(String teamAShortName) {
        this.teamAShortName = teamAShortName;
    }

    /**
     * 
     * @return
     *     The teamBName
     */
    public String getTeamBName() {
        return teamBName;
    }

    /**
     * 
     * @param teamBName
     *     The teamBName
     */
    public void setTeamBName(String teamBName) {
        this.teamBName = teamBName;
    }

    /**
     * 
     * @return
     *     The teamBShortName
     */
    public String getTeamBShortName() {
        return teamBShortName;
    }

    /**
     * 
     * @param teamBShortName
     *     The teamBShortName
     */
    public void setTeamBShortName(String teamBShortName) {
        this.teamBShortName = teamBShortName;
    }

    /**
     * 
     * @return
     *     The teamAImageId
     */
    public Integer getTeamAImageId() {
        return teamAImageId;
    }

    /**
     * 
     * @param teamAImageId
     *     The teamAImageId
     */
    public void setTeamAImageId(Integer teamAImageId) {
        this.teamAImageId = teamAImageId;
    }

    /**
     * 
     * @return
     *     The teamBImageId
     */
    public Integer getTeamBImageId() {
        return teamBImageId;
    }

    /**
     * 
     * @param teamBImageId
     *     The teamBImageId
     */
    public void setTeamBImageId(Integer teamBImageId) {
        this.teamBImageId = teamBImageId;
    }

    /**
     * 
     * @return
     *     The isPrevDay
     */
    public Boolean getIsPrevDay() {
        return isPrevDay;
    }

    /**
     * 
     * @param isPrevDay
     *     The isPrevDay
     */
    public void setIsPrevDay(Boolean isPrevDay) {
        this.isPrevDay = isPrevDay;
    }

}
