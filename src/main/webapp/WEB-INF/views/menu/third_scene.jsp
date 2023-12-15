<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="user-scalable=yes, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, width=device-width" />
<title>http://localhost:9093/</title>

<link href="/css/style.css" rel="Stylesheet" type="text/css">


</head>
<body>
	<div class="container mt-3">
    <div class="row">
    	<c:forEach var="planVO" items="${third_sc}">
			<c:set var="planID" value="${planVO.planID }" />
			<c:set var="name" value="${planVO.pname }" />
			<div class="col-sm">
            <a href="/community/list_by_planID.do?planID=${planVO.planID }">
                <div class="card img-fluid rounded-4">
                    <img class="card-img-top rounded-4" src="main/images/Seoul.png" alt="Card image" style="width: 100%">
                    <div class="card-img-overlay">
                        <h4 class="text-white">${name }</h4>
                    </div>
                </div>
            </a>
        </div>
		</c:forEach>
    </div>
</div>
</body>
</html>