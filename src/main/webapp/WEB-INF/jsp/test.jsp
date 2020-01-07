<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>百度在线地图</title>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=3.0&ak=S8ebG9IGOxiZvyujaWYUIqYV8Tpx5yA9"></script>
</head>
<body>
<div id="baidu_map" style="width: 800px ; height: 500px">加载中,请稍后...</div>
</body>

<script type="text/javascript">
    //添加地图
    var map = new BMap.Map("baidu_map");
    var point = new BMap.Point(${a},${b});
    map.centerAndZoom(point, 19);  // 初始化地图,设置中心点坐标和地图级别

    map.enableScrollWheelZoom();                  // 启用滚轮放大缩小。


    //添加一个跳跃的点
    var marker = new BMap.Marker(point);  // 创建标注
    map.addOverlay(marker);               // 将标注添加到地图中
    marker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画

    //添加控件
    var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});// 左上角，添加比例尺
    var top_left_navigation = new BMap.NavigationControl();  //左上角，添加默认缩放平移控件
    var top_right_navigation = new BMap.NavigationControl({anchor: BMAP_ANCHOR_TOP_RIGHT, type: BMAP_NAVIGATION_CONTROL_SMALL}); //右上角，仅包含平移和缩放按钮
    map.addControl(top_left_control);
    map.addControl(top_left_navigation);
    map.addControl(top_right_navigation);
</script>
</html>