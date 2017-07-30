package com.ido.demo.utils;

import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/18.
 */
public class PageUtil {
    /**
     *
     * @param model the return model to the view
     * @param size the size about how many page number should show
     */
    public static  void preparePage(Map<String, Object> model,int size){
        List pages = new ArrayList(size);
        for(int i = 0; i< size; i++){
            pages.add(i);
        }
        model.put("pages",pages);
    }

    /**
     *
     * @param model
     * @param source
     */
    public static  void preparePage(Map<String, Object> model, Collection source){
        //todo ,default 10 product per page  , may need to be able to  customize in the future
        if(source == null){
            model.put("pages",new ArrayList(0));
            return;
        }
        int size = source.size()/10 +1;
        List pages = new ArrayList(size);
        for(int i = 0; i< size; i++){
            pages.add(i);
        }
        model.put("pages",pages);
    }


}
