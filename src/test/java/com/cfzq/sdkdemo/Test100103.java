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
 * @Date: 2019/6/15 16:32
 */
public class Test100103 {

    @Test
    public void uploadFile(){
        SendDTO dto = new SendDTO();
        dto.setUrl("fileDownload/100103");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("serialNo", "2019061419395216120656922863");
        map.put("fileType", "1");
        map.put("uploadUserCode", "626");
        //map.put("sourceSerialNo", "");
        dto.setData(map);
        ResponsePojo pojo= RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));


    }

}
    