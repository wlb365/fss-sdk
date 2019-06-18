package com.cfzq.sdkdemo;

import cn.hutool.core.codec.Base64Encoder;
import com.alibaba.fastjson.JSON;
import com.cfzq.util.FileUtil;
import com.wlb.fdk.common.dataModel.ResponsePojo;
import com.wlb.fdk.common.dataModel.SendDTO;
import com.wlb.fdk.sdk.platform.RootApi;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

public class Test100101 {

    // 测试绑卡文件上传
    @Test
    public void bindFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190618");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190617_1_Bind_3.txt");
        map.put("fileType", "1");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\民生\\绑卡文件(多)\\626_20190617_1_Bind_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));
    }

    //测试04文件上传
    @Test
    public void file04() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190618");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190617_1_04_3.txt");
        map.put("fileType", "2");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\民生\\04文件\\626_20190617_1_04_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }

    //测试06文件上传
    @Test
    public void file06() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190617");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190614_1_06_3.txt");
        map.put("fileType", "3");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\民生\\06文件\\626_20190614_1_06_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }
    //测试广发应付客户转账文件上传
    @Test
    public void transPayGFFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190617");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190617_1_F_3.txt");
        map.put("fileType", "4");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\广发\\应付客户转账\\626_20190617_1_F_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }


    //测试民生应付客户转账文件上传
    @Test
    public void transPayMSFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190614");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190614_1_F_3.txt");
        map.put("fileType", "4");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\应付客户转账-民生\\626_20190614_1_F_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }

    //测试广发应付基金公司转账文件上传
    @Test
    public void transFundPayGFFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190618");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190617_1_CF_3.txt");
        map.put("fileType", "5");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\广发\\应付基金公司转账\\626_20190617_1_CF_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }

    //测试民生应付基金公司转账文件上传
    @Test
    public void transFundPayMSFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190614");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190614_1_CF_3.txt");
        map.put("fileType", "5");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\应付基金公司转账-民生\\626_20190614_1_CF_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }

    //测试民生J01文件上传
    @Test
    public void j01MSFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190614");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190615_1_j01_3.txt");
        map.put("fileType", "6");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\民生\\J01文件\\626_20190615_1_j01_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }

    @Test
    public void j02MSFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190614");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190615_1_j02_3.txt");
        map.put("fileType", "7");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\民生\\J02文件\\626_20190615_1_j02_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }


}
