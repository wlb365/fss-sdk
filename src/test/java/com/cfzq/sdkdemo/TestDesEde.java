package com.cfzq.sdkdemo;

import com.wlb.fdk.common.crypto.BCDESedeUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p>
 *      概述：3DES报文加密解密
 * </p>
 *
 * @Auther:         ysh
 * @copyRight       2014-2019 All right reserved.
 * @Date:           2019/6/15 16:13
 */
public class TestDesEde {
    @Test
    public void desEde(){
        String data="财富证券";
        try {
            String value= BCDESedeUtils.desedeEncryptHex(data);
            System.out.println("密文："+value);
            String result=BCDESedeUtils.desedeDecryptStr(value);
            System.out.println("明文："+result);
            Assert.assertEquals(data,result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
