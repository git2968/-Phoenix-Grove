package xyz.d4c.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.d4c.lease.model.entity.BrowsingHistory;
import xyz.d4c.lease.web.admin.service.BrowsingHistoryService;
import xyz.d4c.lease.web.admin.mapper.BrowsingHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【browsing_history(浏览历史)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class BrowsingHistoryServiceImpl extends ServiceImpl<BrowsingHistoryMapper, BrowsingHistory>
    implements BrowsingHistoryService{

}




