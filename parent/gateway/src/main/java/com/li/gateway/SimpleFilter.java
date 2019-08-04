/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/28 11:17
 */

package com.li.gateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class SimpleFilter extends ZuulFilter {

    /**
     *前置过滤
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否执行过滤
     * @return
     */

    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 包含过滤功能
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        RequestContext cxt = RequestContext.getCurrentContext();
        HttpServletRequest request = cxt.getRequest();
        String method = request.getMethod();
        String url = request.getRequestURL().toString();
        System.out.printf("%s request to %s\r\n", method, url);
        return null;
    }
}
