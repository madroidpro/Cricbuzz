
package madroid.cricbuzz.model;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("list")
    @Expose
    private java.util.List<List_> list = new ArrayList<List_>();

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
     *     The list
     */
    public java.util.List<List_> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(java.util.List<List_> list) {
        this.list = list;
    }

}
