<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到昨日头条</title>
<link href="/public/css/bootstrap.min.css" rel="stylesheet">
<link href="/public/css/index.css" rel="stylesheet">
</head>
<body>
	<div style="background-image: url('/public/images/boat.jpg');"><!-- 背景图 -->
	<!-- 头部导航 -->
	<jsp:include page="./common/user/head-top.jsp"></jsp:include>

	<div class="container-fluid" style="margin-top: 6px;">
		<div class="row offset-1">
			<!-- 频道 -->
			<div class="col-1">
				<h2>1710F<br>贺旭东</h2>
				<ul class="nav flex-column">
					<li class="nav-item "><a class="nav-link" href="#">热点</a></li>
					<li class="nav-item"><a class="nav-link active" href="#">科技</a></li>
					<li class="nav-item"><a class="nav-link" href="#">旅游</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a></li>
				</ul>

			</div>
			<div class="col-6">
				<!-- 轮播图 -->
				<div id="carouselExampleControls" class="carousel slide"
					data-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img
								src="/public/images/car1.jpg"
								height="386px;" class="d-block w-100" alt="...">
						</div>
						<div class="carousel-item">
							<img
								src="/public/images/car2.jpg"
								height="386px;" class="d-block w-100" alt="...">
						</div>
						<div class="carousel-item">
							<img
								src="/public/images/ma1.jpg"
								height="386px;" class="d-block w-100" alt="...">
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExampleControls"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleControls"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>
				<!-- 频道下的文章分类 -->
				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link active" href="#">全部</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">科技</a></li>
					<li class="nav-item"><a class="nav-link" href="#">文化</a></li>
				</ul>
				<!-- 文章列表 -->
				<div style="margin-top: 18px;">
				  	<div class="media">
					  <img src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87" class="mr-3" style="height: 108px; width: 175px;">
					  <div class="media-body">
					    <h4 class="mt-1">
					    	<a href="/article/detail/1.html" target="_blank">乐视网：公司管理层正在努力维持公司的持续经营能力</a>
					    </h4>
					    <p style="color: #999;">蝈蝈 2020-01-24 19:20:20</p>
					  </div>
					</div>
				  	<div class="media">
					  <img src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87" class="mr-3" style="height: 108px; width: 175px;">
					  <div class="media-body">
					    <h4 class="mt-1">
					    	<a href="/article/detail/1.html" target="_blank">乐视网：公司管理层正在努力维持公司的持续经营能力</a>
					    </h4>
					    <p style="color: #999;">蝈蝈 2020-01-24</p>
					  </div>
					</div>
				  	<div class="media">
					  <img src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87" class="mr-3" style="height: 108px; width: 175px;">
					  <div class="media-body">
					    <h4 class="mt-1">
					    	<a href="/article/detail/1.html" target="_blank">乐视网：公司管理层正在努力维持公司的持续经营能力</a>
					    </h4>
					    <p style="color: #999;">蝈蝈 2020-01-24</p>
					  </div>
					</div>
				</div>
				<!-- 分页 -->
				<ul class="pagination">
					<li class="page-item"><a class="page-link" href="#"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
					</a></li>
					<li class="page-item"><a class="page-link" href="#">1</a></li>
					<li class="page-item"><a class="page-link" href="#">2</a></li>
					<li class="page-item"><a class="page-link" href="#">3</a></li>
					<li class="page-item"><a class="page-link" href="#"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span>
					</a></li>
				</ul>	
			</div>
			<!-- 首页右侧 -->
			<div class="col-3">
				<div class="right">
					<div>最新文章</div>
					<ul class="list-unstyled">
						<li class="media"><img
							src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87"
							style="height: 72px; width: 72px;" class="mr-3" alt="...">
							<div class="media-body">
								<h5 class="mt-0 mb-1">电子眼全面升级，新增5项功能！</h5>
							</div></li>
						<li class="media"><img
							src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87"
							style="height: 72px; width: 72px;" class="mr-3" alt="...">
							<div class="media-body">
								<h5 class="mt-0 mb-1">电子眼全面升级，新增5项功能！</h5>
							</div></li>
						<li class="media"><img
							src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87"
							style="height: 72px; width: 72px;" class="mr-3" alt="...">
							<div class="media-body">
								<h5 class="mt-0 mb-1">电子眼全面升级，新增5项功能！</h5>
							</div></li>
					</ul>
				</div>
				<div class="right">
					<div>最热文章</div>
					<ul class="list-unstyled">
						<li class="media"><img
							src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87"
							style="height: 72px; width: 72px;" class="mr-3" alt="...">
							<div class="media-body">
								<h5 class="mt-0 mb-1">电子眼全面升级，新增5项功能！</h5>
							</div></li>
						<li class="media"><img
							src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87"
							style="height: 72px; width: 72px;" class="mr-3" alt="...">
							<div class="media-body">
								<h5 class="mt-0 mb-1">电子眼全面升级，新增5项功能！</h5>
							</div></li>
						<li class="media"><img
							src="http://p1.pstatp.com/large/pgc-image/4ab237b9682f4c0286da5c5e6823dc87"
							style="height: 72px; width: 72px;" class="mr-3" alt="...">
							<div class="media-body">
								<h5 class="mt-0 mb-1">电子眼全面升级，新增5项功能！</h5>
							</div></li>
					</ul>
				</div>
			</div>

		</div>
	</div>
	</div>
	<script src="/public/js/jquery.min.1.12.4.js"></script>
	<script src="/public/js/bootstrap.min.js"></script>
	</div>
</body>
</html>