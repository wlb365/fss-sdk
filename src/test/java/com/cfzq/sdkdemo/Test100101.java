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

/**
 * <p>
 *      概述:文件上传
 * </p>
 *
 * @Auther:         ysh
 * @copyRight       2014-2019 All right reserved.
 * @Date:           2019/6/15 16:13
 */
public class Test100101 {

    // 测试绑卡文件上传
    @Test
    public void bindFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190619");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190618_1_Bind_3.txt");
        map.put("fileType", "1");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\财富证券\\广发\\绑卡文件-不更换账号\\626_20190618_1_Bind_3.txt");
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
        map.put("uploadDate", "20190618");
        map.put("officeType", "1");
        map.put("uploadUserCode", "626");
        map.put("uploadName", "626_20190618_1_j01_3.txt");
        map.put("fileType", "6");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\广发\\J01文件\\626_20190618_1_j01_3.txt");
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

    //测试广发04结果上传
    @Test
    public void GF04ResultFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190620");
        map.put("officeType", "2");
        map.put("uploadUserCode", "1139387373736771584");
        map.put("uploadName", "626_20190620_3_04_3.txt");
        map.put("fileType", "12");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\广发\\结果文件\\04结果文件\\626_20190620_3_04_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }

    //测试广发06文件结果上传
    @Test
    public void GF06ResultFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190620");
        map.put("officeType", "2");
        map.put("uploadUserCode", "1139387373736771584");
        map.put("uploadName", "626_20190620_3_06_3.txt");
        map.put("fileType", "13");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\广发\\结果文件\\06结果文件\\626_20190620_3_06_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }
    //测试广发06结果结果上传
    @Test
    public void GFpaycustomerResultFile() throws IOException {
        SendDTO dto = new SendDTO();
        dto.setUrl("fileUpload/100101");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uploadDate", "20190620");
        map.put("officeType", "2");
        map.put("uploadUserCode", "1139387373736771584");
        map.put("uploadName", "626_20190620_3_06_3.txt");
        map.put("fileType", "13");
        //map.put("sourceSerialNo", "");
        byte[] bytes = FileUtil.InputStream2ByteArray("C:\\Users\\dpb\\Desktop\\doc\\data\\WLB\\广发\\结果文件\\06结果文件\\626_20190620_3_06_3.txt");
        String encode = Base64Encoder.encode(bytes);
        map.put("uploadFileBase64Code", encode);
        dto.setData(map);
        ResponsePojo pojo=RootApi.run(dto);
        System.out.println(JSON.toJSONString(pojo));

    }

}
