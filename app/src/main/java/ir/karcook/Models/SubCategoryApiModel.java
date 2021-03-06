package ir.karcook.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SubCategoryApiModel extends ErrorAPIModel {


    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<SubCategoryModel> data = null;
    @SerializedName("showMessage")
    @Expose
    private Boolean showMessage;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<SubCategoryModel> getData() {
        return data;
    }

    public void setData(List<SubCategoryModel> data) {
        this.data = data;
    }

    public Boolean getShowMessage() {
        return showMessage;
    }

    public void setShowMessage(Boolean showMessage) {
        this.showMessage = showMessage;
    }
}
