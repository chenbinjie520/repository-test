package com.xuecheng.manage_cms_client.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author bingai
 * @create 2020-02-10 14:12
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {


}
