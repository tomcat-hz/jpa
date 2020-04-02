$(function () {
    $.ajax({
        type: 'get',
        url:'/icons',
        success: function (data) {
            $.each(data,function (i, e) {
                console.log(e);
                $('#container').append('<li class="layui-nav-item"><a><i class="iconfont '+e.substring(1,e.indexOf(':'))+'"></i>'+i+'</a></li>')
            })
        },
        error:function () {
            alert('服务器异常');
        }
    })
})