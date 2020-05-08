# SpringCloud-zuul

第六天SpringCloud

	zuul
	浏览器打开  http://localhost:8081/book-provider/ProBookAll
	没有添加zuul配置时 调用成功 显示数据
	浏览器打开  http://localhost:8081/chj/ProBookAll
	添加zuul配置后 上面调用失败 下面显示数据 伪装成功
	




springcloud-zuul
	包括：

	1.rpc
	2.eureka
	3.zuul
		eureka-management（eureka配置）（1）
		
		springclou-zuul-management（业务管理）（1）
			 zuul-mapper（mapper）
			 zuul-model（model）
			 zuul-service（service）
			 zuul-api（api）

		springcloud-zuul-provider（基础提供者）（1）

		springclou-zuul-consumer（基础消费者）（1）	
