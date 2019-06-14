package coolweather.my.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 25755 on 2019/6/13.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }

}
