$(function(){

// ========================= popup =========================
    $('#notice_wrap').draggable();

    $(document).ready(function(){
        $(document).on("click", ".closeBtn", function() {
            console.log("close");
            closePop();
        });
    
        window.closePop = function() {
            if ($("#expiresChk").is(":checked")) { 
                Cookies.set('popup', 'none', { expires:7 });
            }
            $('#notice_wrap').fadeOut("fast");
        };
    
        if (Cookies.get('popup') === 'none') {
            $('#notice_wrap').hide();
        }
    });
// ========================= popup =========================

// ========================= section01 slide =========================
    $('.slide .sg a').eq(0).css("left","0");
    var current = 0;
    var d;

    setInterval(function(){
        current++;
        if(current==5){current=0;}

        $('.dot a').removeClass('on');
        $('.dot a').eq(current).addClass('on');
        $('.slide .sg a').eq(current-1).css("left","0").animate({"left":"-100%"},600);
        $('.slide .sg a').eq(current).css("left","100%").animate({"left":"0"},600);
    },3000);

    $('.dot a').click(function(event){
        event.preventDefault();

        d = $(this).index();
        $('.dot a').removeClass('on');
        $(this).addClass('on');        

        if(current < d){
            $('.slide .sg a').eq(current).css("left","0").animate({"left":"-100%"},600);
            $('.slide .sg a').eq(d).css("left","100%").animate({"left":"0"},600);
            current = d;
        } else if(current > d){
            $('.slide .sg a').eq(current).css("left","0").animate({"left":"100%"},600);
            $('.slide .sg a').eq(d).css("left","-100%").animate({"left":"0"},600);
            current = d;
        }
        return false;  
    });
// ========================= section01 slide =========================

// ========================= section02 =========================
    $(document).ready(function(){
        var currentSlide = {};
        var totalSlides = {};
        var itemsPerPage = 4;

        $('.menu_wrap .menu').each(function(index){
            var $menu = $(this).find('ul');
            currentSlide[index] = 0;
            totalSlides[index] = $menu.find('li').length;

            var maxIndex = Math.ceil(totalSlides[index] / itemsPerPage) - 1;
            $menu.data('maxIndex', maxIndex);
        });
// ========================= section02 =========================

// ========================= slide reset =========================
        $('.menu_top .mt_right li').click(function(event){
            event.preventDefault();
        
            var tabIndex = $(this).index();
                $('.menu_wrap>div').hide().eq(tabIndex).fadeIn(400);
                $('.menu_wrap>div').hide().eq(tabIndex).show();
                $('.menu_top .mt_right li').removeClass('on');
                $(this).addClass('on');

            currentSlide[tabIndex] = 0;
                $('.menu_wrap .menu').eq(tabIndex).find('ul').css("margin-left", "0");

                return false;
        });
// ========================= slide reset =========================        

// ========================= slide btn =========================
        $('.s02_wrap a.prev').click(function(event){
            event.preventDefault();
        
            var activeTabIndex = $('.menu_wrap>div:visible').index();
            if(currentSlide[activeTabIndex] > 0) {
                currentSlide[activeTabIndex]--;
                $('.menu_wrap .menu').eq(activeTabIndex).find('ul')
                .   animate({"margin-left": -(currentSlide[activeTabIndex] * 300) + "px"}, 600);
            }
        });

        $('.s02_wrap a.next').click(function(event){
            event.preventDefault();

            var activeTabIndex = $('.menu_wrap>div:visible').index();
            var maxIndex = $('.menu_wrap .menu').eq(activeTabIndex).find('ul').data('maxIndex');

            if(currentSlide[activeTabIndex] < maxIndex) {
                currentSlide[activeTabIndex]++;
                $('.menu_wrap .menu').eq(activeTabIndex).find('ul')
                    .animate({"margin-left": -(currentSlide[activeTabIndex] * 300) + "px"}, 600);
            }
        });
    });
// ========================= slide btn =========================

// ========================= mouse_hover =========================
    $('.menu ul li').mouseenter(function(){
        $('.menu ul li').css('margin-left','10px');
        $(this).css('width','350px');
    });

    $('.menu ul li').mouseleave(function(){
        $('.menu ul li').css({'margin-left':'40px', 'width':'260px'});
    });
// ========================= mouse_hover =========================

// ========================= section02 slide_2 =========================
    $('.slide_2 .sg_2 a').eq(0).css("left","0");
    var current_2 = 0;
    var d_2;

    setInterval(function(){
        current_2++;
        if(current_2==6){current_2=0;}

        $('.dot_2 a').removeClass('on');
        $('.dot_2 a').eq(current_2).addClass('on');
        $('.slide_2 .sg_2 a').eq(current_2-1).css("left","0").animate({"left":"-100%"},600);
        $('.slide_2 .sg_2 a').eq(current_2).css("left","100%").animate({"left":"0"},600);
    },3500);

    $('.dot_2 a').click(function(event){
        event.preventDefault();

        d_2 = $(this).index();
        $('.dot_2 a').removeClass('on');
        $(this).addClass('on');        

        if(current_2 < d_2){
            $('.slide_2 .sg_2 a').eq(current_2).css("left","0").animate({"left":"-100%"},600);
            $('.slide_2 .sg_2 a').eq(d_2).css("left","100%").animate({"left":"0"},600);
            current_2 = d_2;
        } else if(current_2 > d_2){
            $('.slide_2 .sg_2 a').eq(current_2).css("left","0").animate({"left":"100%"},600);
            $('.slide_2 .sg_2 a').eq(d_2).css("left","-100%").animate({"left":"0"},600);
            current_2 = d_2;
        }
        return false;
    });
// ========================= section02 slide_2 =========================

});