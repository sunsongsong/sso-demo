package song.systemb.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/index")
    public String toIndex(HttpServletRequest request, HttpServletResponse response) {
        logger.info("system-b index ...");
        // A系统登录，前往认证中心验证，产生cookie分写入到对应域名的cookie，
        // 对应域名访问登录，拿到cookie，前往认证中心认证
        if(true){//校验用户账号密码
            //设置服务器端以UTF-8编码进行输出
            response.setCharacterEncoding("UTF-8");
            //设置浏览器以UTF-8编码进行接收,解决中文乱码问题
            response.setContentType("text/html;charset=UTF-8");
            //用户访问过之后重新设置用户的访问时间，存储到cookie中，然后发送到客户端浏览器
            //模拟生成token
            Cookie cookie = new Cookie("token", "123456");
            //将cookie对象添加到response对象中，这样服务器在输出response对象中的内容时就会把cookie也输出到客户端浏览器
            response.addCookie(cookie);
        }
        return "index";
    }




}
