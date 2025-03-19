$(function(){
    // $('.m_menu li ul').css('display', 'none');
    $('.sub').hide();
    // $('.sub').eq(0).show();
    $('.m_menu li ul').eq(0).show();

    $('.m_menu li a').click(function(){
        var kkk = $(this).next('.sub').css('display');
        // 클릭 a 다음에 .sub의 display의 상태가 none인지 block인지 알 수있음
        // alert(kkk);
        if(kkk == "none"){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();
            // 방금 클릭한 다음에 .sub를 보여줌
        }


        return false;
    });

});