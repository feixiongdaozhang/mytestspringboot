package com.huada.api.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huada.device_management_interface.ExampleInterface;
@RestController
@RequestMapping("/acg/v1")
public class ExampleController {
	@Autowired
	ExampleInterface exampleInterface;
	 @RequestMapping(value = "/example",method = RequestMethod.POST,consumes="application/x-www-form-urlencoded")
	    //@OperationLog
	   /* public void commonController(@RequestParse CommonRequestArgs args){
	       // return ServiceRouterHandler.handler(args);
	    }*/
		public void page(
				@RequestParam(value="searchParams",required=false) String searchParams,
				@RequestParam(value = "current") int current,
				@RequestParam(value = "pageSize") int pageSize) throws Exception {
		        System.out.println(searchParams);
		        System.out.println(current);
		        System.out.println(pageSize);
			/*Map<String, Object> searchMap = new HashMap<>();
			if (!StringUtils.isEmpty(searchParams)) {
				searchMap = JsonUtil.parse(searchParams, Map.class);
			}

			Page<ChannelModel> page = channelService.page(current, pageSize,searchMap);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put(Constant.RESPONSE_DATA, page);
			result.put(Constant.RESPONSE_DATA_PAGE, new RdPage(page));
			result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, "查询成功");
			ServletUtils.writeToResponse(response, result);*/
		}
	 @RequestMapping(value = "/index",method = RequestMethod.GET)
	 public String index(){
		 exampleInterface.findByUserName("admin");
		 return "index";
	 }
	 
}
