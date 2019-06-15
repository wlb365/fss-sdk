package com.cfzq.sdkdemo;

import com.alibaba.fastjson.JSON;
import com.wlb.fdk.common.dataModel.ResponsePojo;
import com.wlb.fdk.common.dataModel.SendDTO;
import com.wlb.fdk.sdk.platform.RootApi;
import org.junit.Test;

import java.util.HashMap;

/**
 * <p>
 * 概述:
 * </p>
 *
 * @Auther: ysh
 * @copyRight 所有权: 2014-2017 All right reserved.
 * @Date: 2019/6/15 16:13
 */
public class Test100102 {

    @Test
    public void testQueryFile(){
        SendDTO dto = new SendDTO();
        dto.setUrl("fileQuery/100102");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("serialNo", "2019061419395216120656922863");
        map.put("officeType", "");
        map.put("uploadUserCode", "");
        map.put("fileType", "1");
        map.put("uploadDate", "");
        map.put("fileName", "");
        map.put("fileStatus", "");
        //map.put("sourceSerialNo", "");
        dto.setData(map);
        ResponsePojo pojo= RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));


    }

}
    