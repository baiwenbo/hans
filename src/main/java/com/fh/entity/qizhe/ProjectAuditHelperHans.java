package com.fh.entity.qizhe;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProjectAuditHelperHans {

    public static Map<String, String> PROJECT_INFO = new LinkedHashMap<>();

    public static Map<String, String> UPPER_CASE_INFO = new HashMap<>();

    public static Map<String, String> PROJECT_HELP = new HashMap<>();

    static {
        PROJECT_INFO.put("1", "苏宁店招、LOGO明显无遮挡，干净无破损，夜间（营业后2H）发光，外墙、外部橱窗干净明亮");
        PROJECT_INFO.put("2", "户外LED文字屏、彩屏正常放映，内容未过期，外立面广告位广告画面内容无过期、无破损");
        PROJECT_INFO.put("3", "门前三包区域无垃圾杂物，无小贩、大量电动车影响出入");
        PROJECT_INFO.put("4", "主通道、展厅灯光均有打开，光线充足；店内温度适当舒服；");
        PROJECT_INFO.put("5", "背景音乐音量合适，可以听到，但不影响交谈（无背景音乐不给分）");
        PROJECT_INFO.put("6", "地面、墙面清洁，垃圾桶无堆满，现场无杂物堆积、无黄纸箱、无废弃展台。");
        PROJECT_INFO.put("7", "多楼层门店每层至少开启一组自动扶梯，未开启则扣分（无电梯或关闭下行电梯不扣分）");
        PROJECT_INFO.put("8", "店内有楼层导引、功能区（卫生间、服务台等）导引");
        PROJECT_INFO.put("9", "设备完好，正常使用，地面、台面、镜面、马桶等整洁干净，空气清新无异味（无卫生间正常给分）");
        PROJECT_INFO.put("10", "无私接乱接电源、违规使用大功率电器现象（如电瓶车充电、电水壶烧水等）");
        PROJECT_INFO.put("11", "防火门处于常闭不落锁状态，防火卷帘门下无任何物品");
        PROJECT_INFO.put("12", "样机无破损、污渍等瑕疵缺陷，商品摆放整齐，无乱扔现象");
        PROJECT_INFO.put("13", "可容性样机（冰箱、洗衣机、电饭煲、微波炉）内未摆放杂物（展示用品不违规）");
        PROJECT_INFO.put("14", "单个品牌出现缺样且无布展情况");
        PROJECT_INFO.put("15", "拔出真机的防盗器发出警报，出警报后10秒有人处理");
        PROJECT_INFO.put("16", "无手写/涂改价签的现象、无使用其他物料代替价签的现象");
        PROJECT_INFO.put("17", "店内布展物料中无厂家二维码、联系方式、网址等信息");
        PROJECT_INFO.put("18", "无促销活动指导书、商品库存表、顾客购买台帐外露现象");
        PROJECT_INFO.put("19", "全体人员佩戴工牌、全套工装，穿着整洁干净");
        PROJECT_INFO.put("20", "营业期间站姿自然，无坐岗、趴柜、靠柜以及3人以上聚岗现象");
        PROJECT_INFO.put("21", "无横屏看手机现象，竖屏看手机走近3米内放下手机 ");
        PROJECT_INFO.put("22", "在顾客要寻求帮助、有眼神交汇时或遇到询问时，对顾客说您好欢迎光临，或微笑示意");
        PROJECT_INFO.put("23", "顾客进入展厅展柜后1分钟内有人接待，遇忙时客气的请顾客稍等片刻");
        PROJECT_INFO.put("24", "有顾客服务时收银人员双手交递物品");
        PROJECT_INFO.put("25", "店内提供免费WIFI且至少达到2格信号，2分钟内完成一个20M的APP下载");
        PROJECT_INFO.put("26", "POS机背景、吊板、立式立牌、台卡中均有30/365的服务承诺展示");
        PROJECT_INFO.put("27", "收银台、POS台、服务台、打卡机处有公示苏宁投诉渠道");
        PROJECT_INFO.put("28", "收银台/服务台有扫码反馈布展，无人的收银台摆放“暂停收银”台卡");
        PROJECT_INFO.put("29", "是否发现飞单、私收现金、窜码开票、虚假销售等违规销售，是否发现私设pos机/个人收款二维码/私刻印章/私买收据等情况");
        PROJECT_INFO.put("30", "随机询价3个大家电商品，是否存在报价低于挂牌价10%的现象；随机询价2个3C/小家电商品，是否存在报价低于挂牌价5%的现象");
        PROJECT_INFO.put("31", "表明家中有旧家电需处理，销售人员是否表示有不通过苏宁收旧的渠道");
        PROJECT_INFO.put("32", "苏宁快修点位是否配备电脑、打印机、监控摄像头、三脚架；\n" +
                "苏宁快修维修工具是否配备防静电垫、台灯、螺丝刀、镊子、钳子、吸盘、夹具、拨片、稳压电源、万用表、恒温烙铁、热风枪、酒精瓶（含酒精）、海绵、毛刷、无尘布；\n" +
                "苏宁快修形象是否有标准工装、防静电手环、标准背景墙、标准快修桌、区域卫生、桌面整洁、价格公示、暂停服务牌、下单邀评活动单页、名片架；");


        for (String key : PROJECT_INFO.keySet()) {
            UPPER_CASE_INFO.put(key, key.toUpperCase());
        }



        PROJECT_HELP.put("1", "不符合标准扣全分　　　　　　　　　　　　　　");
        PROJECT_HELP.put("2", "不符合标准扣全分");
        PROJECT_HELP.put("3", "不符合标准扣全分");
        PROJECT_HELP.put("4", "不符合标准扣全分");
        PROJECT_HELP.put("5", "不符合标准扣全分");
        PROJECT_HELP.put("6", "每发现1起少给1分");
        PROJECT_HELP.put("7", "不符合标准扣全分");
        PROJECT_HELP.put("8", "不符合标准扣全分");
        PROJECT_HELP.put("9", "不符合标准扣全分");
        PROJECT_HELP.put("10","不符合标准扣全分");
        PROJECT_HELP.put("11","不符合标准扣全分");
        PROJECT_HELP.put("12","不符合标准扣全分");
        PROJECT_HELP.put("13","不符合标准扣全分");
        PROJECT_HELP.put("14","不符合标准扣全分");
        PROJECT_HELP.put("15","不符合标准扣全分");
        PROJECT_HELP.put("16","不符合标准扣全分");
        PROJECT_HELP.put("17","不符合标准扣全分");
        PROJECT_HELP.put("18","不符合标准扣全分");
        PROJECT_HELP.put("19","发现3人以下，给2分；发现3人以上，不给分");
        PROJECT_HELP.put("20","每发现1起少给1分");
        PROJECT_HELP.put("21","每发现1起少给1分");
        PROJECT_HELP.put("22","每发现1起少给1分");
        PROJECT_HELP.put("23","不符合标准扣全分");
        PROJECT_HELP.put("24","不符合标准扣全分");
        PROJECT_HELP.put("25","不符合标准扣全分");
        PROJECT_HELP.put("26","不符合标准扣全分");
        PROJECT_HELP.put("27","不符合标准扣全分");
        PROJECT_HELP.put("28","不符合标准扣全分");
        PROJECT_HELP.put("29","");
        PROJECT_HELP.put("30","");
        PROJECT_HELP.put("31","");
        PROJECT_HELP.put("32","");



    }
}
