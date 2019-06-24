package com.zy.service.option.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zy.constant.ErrorConstant;
import com.zy.exception.BusinessException;
import com.zy.dao.OptionDao;
import com.zy.model.OptionsDomain;
import com.zy.service.option.OptionService;

@Service
public class OptionServiceImpl implements OptionService{
	
	@Autowired
	private OptionDao optionDao;

	@Override
	@Cacheable(value = "optionCache", key = "'option_'")
	public List<OptionsDomain> getOptions() {
		// TODO Auto-generated method stub
		return optionDao.getOptions();
	}

	@Override
	@Transactional
	@CacheEvict(value = {"optionCache","optionCache"}, allEntries = true, beforeInvocation = true)
	public void saveOptions(Map<String, String> options) {
		// TODO Auto-generated method stub
		if(null != options && !options.isEmpty()) {
			options.forEach(this::updateOptionByName);
		}
		
	}
	/*@CacheEvict是用来标注在需要清除缓存元素的方法或类上的。
	当标记在一个类上时表示其中所有的方法的执行都会触发缓存的清除操作。
	@CacheEvict可以指定的属性有value、key、condition、allEntries和beforeInvocation。
	其中value、key和condition的语义与@Cacheable对应的属性类似。
	即value表示清除操作是发生在哪些Cache上的（对应Cache的名称）；
	key表示需要清除的是哪个key，如未指定则会使用默认策略生成的key；
	condition表示清除操作发生的条件。
	下面我们来介绍一下新出现的两个属性allEntries和beforeInvocation。
*/
    @Override
    @Transactional
    @CacheEvict(value = {"optionsCache", "optionCache"}, allEntries = true, beforeInvocation = true)
    public void updateOptionByName(String name, String value) {
        if (StringUtils.isBlank(name))
            throw BusinessException.withErrorCode(ErrorConstant.Common.PARAM_IS_EMPTY);
        OptionsDomain option = new OptionsDomain();
        option.setName(name);
        option.setValue(value);
        optionDao.updateOptionByName(option);
    }

    @Override
    @Cacheable(value = "optionCache", key = "'optionByname+' + #p0")
    public OptionsDomain getOptionByName(String name) {
        if (StringUtils.isBlank(name))
            throw BusinessException.withErrorCode(ErrorConstant.Common.PARAM_IS_EMPTY);
        return optionDao.getOptionByName(name);
    }
}

