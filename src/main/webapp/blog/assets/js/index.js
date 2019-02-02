$(document).ready(function () {

    $.ajax({
        url:"/tag",
        method:"GET",
        data:{},
        dataType:"json",
        success:function (data) {

            if(data.code==200)
            {
                var tag_cloud=$("#tag-cloud");
                tag_cloud.empty();
                $.each(data.data,function (i,x) {
                        console.log("hello"+x.tag_id);
                        tag_cloud.append("<a href=\"\" class=\"blog-tag\">"+x.tag_desc+"</a>");
                })
            }
            else if(data.code==-1)
            {
                console.log("数据库操作异常");
            }
        },
        error:function () {
           console.log("ajax请求异常");
        }
    })
})