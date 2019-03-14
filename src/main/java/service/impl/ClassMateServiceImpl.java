package service.impl;

import anno.ExposeService;
import service.ClassMateService;

/**
 * @Author:kongyuting
 * @Date:2019/3/14 10:23
 */
@ExposeService
public class ClassMateServiceImpl implements ClassMateService {

    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }
}
