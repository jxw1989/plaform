<!DOCTYPE html />
<html>
<head>
    <title>Hello MiniUI!</title>
    <!--jQuery js-->
    <script src="web/js/jquery.min.js" type="text/javascript"></script>
    <!--MiniUI-->
    <link href="web/css/themes/default/miniui.css" rel="stylesheet" type="text/css" />
    <script src="web/js/miniui/miniui.js" type="text/javascript"></script>
</head>
<body>
<div id="layout1" class="mini-layout" style="width:100%;height:100%;">
    <div class="header" region="north" height="70" showSplit="false" showHeader="false">
    </div>
    <div title="south" region="south" showSplit="false" showHeader="false" height="30" >
    </div>
    <div title="center" region="center" bodyStyle="overflow:hidden;">
        <!--Splitter-->
        <div class="mini-splitter" style="width:100%;height:100%;" borderStyle="border:0;">
            <div size="180" maxSize="250" minSize="100" showCollapseButton="true">
            </div>
            <div showCollapseButton="false">
            </div>
        </div>
    </div>
</div>
<!--OutlookTree-->
<div id="leftTree" class="mini-outlooktree" url="../data/outlooktree.txt" onnodeselect="onNodeSelect"
     textField="text" idField="id" parentField="pid"
>
</div>
</body>
</html>
