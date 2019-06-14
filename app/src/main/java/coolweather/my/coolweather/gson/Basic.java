package coolweather.my.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 25755 on 2019/6/13.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }

}
