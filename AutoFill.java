import okhttp3.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author XinHui Chen
 * @date 2020/4/23 14:13
 */
public class AutoFill {
    public static void main(String[] args) throws IOException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        RequestBody body = new FormBody.Builder()
                .add("address", "浙江省嘉兴市桐乡市屠甸镇大脚湾")
                .add("area", "浙江省 嘉兴市 桐乡市")
                .add("bztcyy", "")
                .add("city", "嘉兴市")
                .add("created", String.valueOf(System.currentTimeMillis() / 1000))
                .add("created_uid", "0")
                .add("date", simpleDateFormat.format(new Date()))
                .add("fjsj", "0")
                .add("fxyy", "0")
                .add("geo_api_info",
                        "{\"type\":\"complete\",\"position\":{\"P\":30.553665093316,\"O\":120.63430121527801,\"lng\":120.634301,\"lat\":30.553665},\"location_type\":\"html5\",\"message\":\"Get ipLocation failed.Get geolocation success.Convert Success.Get address success.\",\"accuracy\":49,\"isConverted\":true,\"status\":1,\"addressComponent\":{\"citycode\":\"0573\",\"adcode\":\"330483\",\"businessAreas\":[],\"neighborhoodType\":\"\",\"neighborhood\":\"\",\"building\":\"\",\"buildingType\":\"\",\"street\":\"\",\"streetNumber\":\"\",\"province\":\"浙江省\",\"city\":\"嘉兴市\",\"district\":\"桐乡市\",\"township\":\"屠甸镇\"},\"formattedAddress\":\"浙江省嘉兴市桐乡市屠甸镇大脚湾\",\"roads\":[],\"crosses\":[],\"pois\":[],\"info\":\"SUCCESS\"}")
                .add("glksrq", "")
                .add("gllx", "")
                .add("gtjzzfjsj", "")
                .add("gwszdd", "")
                .add("id", "3290347")
                .add("ismoved", "0")
                .add("jcbhlx", "")
                .add("jcbhrq", "")
                .add("jchbryfs", "")
                .add("jcjg", "")
                .add("jcjgqr", "")
                .add("jcqzrq", "")
                .add("jcwhryfs", "")
                .add("jhfjhbcc", "")
                .add("jhfjjtgj", "")
                .add("jhfjrq", "")
                .add("jhfjsftjhb", "0")
                .add("jhfjsftjwh", "0")
                .add("jrsfqzfy", "")
                .add("jrsfqzys", "")
                .add("province", "浙江省")
                .add("qksm", "")
                .add("remark", "1")
                .add("sfcxtz", "0")
                .add("sfcxzysx", "0")
                .add("sfcyglq", "0")
                .add("sfjcbh", "0")
                .add("sfjchbry", "0")
                .add("sfjcjwry", "0")
                .add("sfjcqz", "")
                .add("sfjcwhry", "0")
                .add("sfsfbh", "0")
                .add("sfsqhzjkk", "0")
                .add("sftjhb", "0")
                .add("sftjwh", "0")
                .add("sfygtjzzfj", "0")
                .add("sfyqjzgc", "")
                .add("sfyyjc", "0")
                .add("sfzx", "0")
                .add("sqhzjkkys", "")
                .add("szcs", "")
                .add("szgj", "")
                .add("szgjcs", "")
                .add("szsqsfybl", "0")
                .add("tw", "4")
                .add("uid", "106610")
                .add("xjzd", "").build();

        String str = "Cookie: UUkey=4258c34b7268565f590fce8d74741d7f; eai-sess=v2eo8av4umpjn7rm5mifrufe35; \n" +
                "Host: xxcapp.xidian.edu.cn\n" +
                "Sec-Fetch-Dest: document\n" +
                "Sec-Fetch-Mode: navigate\n" +
                "Sec-Fetch-Site: same-origin\n" +
                "Sec-Fetch-User: ?1\n" +
                "Upgrade-Insecure-Requests: 1\n";

        String[] split = str.split("\\n");
        List<String> param = new ArrayList<>();

        for (String s : split) {
            String[] split1 = s.split(":");
            param.add(split1[0]);
            param.add(split1[1]);
        }

        Headers headers = Headers.of(param.toArray(new String[0]));
        String url = "https://xxcapp.xidian.edu.cn/ncov/wap/default/save";
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(body)
                .build();

        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
