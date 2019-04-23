/**
 * 
 */
package com.baghant.zuul.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author Bijendra
 *
 */
public class ErrorFilter extends ZuulFilter {
	 
	  @Override
	  public String filterType() {
	    return "error";
	  }
	 
	  @Override
	  public int filterOrder() {
	    return 1;
	  }
	 
	  @Override
	  public boolean shouldFilter() {
	    return true;
	  }
	 
	  @Override
	  public Object run() {
	   System.out.println("Inside Error Filter");
	 
	    return null;
	  }
	}