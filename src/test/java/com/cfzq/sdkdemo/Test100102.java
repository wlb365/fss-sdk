package com.cfzq.sdkdemo;

import com.alibaba.fastjson.JSON;
import com.wlb.fdk.common.dataModel.ResponsePojo;
import com.wlb.fdk.common.dataModel.SendDTO;
import com.wlb.fdk.sdk.platform.RootApi;
import org.junit.Test;

import java.util.HashMap;

/**
 * <p>
 *      概述:文件查询
 * </p>
 *
 * @Auther:         ysh
 * @copyRight       2014-2019 All right reserved.
 * @Date:           2019/6/15 16:13
 */
public class Test100102 {

    @Test
    public void testQueryFile(){
        SendDTO dto = new SendDTO();
        dto.setUrl("fileQuery/100102");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("serialNo", "1218114182965121024");
        map.put("officeType", "1");
        map.put("uploadUserCode", "645");
        map.put("fileType", "2");
        map.put("uploadDate", "");
        map.put("fileName", "");
        map.put("fileStatus", "");
        //map.put("sourceSerialNo", "");
        dto.setData(map);
        ResponsePojo pojo= RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));


    }

}
    