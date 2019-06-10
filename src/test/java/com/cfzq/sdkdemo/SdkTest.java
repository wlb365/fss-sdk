package com.cfzq.sdkdemo;

import com.alibaba.fastjson.JSON;
import com.wlb.fdk.common.dataModel.ResponsePojo;
import com.wlb.fdk.common.dataModel.SendDTO;
import com.wlb.fdk.sdk.moniter.SystemDetecting;
import com.wlb.fdk.sdk.platform.RootApi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;

public class SdkTest {
    private static final Logger logger = LogManager.getLogger(SdkTest.class);


    /**
     * 可用性检测
     */
   @Test
    public void deteting(){
       try {
           logger.debug(SystemDetecting.run());
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @Test
    public void api(){
        SendDTO dto = new SendDTO();
        dto.setUrl("fileDownload/100103");
        HashMap<String, Object> map = new HashMap<String, Object>(0x3);
        map.put("serialNo", "1234567890");
        map.put("fileType", "1");
        map.put("uploadUserCode", "0987654321");
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        logger.debug(JSON.toJSONString(pojo));
    }
}
