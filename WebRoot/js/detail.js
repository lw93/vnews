var loading = "<div id=\"loading\" class=\"loading-center\"><img src=\"/vnews/static/loading.gif\"/> 正在加载数据,请稍候...</div>";
var empty="<div id=\"empty\" class=\"text-center vnews-body\">" 
		+"<img alt=\"news\" src=\"/vnews/static/empty.png\">"
		+"<p>暂无数据</p></div>";
$(document).ready(function() {
	if(window.sessionStorage.body){
		var tab = getData("tabTitle");
		var title = getData("bodyTitle");
		setTitle(tab,title);
		var body = getData("body");
		setData(body);
	}else{
		var tab =  getQueryString("tab");
		//console.log("tab="+tab);
		var title =  getQueryString("title");
		//console.log("title="+title);
		var id =  getQueryString("bodyId");
		//console.log("id="+id);
		setTitle(tab,title);
		getVNews(tab,title,id);
		saveData("tabTitle",tab);
		saveData("bodyTitle",title);
	}
	$("#home").click(function(){
//		console.log("storage=home");
		saveData("tab","头条");
	});
	$("#tab-title").click(function(){
//		console.log("storage=title");
		saveData("tab",getData("tabTitle"));
	});
});

function setTitle(tabTitle,bodyTitle){
	$("#tab-title").replaceWith("<a id=\"tab-title\" href=\"/vnews/\" target=\"_blank\">"+tabTitle+"</a>");
	$("#vnews-body-title h3").replaceWith("<h3>"+bodyTitle+"</h3>");
};
function getQueryString(name){
	 var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null) return  decodeURI(r[2]); return null;
};
//显示加载数据
function ShowLoading() {
	$("#vnews-body").prepend(loading);
	$("#loading").fadeIn();
};

//隐藏加载数据
function HiddenLoading() {
	$("#loading").delay("fast").fadeOut(function(){
		$(this).remove();
	});
};
function getVNews(tab,title,bodyId){
   var reqData = {
		vnewsType:tab,
   		bodyId:bodyId
   };
   $.ajax({
		  type: "POST",
		  url: "/vnews/queryBody",
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
				// 可能出现异常的代码
				var result = data.data.body;
				setData(result);
				saveData("body", result);
			} catch (e) {
				setData(empty);
			}
			
		  },
		  error : function(jqXHR, textStatus, errorThrown) {
			HiddenLoading();
			setTimeout(function () {
				setData(empty);
		    }, 1000);
//			if (textStatus != "timeout") {
//				 alert("操作失败,请刷新");
//			}else {
//				alert("加载超时，请刷新");	 
//		    }
		 }
		});
};

function setData(result){
	$("#exchange-body").replaceWith(result);
};

function saveData(index,object){
	var storage = window.sessionStorage;  
    storage.setItem(index, object);
    //console.log("storage="+storage.getItem(index));
};

function getData(index){
	var storage = window.sessionStorage;  
    return storage.getItem(index);  
};