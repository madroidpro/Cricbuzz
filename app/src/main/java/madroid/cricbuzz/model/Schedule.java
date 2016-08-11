
package madroid.cricbuzz.model;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("list")
    @Expose
    private java.util.List<madroid.cricbuzz.model.List> list = new ArrayList<>();

    /**
     * 
     * @return
     *     The list
     */
    public java.util.List<madroid.cricbuzz.model.List> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(java.util.List<madroid.cricbuzz.model.List> list) {
        this.list = list;
    }

}
