  $(function () {
	$("#custom_file_upload").uploadify(
			
			{
	       'height'        : 40,
	       'width'         : 80, 
	       'buttonText'    : '上传图片',
	       'swf'           : 'js/uploadify/uploadify.swf', 
	       'uploader'      : 'http://localhost:8080/blog02/upload.do',
	       'auto'          : true,
	       'multi'         : false,
	       'removeCompleted':false,
	       'cancelImg'     : 'js/uploadify/uploadify-cancel.png',
	       'fileTypeExts'  : '*.jpg;*.jpge;*.gif;*.png',
	       'fileSizeLimit' : '2MB',
	       'onUploadSuccess':function(file){
	          // $('#' + file.id).find('.data').html('');
	           $("#upload_org_code_name").val(file.name);
	           $("#custom-queue").attr("src","http://localhost:8080/blog02/showImg.do?fileName="+file.name);  
	           $("#custom-queue").show();
	       },
	       //加上此句会重写onSelectError方法【需要重写的事件】
	       'overrideEvents': ['onSelectError', 'onDialogClose'],
	       //返回一个错误，选择文件的时候触发
	       'onSelectError':function(file, errorCode, errorMsg){
	           switch(errorCode) {
	               case -110:
	                   alert("文件 ["+file.name+"] 大小超出系统限制的" + jQuery('#upload_org_code').uploadify('settings', 'fileSizeLimit') + "大小！");
	                   break;
	               case -120:
	                   alert("文件 ["+file.name+"] 大小异常！");
	                   break;
	               case -130:
	                   alert("文件 ["+file.name+"] 类型不正确！");
	                   break;
	           }
	       }});
});
