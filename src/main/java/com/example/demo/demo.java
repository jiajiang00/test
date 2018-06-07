package com.example.demo;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Controller
public class demo {

    public static String access_token="24.daccdff602e5b69e0c36626a5dbe4d63.2592000.1528974417.282335-11244775";

    private static final String FACE_MATCH = "https://aip.baidubce.com/rest/2.0/face/v3/match";


    @RequestMapping("/")
    public String demo()throws Exception{
       /* String APPID ="11244775";
        String API_KEY = "E6CSZkmPMKGg5enCxdfjPH15"; //管理中心获得
        String SERCET_KEY = "FU9jO7KbZQpV05EGPTrhT69XZ29FvOoG"; //管理中心获得
        String TOKEN = null;

        *//*String access_token_url = "https://aip.baidubce.com/oauth/2.0/token?grant_type=client_credentials"
                +"&client_id="+API_KEY +"&client_secret="+SERCET_KEY;*//*
        String access_token_url = "https://aip.baidubce.com/oauth/2.0/token?grant_type=client_credentials&client_id="+API_KEY+"&client_secret="+SERCET_KEY;

        CloseableHttpResponse response =  util.doHttpsGet(access_token_url,null);
        System.out.println(util.toString(response));*/

       /* try {
            // 本地文件路径
            String filePath1 = "D:\\123.jpg";
            String filePath2 = "D:\\555.jpg";
            byte[] imgData1 = FileUtil.readFileByBytes(filePath1);
            byte[] imgData2 = FileUtil.readFileByBytes(filePath2);
            String imgStr1 = Base64Util.encode(imgData1);
            String imgStr2 = Base64Util.encode(imgData2);
            List<FaceV3Bean> faceMatchs = new ArrayList<FaceV3Bean>();
            FaceV3Bean faceMatch1 = new FaceV3Bean(imgStr1,"BASE64");
            FaceV3Bean faceMatch2 = new FaceV3Bean(imgStr2,"BASE64");
            faceMatchs.add(faceMatch1);
            faceMatchs.add(faceMatch2);
            String param = JSONObject.toJSONString(faceMatchs);
            String accessToken = access_token;
            String result = HttpUtil.post(FACE_MATCH, accessToken, param);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

       /* int i=190/60;
        System.out.println(cutVoice.cut("D:\\\\asd\\\\123.wav","d:\\\\asd\\\\22.wav",0,60));*/
        return "demo";
    }

    @ResponseBody
    @RequestMapping(value="/test",method = RequestMethod.POST)
    public String demo1(String name)throws Exception{

//        model.addAttribute("aa", "http://wx.st10086.com/teamkit/meetingpass/ios/asd.xlsx");
//        model.addAttribute("bb", "http://wx.st10086.com/teamkit/meetingpass/ios/asd.docx");
        System.out.println(name);

        return name;

    }



}
