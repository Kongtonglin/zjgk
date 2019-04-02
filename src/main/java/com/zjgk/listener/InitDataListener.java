package com.zjgk.listener;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;

import com.zjgk.entity.Province;
import com.zjgk.entity.SchoolRankFx;
import com.zjgk.entity.SchoolRankGlx;
import com.zjgk.entity.SchoolRankGx;
import com.zjgk.entity.SchoolRankJjx;
import com.zjgk.entity.SchoolRankJyx;
import com.zjgk.entity.SchoolRankLsx;
import com.zjgk.entity.SchoolRankLx;
import com.zjgk.entity.SchoolRankNx;
import com.zjgk.entity.SchoolRankShkx;
import com.zjgk.entity.SchoolRankWx;
import com.zjgk.entity.SchoolRankYx;
import com.zjgk.entity.SchoolRankZh;
import com.zjgk.entity.SchoolRankZrkx;
import com.zjgk.entity.SchoolRankZx;
import com.zjgk.service.CommonQueryService;
import com.zjgk.util.CachFactory;

public class InitDataListener implements InitializingBean, ServletContextAware {

	@Autowired
	private CommonQueryService commonQueryService;
//	
//	@Autowired
//	private MaterialService materialService;
//	
//	@Autowired
//	private DistrictService districtService;
	
	private static final Logger log = LoggerFactory.getLogger(InitDataListener.class);

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("=====================================InitDataListener start...============================");
		try {
			
			//province
			List<Province> provinceList = commonQueryService.getProvinceListByOpenSession();
			Map<String, Object> provinceMap = CachFactory.getInstance().createCache("provinceMap");
			for(Province p: provinceList){
				provinceMap.put(String.valueOf(p.getId()), p.getName());
			}
			
			//法学
			List<SchoolRankFx> schoolRankFxList = commonQueryService.getSchoolRankFxListByOpenSession();
			Map<String, Object> schoolRankFxMap = CachFactory.getInstance().createCache("schoolRankFxMap");
			for(SchoolRankFx r: schoolRankFxList){
				schoolRankFxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//管理学
			List<SchoolRankGlx> schoolRankGlxList = commonQueryService.getSchoolRankGlxListByOpenSession();
			Map<String, Object> schoolRankGlxMap = CachFactory.getInstance().createCache("schoolRankGlxMap");
			for(SchoolRankGlx r: schoolRankGlxList){
				schoolRankGlxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//工学
			List<SchoolRankGx> schoolRankGxList = commonQueryService.getSchoolRankGxListByOpenSession();
			Map<String, Object> schoolRankGxMap = CachFactory.getInstance().createCache("schoolRankGxMap");
			for(SchoolRankGx r: schoolRankGxList){
				schoolRankGxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//经济学
			List<SchoolRankJjx> schoolRankJjxList = commonQueryService.getSchoolRankJjxListByOpenSession();
			Map<String, Object> schoolRankJjxMap = CachFactory.getInstance().createCache("schoolRankJjxMap");
			for(SchoolRankJjx r: schoolRankJjxList){
				schoolRankJjxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//教育学
			List<SchoolRankJyx> schoolRankJyxList = commonQueryService.getSchoolRankJyxListByOpenSession();
			Map<String, Object> schoolRankJyxMap = CachFactory.getInstance().createCache("schoolRankJyxMap");
			for(SchoolRankJyx r: schoolRankJyxList){
				schoolRankJyxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//历史学
			List<SchoolRankLsx> schoolRankLsxList = commonQueryService.getSchoolRankLsxListByOpenSession();
			Map<String, Object> schoolRankLsxMap = CachFactory.getInstance().createCache("schoolRankLsxMap");
			for(SchoolRankLsx r: schoolRankLsxList){
				schoolRankLsxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//历史学
			List<SchoolRankLx> schoolRankLxList = commonQueryService.getSchoolRankLxListByOpenSession();
			Map<String, Object> schoolRankLxMap = CachFactory.getInstance().createCache("schoolRankLxMap");
			for(SchoolRankLx r: schoolRankLxList){
				schoolRankLxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//农学
			List<SchoolRankNx> schoolRankNxList = commonQueryService.getSchoolRankNxListByOpenSession();
			Map<String, Object> schoolRankNxMap = CachFactory.getInstance().createCache("schoolRankNxMap");
			for(SchoolRankNx r: schoolRankNxList){
				schoolRankNxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//社会科学
			List<SchoolRankShkx> schoolRankShkxList = commonQueryService.getSchoolRankShkxListByOpenSession();
			Map<String, Object> schoolRankShkxMap = CachFactory.getInstance().createCache("schoolRankShkxMap");
			for(SchoolRankShkx r: schoolRankShkxList){
				schoolRankShkxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//文学
			List<SchoolRankWx> schoolRankWxList = commonQueryService.getSchoolRankWxListByOpenSession();
			Map<String, Object> schoolRankWxMap = CachFactory.getInstance().createCache("schoolRankWxMap");
			for(SchoolRankWx r: schoolRankWxList){
				schoolRankWxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//医学
			List<SchoolRankYx> schoolRankYxList = commonQueryService.getSchoolRankYxListByOpenSession();
			Map<String, Object> schoolRankYxMap = CachFactory.getInstance().createCache("schoolRankYxMap");
			for(SchoolRankYx r: schoolRankYxList){
				schoolRankYxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//综合
			List<SchoolRankZh> schoolRankZhList = commonQueryService.getSchoolRankZhListByOpenSession();
			Map<String, Object> schoolRankZhMap = CachFactory.getInstance().createCache("schoolRankZhMap");
			for(SchoolRankZh r: schoolRankZhList){
				schoolRankZhMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//自然科学
			List<SchoolRankZrkx> schoolRankZrkxList = commonQueryService.getSchoolRankZrkxListByOpenSession();
			Map<String, Object> schoolRankZrkxMap = CachFactory.getInstance().createCache("schoolRankZrkxMap");
			for(SchoolRankZrkx r: schoolRankZrkxList){
				schoolRankZrkxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
			//自然科学
			List<SchoolRankZx> schoolRankZxList = commonQueryService.getSchoolRankZxListByOpenSession();
			Map<String, Object> schoolRankZxMap = CachFactory.getInstance().createCache("schoolRankZxMap");
			for(SchoolRankZx r: schoolRankZxList){
				schoolRankZxMap.put(String.valueOf(r.getSchool()), r.getRank());
			}
			
 
		} catch (Exception e) {
			log.error(e.getMessage()+" : "+e.getCause());
		}
		log.info("=======================================InitDataListener end... ============================");
	}

	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		
	} 
}
