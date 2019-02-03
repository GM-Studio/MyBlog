$(document).ready(function () {

    // $.ajax({
    //     url:"/tag",
    //     method:"GET",
    //     data:{},
    //     dataType:"json",
    //     success:function (data) {
    //
    //         if(data.code==200)
    //         {
    //             var tag_cloud=$("#tag-cloud");
    //             tag_cloud.empty();
    //             $.each(data.data,function (i,x) {
    //                     console.log("hello"+x.tag_id);
    //                     tag_cloud.append("<a href=\"\" class=\"blog-tag\">"+x.tag_desc+"</a>");
    //             })
    //         }
    //         else if(data.code==-1)
    //         {
    //             console.log("数据库操作异常");
    //         }
    //     },
    //     error:function () {
    //        console.log("ajax请求异常");
    //     }
    // })



    $.ajax({
        url:"/user/1",
        method:"get",
        data:{},
        dataType:"json",
        success:function(data)
        {
            if(data.code==200)
            {
                console.log("请求到数据");
                var myinfo=$("#myinfo");
                myinfo.empty();
                myinfo.append("            <h2 class=\"blog-text-center blog-title\"><span>About ME</span></h2>\n");
                myinfo.append("            <img src=\"assets/i/f14.jpg\" alt=\"about me\" class=\"blog-entry-img\" >\n");
                myinfo.append("            <p>"+data.data.userName+"</p>\n");
                myinfo.append("  <p>\n" +data.data.userDesc+"</p>");
                var mytags=$("#mytags");
                mytags.empty();
                $.each(data.data.userTags,function (i,x) {
                    mytags.append("<a class=\"blog-tag\">"+x.tagName+"</a>\n");
                })
                var mysocial=$("#mycontact");
                mysocial.empty();
                $.each(data.data.userSocials,function (i,x) {
                    mysocial.append("<a href="+x.socialUrl+"\"><span class=\"am-icon-"+x.socialName+" am-icon-fw am-primary blog-icon\"></span></a>\n");
                })
            }
        },
        error:function (data) {
            console.log("ajax请求失败");
        }
    })


})