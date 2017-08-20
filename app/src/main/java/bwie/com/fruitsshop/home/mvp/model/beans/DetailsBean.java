package bwie.com.fruitsshop.home.mvp.model.beans;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import java.io.Serializable;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class DetailsBean implements Serializable {


    /**
     * status : true
     * code : 1
     * message : 调用成功
     * data : {"product":{"id":3,"category_id":2,"image":"","featured_image":null,"image_small":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/1.jpg","name":"韩国柚子茶","sort":101,"created_at":20150608,"created_by":10,"updated_at":1500606445,"updated_by":1,"price":"13.00","featured_price":"10.00","featured_position":null,"featured_position_sort":999,"app_featured_home":null,"app_featured_home_sort":99,"app_featured_image":null,"short_description":"进口韩国柚子，热饮口感同样出众。","meta_keywords":"","meta_description":"","is_audit":null,"remarks":null,"featured":null,"description":"<p>\r\n\t<br />\r\n\t<div id=\"xunlei_com_thunder_helper_plugin_d462f475-c18e-46be-bd10-327458d045bd\">\r\n\t\t&nbsp;<\/div>\r\n<\/p>","image_medium":"","image_large":"","app_featured_topic":null,"app_featured_topic_sort":99,"app_long_image1":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/11.jpg","app_long_image2":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/2.jpg","app_long_image3":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/3.jpg","type_id":1,"app_long_image4":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/4.jpg","app_long_image5":"http://data.eleteam.com/uploads/public/product/pei-tu/64.jpg","status":1,"specs_json":"{\"1\":{\"1\":\"标准\",\"2\":\"大杯\"},\"2\":{\"4\":\"标准\",\"5\":\"加冰\"}}","category":{"id":2,"featured":null,"image":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940.jpg","featured_image":null,"image_small":"http://data.eleteam.com/uploads/category/54b33ace3ace46728adfe3511b7e7ea2/category_54b33ace3ace46728adfe3511b7e7ea2_1463808751_8095.jpg","name":"奶茶精选","parent_id":"1","sort":20,"created_at":20150608,"created_by":10,"updated_at":20150626,"updated_by":10,"short_description":"专业手工现做释放天然植物的层次和香气","app_featured_home":"1","app_featured_home_sort":99,"parent_ids":"null1,","remarks":null,"meta_keywords":"","meta_description":"","href":null,"href_target":"_blank","image_medium":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_medium.jpg","image_large":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_large.jpg","status":1},"productAttrs":[{"product_id":3,"item_id":1,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":1,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"饮品加料","remarks":null,"print_name":"加料","productAttrItemValues":[{"id":1,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"珍珠","price":"1.00","remarks":null,"print_name":"加珍珠","is_standard":"0"},{"id":2,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"椰果","price":"1.00","remarks":null,"print_name":"加椰果","is_standard":"0"},{"id":3,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":90,"updated_at":null,"updated_by":null,"name":"彩色蒟蒻","price":"2.00","remarks":null,"print_name":"加彩色蒟蒻","is_standard":"0"},{"id":4,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":60,"updated_at":null,"updated_by":null,"name":"黑砖","price":"2.00","remarks":null,"print_name":"加黑砖","is_standard":"0"},{"id":5,"item_id":1,"created_at":null,"created_by":null,"status":1,"sort":70,"updated_at":null,"updated_by":null,"name":"芒果冻","price":"2.00","remarks":null,"print_name":"加芒果冻","is_standard":"0"},{"id":6,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":80,"updated_at":null,"updated_by":null,"name":"仙草冻","price":"2.00","remarks":null,"print_name":"加仙草冻","is_standard":"0"},{"id":7,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":50,"updated_at":null,"updated_by":null,"name":"红豆","price":"2.00","remarks":null,"print_name":"加红豆","is_standard":"0"},{"id":8,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"奶盖","price":"3.00","remarks":null,"print_name":"加奶盖","is_standard":"0"},{"id":9,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"}]}},{"product_id":3,"item_id":2,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":2,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"温度","remarks":null,"print_name":"温度","productAttrItemValues":[{"id":10,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"},{"id":11,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"多冰","price":"0.00","remarks":null,"print_name":"多冰","is_standard":"0"},{"id":12,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"去冰","price":"0.00","remarks":null,"print_name":"去冰","is_standard":"0"},{"id":13,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"温","price":"0.00","remarks":null,"print_name":"温","is_standard":"0"},{"id":14,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":50,"updated_at":null,"updated_by":null,"name":"热","price":"0.00","remarks":null,"print_name":"热","is_standard":"0"}]}},{"product_id":3,"item_id":3,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":3,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"糖量","remarks":null,"print_name":"糖量","productAttrItemValues":[{"id":15,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"},{"id":16,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"多糖","price":"0.00","remarks":null,"print_name":"多糖","is_standard":"0"},{"id":17,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"少糖","price":"0.00","remarks":null,"print_name":"少糖","is_standard":"0"},{"id":18,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"无糖","price":"0.00","remarks":null,"print_name":"无糖","is_standard":"0"}]}}]},"cart_num":0,"product_collected":"1"}
     * share : {}
     */

    public boolean status;
    public int code;
    public String message;
    public DataBean data;
    public ShareBean share;

    public static DetailsBean objectFromData(String str) {

        return new Gson().fromJson(str, DetailsBean.class);
    }

    public static class DataBean {
        /**
         * product : {"id":3,"category_id":2,"image":"","featured_image":null,"image_small":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/1.jpg","name":"韩国柚子茶","sort":101,"created_at":20150608,"created_by":10,"updated_at":1500606445,"updated_by":1,"price":"13.00","featured_price":"10.00","featured_position":null,"featured_position_sort":999,"app_featured_home":null,"app_featured_home_sort":99,"app_featured_image":null,"short_description":"进口韩国柚子，热饮口感同样出众。","meta_keywords":"","meta_description":"","is_audit":null,"remarks":null,"featured":null,"description":"<p>\r\n\t<br />\r\n\t<div id=\"xunlei_com_thunder_helper_plugin_d462f475-c18e-46be-bd10-327458d045bd\">\r\n\t\t&nbsp;<\/div>\r\n<\/p>","image_medium":"","image_large":"","app_featured_topic":null,"app_featured_topic_sort":99,"app_long_image1":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/11.jpg","app_long_image2":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/2.jpg","app_long_image3":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/3.jpg","type_id":1,"app_long_image4":"http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/4.jpg","app_long_image5":"http://data.eleteam.com/uploads/public/product/pei-tu/64.jpg","status":1,"specs_json":"{\"1\":{\"1\":\"标准\",\"2\":\"大杯\"},\"2\":{\"4\":\"标准\",\"5\":\"加冰\"}}","category":{"id":2,"featured":null,"image":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940.jpg","featured_image":null,"image_small":"http://data.eleteam.com/uploads/category/54b33ace3ace46728adfe3511b7e7ea2/category_54b33ace3ace46728adfe3511b7e7ea2_1463808751_8095.jpg","name":"奶茶精选","parent_id":"1","sort":20,"created_at":20150608,"created_by":10,"updated_at":20150626,"updated_by":10,"short_description":"专业手工现做释放天然植物的层次和香气","app_featured_home":"1","app_featured_home_sort":99,"parent_ids":"null1,","remarks":null,"meta_keywords":"","meta_description":"","href":null,"href_target":"_blank","image_medium":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_medium.jpg","image_large":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_large.jpg","status":1},"productAttrs":[{"product_id":3,"item_id":1,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":1,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"饮品加料","remarks":null,"print_name":"加料","productAttrItemValues":[{"id":1,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"珍珠","price":"1.00","remarks":null,"print_name":"加珍珠","is_standard":"0"},{"id":2,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"椰果","price":"1.00","remarks":null,"print_name":"加椰果","is_standard":"0"},{"id":3,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":90,"updated_at":null,"updated_by":null,"name":"彩色蒟蒻","price":"2.00","remarks":null,"print_name":"加彩色蒟蒻","is_standard":"0"},{"id":4,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":60,"updated_at":null,"updated_by":null,"name":"黑砖","price":"2.00","remarks":null,"print_name":"加黑砖","is_standard":"0"},{"id":5,"item_id":1,"created_at":null,"created_by":null,"status":1,"sort":70,"updated_at":null,"updated_by":null,"name":"芒果冻","price":"2.00","remarks":null,"print_name":"加芒果冻","is_standard":"0"},{"id":6,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":80,"updated_at":null,"updated_by":null,"name":"仙草冻","price":"2.00","remarks":null,"print_name":"加仙草冻","is_standard":"0"},{"id":7,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":50,"updated_at":null,"updated_by":null,"name":"红豆","price":"2.00","remarks":null,"print_name":"加红豆","is_standard":"0"},{"id":8,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"奶盖","price":"3.00","remarks":null,"print_name":"加奶盖","is_standard":"0"},{"id":9,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"}]}},{"product_id":3,"item_id":2,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":2,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"温度","remarks":null,"print_name":"温度","productAttrItemValues":[{"id":10,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"},{"id":11,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"多冰","price":"0.00","remarks":null,"print_name":"多冰","is_standard":"0"},{"id":12,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"去冰","price":"0.00","remarks":null,"print_name":"去冰","is_standard":"0"},{"id":13,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"温","price":"0.00","remarks":null,"print_name":"温","is_standard":"0"},{"id":14,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":50,"updated_at":null,"updated_by":null,"name":"热","price":"0.00","remarks":null,"print_name":"热","is_standard":"0"}]}},{"product_id":3,"item_id":3,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":3,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"糖量","remarks":null,"print_name":"糖量","productAttrItemValues":[{"id":15,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"},{"id":16,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"多糖","price":"0.00","remarks":null,"print_name":"多糖","is_standard":"0"},{"id":17,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"少糖","price":"0.00","remarks":null,"print_name":"少糖","is_standard":"0"},{"id":18,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"无糖","price":"0.00","remarks":null,"print_name":"无糖","is_standard":"0"}]}}]}
         * cart_num : 0
         * product_collected : 1
         */

        public ProductBean product;
        public int cart_num;
        public String product_collected;

        public static DataBean objectFromData(String str) {
            try {
                return new Gson().fromJson(str, DataBean.class);
            } catch (Exception e) {
                return JSON.parseObject(str, DataBean.class);
            }
        }

        public static class ProductBean implements Serializable {
            /**
             * id : 3
             * category_id : 2
             * image :
             * featured_image : null
             * image_small : http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/1.jpg
             * name : 韩国柚子茶
             * sort : 101
             * created_at : 20150608
             * created_by : 10
             * updated_at : 1500606445
             * updated_by : 1
             * price : 13.00
             * featured_price : 10.00
             * featured_position : null
             * featured_position_sort : 999
             * app_featured_home : null
             * app_featured_home_sort : 99
             * app_featured_image : null
             * short_description : 进口韩国柚子，热饮口感同样出众。
             * meta_keywords :
             * meta_description :
             * is_audit : null
             * remarks : null
             * featured : null
             * description : <p>
             * <br />
             * <div id="xunlei_com_thunder_helper_plugin_d462f475-c18e-46be-bd10-327458d045bd">
             * &nbsp;</div>
             * </p>
             * image_medium :
             * image_large :
             * app_featured_topic : null
             * app_featured_topic_sort : 99
             * app_long_image1 : http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/11.jpg
             * app_long_image2 : http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/2.jpg
             * app_long_image3 : http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/3.jpg
             * type_id : 1
             * app_long_image4 : http://data.eleteam.com/uploads/public/product/yin-pin/chao-ji-re-yin/han-guo-you-zi-cha/4.jpg
             * app_long_image5 : http://data.eleteam.com/uploads/public/product/pei-tu/64.jpg
             * status : 1
             * specs_json : {"1":{"1":"标准","2":"大杯"},"2":{"4":"标准","5":"加冰"}}
             * category : {"id":2,"featured":null,"image":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940.jpg","featured_image":null,"image_small":"http://data.eleteam.com/uploads/category/54b33ace3ace46728adfe3511b7e7ea2/category_54b33ace3ace46728adfe3511b7e7ea2_1463808751_8095.jpg","name":"奶茶精选","parent_id":"1","sort":20,"created_at":20150608,"created_by":10,"updated_at":20150626,"updated_by":10,"short_description":"专业手工现做释放天然植物的层次和香气","app_featured_home":"1","app_featured_home_sort":99,"parent_ids":"null1,","remarks":null,"meta_keywords":"","meta_description":"","href":null,"href_target":"_blank","image_medium":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_medium.jpg","image_large":"http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_large.jpg","status":1}
             * productAttrs : [{"product_id":3,"item_id":1,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":1,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"饮品加料","remarks":null,"print_name":"加料","productAttrItemValues":[{"id":1,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"珍珠","price":"1.00","remarks":null,"print_name":"加珍珠","is_standard":"0"},{"id":2,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"椰果","price":"1.00","remarks":null,"print_name":"加椰果","is_standard":"0"},{"id":3,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":90,"updated_at":null,"updated_by":null,"name":"彩色蒟蒻","price":"2.00","remarks":null,"print_name":"加彩色蒟蒻","is_standard":"0"},{"id":4,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":60,"updated_at":null,"updated_by":null,"name":"黑砖","price":"2.00","remarks":null,"print_name":"加黑砖","is_standard":"0"},{"id":5,"item_id":1,"created_at":null,"created_by":null,"status":1,"sort":70,"updated_at":null,"updated_by":null,"name":"芒果冻","price":"2.00","remarks":null,"print_name":"加芒果冻","is_standard":"0"},{"id":6,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":80,"updated_at":null,"updated_by":null,"name":"仙草冻","price":"2.00","remarks":null,"print_name":"加仙草冻","is_standard":"0"},{"id":7,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":50,"updated_at":null,"updated_by":null,"name":"红豆","price":"2.00","remarks":null,"print_name":"加红豆","is_standard":"0"},{"id":8,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"奶盖","price":"3.00","remarks":null,"print_name":"加奶盖","is_standard":"0"},{"id":9,"item_id":1,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"}]}},{"product_id":3,"item_id":2,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":2,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"温度","remarks":null,"print_name":"温度","productAttrItemValues":[{"id":10,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"},{"id":11,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"多冰","price":"0.00","remarks":null,"print_name":"多冰","is_standard":"0"},{"id":12,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"去冰","price":"0.00","remarks":null,"print_name":"去冰","is_standard":"0"},{"id":13,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"温","price":"0.00","remarks":null,"print_name":"温","is_standard":"0"},{"id":14,"item_id":2,"created_at":null,"created_by":null,"status":0,"sort":50,"updated_at":null,"updated_by":null,"name":"热","price":"0.00","remarks":null,"print_name":"热","is_standard":"0"}]}},{"product_id":3,"item_id":3,"status":1,"created_at":4294967295,"created_by":10,"updated_at":4294967295,"updated_by":10,"productAttrItem":{"id":3,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"糖量","remarks":null,"print_name":"糖量","productAttrItemValues":[{"id":15,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":10,"updated_at":null,"updated_by":null,"name":"标准","price":"0.00","remarks":null,"print_name":null,"is_standard":"1"},{"id":16,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":20,"updated_at":null,"updated_by":null,"name":"多糖","price":"0.00","remarks":null,"print_name":"多糖","is_standard":"0"},{"id":17,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":30,"updated_at":null,"updated_by":null,"name":"少糖","price":"0.00","remarks":null,"print_name":"少糖","is_standard":"0"},{"id":18,"item_id":3,"created_at":null,"created_by":null,"status":0,"sort":40,"updated_at":null,"updated_by":null,"name":"无糖","price":"0.00","remarks":null,"print_name":"无糖","is_standard":"0"}]}}]
             */

            public int id;
            public int category_id;
            public String image;

            public static ProductBean objectFromData(String str) {
                try {
                    return new Gson().fromJson(str, ProductBean.class);
                } catch (Exception e) {
                    return JSON.parseObject(str, ProductBean.class);
                }
            }

            public static class CategoryBean implements Serializable {
                /**
                 * id : 2
                 * featured : null
                 * image : http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940.jpg
                 * featured_image : null
                 * image_small : http://data.eleteam.com/uploads/category/54b33ace3ace46728adfe3511b7e7ea2/category_54b33ace3ace46728adfe3511b7e7ea2_1463808751_8095.jpg
                 * name : 奶茶精选
                 * parent_id : 1
                 * sort : 20
                 * created_at : 20150608
                 * created_by : 10
                 * updated_at : 20150626
                 * updated_by : 10
                 * short_description : 专业手工现做释放天然植物的层次和香气
                 * app_featured_home : 1
                 * app_featured_home_sort : 99
                 * parent_ids : null1,
                 * remarks : null
                 * meta_keywords :
                 * meta_description :
                 * href : null
                 * href_target : _blank
                 * image_medium : http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_medium.jpg
                 * image_large : http://data.eleteam.com/userfiles/10/images/yin-pin/nai-cha-jing-xuan/20110205033512-1205773940_large.jpg
                 * status : 1
                 */

                public int id;
                public Object featured;
                public String image;
                public Object featured_image;
                public String image_small;
                public String name;
                public String parent_id;
                public int sort;
                public int created_at;
                public int created_by;
                public int updated_at;
                public int updated_by;
                public String short_description;
                public String app_featured_home;
                public int app_featured_home_sort;
                public String parent_ids;
                public Object remarks;
                public String meta_keywords;
                public String meta_description;
                public Object href;
                public String href_target;
                public String image_medium;
                public String image_large;
                public int status;

                public static CategoryBean objectFromData(String str) {
                    try {
                        return new Gson().fromJson(str, CategoryBean.class);
                    } catch (Exception e) {
                        return JSON.parseObject(str, CategoryBean.class);
                    }
                }
            }

            public static class ProductAttrsBean {
                public static ProductAttrsBean objectFromData(String str) {
                    try {
                        return new Gson().fromJson(str, ProductAttrsBean.class);
                    } catch (Exception e) {
                        return JSON.parseObject(str, ProductAttrsBean.class);
                    }
                }

                public static class ProductAttrItemBean {
                    public static ProductAttrItemBean objectFromData(String str) {
                        try {
                            return new Gson().fromJson(str, ProductAttrItemBean.class);
                        } catch (Exception e) {
                            return JSON.parseObject(str, ProductAttrItemBean.class);
                        }
                    }

                    public static class ProductAttrItemValuesBean {
                        public static ProductAttrItemValuesBean objectFromData(String str) {
                            try {
                                return new Gson().fromJson(str, ProductAttrItemValuesBean.class);
                            } catch (Exception e) {
                                return JSON.parseObject(str, ProductAttrItemValuesBean.class);
                            }
                        }
                    }
                }
            }
        }
    }

    public static class ShareBean {
        public static ShareBean objectFromData(String str) {
            try {
                return new Gson().fromJson(str, ShareBean.class);
            } catch (Exception e) {
                return JSON.parseObject(str, ShareBean.class);
            }

        }
    }
}
