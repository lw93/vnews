
/*window.onload = function() {
	
};*/
var pageNum = -1;// index of item
var vnewsType = "头条";
var loading = "<div id=\"loading\" class=\"loading-center\"><img src=\"/vnews/static/loading.gif\"/> 正在加载数据,请稍候...</div>";
var empty="<div id=\"empty\" class=\"text-center vnews-body\">" 
	+"<img alt=\"news\" src=\"/vnews/static/empty.png\">"
	+"<p>暂无数据</p></div>";
$(document).ready(function() {
	if(window.sessionStorage.tab){
	    $("#myTab li").each(function(){
			var tab = $(this).text();
			if(tab == getData("tab")){
				$(this).addClass("active");
				reqData.pageNum = 1;
				getVNews();
				return false;
			}
		});
	}else{
		defualtTab();
	}
});
function defualtTab() {
	$('#myTab li:first a').tab('show');
	reqData.pageNum = 1;
	getVNews();
};
var reqData = {
	vnewsType : vnewsType,
	pageNum : pageNum,
	size : "7"
};

function getVNews(){
   var tab = $("li.active").text();
   reqData.vnewsType = tab;
   $.ajax({
		  type: "POST",
		  url: "/vnews/queryAll",
		  async: true,
		  timeout: 3000,
		  beforeSend: function () {
			  ShowLoading();
		  },
		  data: JSON.stringify(reqData),
		  contentType : "application/json",
		  dataType: "json",
		  success : function(data) {
			  HiddenLoading(); 
			  try {  
				  addData(data.data.list);
				} catch(e) {  
				  if(reqData.pageNum == 1){
					  $("#vnews-content-ul").replaceWith(empty);
				  }
				}
		  },
		  error : function(jqXHR, textStatus, errorThrown) {
			  HiddenLoading();
			  setTimeout(function () {
				  if (textStatus == "timeout") {
					  alert("加载超时，请点击刷新");
				   }else if(reqData.pageNum ==1 ){
					   $("#vnews-content-ul").replaceWith(empty);
				   }else{
						  alert("操作失败,请点击刷新");
				   }
			  }, 1000);
		 }
		});
};

function selectTab(){
	$('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
	    // 获取已激活的标签页的名称
	    var activeTab = $(e.target).text();
	    // 获取前一个激活的标签页的名称
	    var previousTab = $(e.relatedTarget).text();
		//reqData.vnewsType = activeTab;
	    saveData("tab",$("li.active").text());
		//console.log("tab.title="+getData("title"));
		$("#vnews-content-ul").empty();
		reqData.pageNum = 1; 
		$("#myScrollspy").prepend(loading);
		getVNews();
	});
};
selectTab();
/*$('#myTab li').click(function (e) {
	  e.preventDefault();
	  $(this).tab('show');
	  $('a[data-toggle="tab"]').on('show.bs.tab', function (e) {
		  e.target // 激活的标签页
		  e.relatedTarget // 前一个激活的标签页
		  console.log("#error-qq="+$(this.relatedTarget).text());
		})
	  $.ajax({
		  type: "POST",
		  url: "/vnews/queryAll",
		  async: true,
		  beforeSend: function () {
			  ShowLoading();
		  },
		  complete: function () {
			  HiddenLoading();
		  },
		  data: data,
		  dataType: "json",
		  success : function(success) {
			console.log("#success=" + success)
		  },
		  error : function(error) {
			// view("异常！"); JSON.stringify()
			console.log("#error=" + error)
		 }
		});
});*/
//刷新事件
function refreshClick(){
	$("#refresh").click(function(){
		removeData();
		pageNum = 0;
		$("#vnews-content-ul").empty();
		reqData.pageNum = 1;
		$("#myScrollspy").prepend(loading);
		$(window).scrollTop();
		getVNews();
	});
};
refreshClick();

//显示加载数据
function ShowLoading() {
	$("#loading").fadeIn();
};

//隐藏加载数据
function HiddenLoading() {
	$("#loading").fadeOut(function(){
		$(this).remove();
	});
};
function addData(array){
	var length = array.length;
	for(var i = 0 ;i < length; i++){
        pageNum++;
        var title = array[i].title;
        var editor = array[i].editor;
        if(null == editor || "null" == editor){
        	editor="";
		}
      	var item = "<li class=\"pageNum_"+pageNum+"\"><div class=\"media\" >"
				+"<div class=\"media-left media-middle \">"
				+"<a href=\"javascript:void(0);\"> <img class=\"media-object thumbnail vnews-img\" src=\""+array[i].imgUrl+"\" alt=\"thumbnail\">"
				+"</a>"
				+"</div>"
				+"<div class=\"media media-body\">"
				+"<h4 class=\"media-heading\"><b>"+title+"</b></h4>"
				+"<p class=\"short-content text-left\"><b>"
				+ array[i].shortContent											
				+"	</b></p>"
				+"	<span class=\"media pull-left\">"+editor+"</span>"
				+"	<span class=\"media pull-right\">"+array[i].resouce+"</span>"
				+"</div>"
			+"</div></li>";	
	        $("#vnews-content-ul").delay("slow").append(item);
	        saveData(pageNum,array[i].docId);
	        saveData(array[i].docId,title);
      }
};
function scroll(){
	$(window).scroll(function(event){  
//	    var scroll= $(this).scrollTop();  
		var scroll=document.body.scrollTop||document.documentElement.scrollTop;
	    //$(this).scrollTop():滚动条的滚动高度，不可见的部分  
	    //$(window).height():窗口，可见部分的高度  
	    var windowHeight=document.body.clientHeight||document.documentElement.clientHeight;
	    
//	    console.log("scroll="+scroll);       
//	    console.log("window="+windowHeight);       
	    if(scroll > 260){
	    	$("#vnews-tab").delay("fast").addClass("navbar-fixed-top fade in");
	    }else{
	    	$("#vnews-tab").delay("fast").removeClass("navbar-fixed-top fade in");
	    }
//	    var doc =$(document).height(); 
	    var doc=document.body.scrollHeight||document.documentElement.scrollHeight;
	    //$(document).height();整个文档的高度，（可见+不可见）  
//	    console.log("document="+doc); 
	    var mod =parseInt(doc-scroll-windowHeight)%14;
	    if(mod == 7){
	    	$("#vnews-content-ul").delay("fast").append(loading);
	    	setTimeout(function () {
	    	　reqData.pageNum++;
	          getVNews();
	    	}, 500);	
	    }  
	});   
};
scroll();
$("#vnews-content-ul").delegate("li","click",function(){
	var className = $(this).attr("class");
	var index = className.substring(8);
	//console.log("pageNum="+index);
	var tab = $("li.active").text();
	var id = getData(index);
	var title = getData(id);
	window.open(encodeURI("/vnews/jsp/detail.jsp?tab="+tab+"&title="+title+"&bodyId="+id));
});

function saveData(index,object){
	var storage = window.sessionStorage;  
    storage.setItem(index, object);
    //console.log("storage="+storage.getItem(index));
};

function removeData(){
	var storage = window.sessionStorage;  
    storage.clear();
};

function getData(index){
	var storage = window.sessionStorage;  
    return storage.getItem(index);  
};
/*$(document).ready(function(){  
    $(document.body).unbind("scroll").bind("scroll", function(e){  
        var sum = this.scrollHeight;  
        if (sum <= $(this).scrollTop() + $(this).height()) {  
            $(".vnews-content").append($(".child").clone());  
        }  
    });  
}); */ 