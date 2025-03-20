$(function(){

    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        // $('section>article').eq(0).css({'transform':'translateZ('+sct+'px)'});
        // $('section>article').eq(1).css({'transform':'translateZ('+((-5000)+sct)+'px)'});
        // $('section>article').eq(2).css({'transform':'translateZ('+((-10000)+sct)+'px)'});
        // $('section>article').eq(3).css({'transform':'translateZ('+((-15000)+sct)+'px)'});
        // $('section>article').eq(4).css({'transform':'translateZ('+((-20000)+sct)+'px)'});
        for(var i = 0; i < 5; i++){
            $('section>article').eq(i).css({'transform':'translateZ('+((-5000*i)+sct)+'px)'});
        }
        if(sct >=0 && sct < 5000){
                $('article').removeClass('on');
                $('article').eq(i).addClass('on');
                $('.scrollNav li').removeClass('on');
                $('.scrollNav li').eq(i).addClass('on');
            }

            // $('section>article').each(function(i){
            //     $('section>article').eq(i).css({'transform':'translateZ('+((-5000*i)+sct)+'px)'}); 
            //     if(sct >= i*5000 && sct < (i+1)*5000){
            //         $('article').removeClass('on');
            //         $('article').eq(i).addClass('on');
            //         $('.scrollNav li').removeClass('on');
            //         $('.scrollNav li').eq(i).addClass('on');
            //     }
            // });


        // if(sct >=0 && sct < 5000){
        //     $('article').removeClass('on');
        //     $('article').eq(0).addClass('on');
        //     $('.scrollNav li').removeClass('on');
        //     $('.scrollNav li').eq(0).addClass('on');
        // }
        // if(sct >=5000 && sct < 10000){
        //     $('article').removeClass('on');
        //     $('article').eq(1).addClass('on');
        //     $('.scrollNav li').removeClass('on');
        //     $('.scrollNav li').eq(1).addClass('on');
        // }
        // if(sct  >=10000  && sct < 15000){
        //     $('article').removeClass('on');
        //     $('article').eq(2).addClass('on');
        //     $('.scrollNav li').removeClass('on');
        //     $('.scrollNav li').eq(2).addClass('on');
        // }
        // if(sct >=15000 && sct < 20000 ){
        //     $('article').removeClass('on');
        //     $('article').eq(3).addClass('on');
        //     $('.scrollNav li').removeClass('on');
        //     $('.scrollNav li').eq(3).addClass('on');
        // }   
        // if(sct >=20000 && sct < 25000 ){
        //     $('article').removeClass('on');
        //     $('article').eq(4).addClass('on');
        //     $('.scrollNav li').removeClass('on');
        //     $('.scrollNav li').eq(4).addClass('on');
        // }


    });


});