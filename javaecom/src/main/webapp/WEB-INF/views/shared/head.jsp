<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<!-- Head BEGIN -->
<head>

<spring:url value="/resources/pages" var="pages" />
<spring:url value="/resources/plugins" var="plugins" />
<spring:url value="/resources/corporate" var="corporate" />

<meta charset="utf-8">
<title>Houshop | ${title}</title>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<meta content="Metronic Shop UI description" name="description">
<meta content="Metronic Shop UI keywords" name="keywords">
<meta content="keenthemes" name="author">

<meta property="og:site_name" content="-CUSTOMER VALUE-">
<meta property="og:title" content="-CUSTOMER VALUE-">
<meta property="og:description" content="-CUSTOMER VALUE-">
<meta property="og:type" content="website">
<meta property="og:image" content="-CUSTOMER VALUE-">
<!-- link to image for socio -->
<meta property="og:url" content="-CUSTOMER VALUE-">

<!-- <link rel="shortcut icon" href="favicon.ico">
 -->
<link
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css"
	rel="stylesheet" type="text/css">
<!-- Fonts START -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all"
	rel="stylesheet" type="text/css">
<!--- fonts for slider on the index page -->
<!-- Fonts END -->

<!-- Global styles START -->
<link href="${plugins}/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${plugins}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Global styles END -->

<!-- Page level plugin styles START -->
<link href="${pages}/css/animate.css" rel="stylesheet">
<link href="${plugins}/fancybox/source/jquery.fancybox.css"
	rel="stylesheet">
<link href="${plugins}/owl.carousel/assets/owl.carousel.css"
	rel="stylesheet">
<link href="${plugins}/uniform/css/uniform.default.css" rel="stylesheet"
	type="text/css">

<!-- Page level plugin styles END -->

<!-- Theme styles START -->
<link href="${pages}/css/components.css" rel="stylesheet">
<link href="${pages}/css/slider.css" rel="stylesheet">
<link href="${pages}/css/style-shop.css" rel="stylesheet"
	type="text/css">
<link href="${corporate}/css/style.css" rel="stylesheet">
<link href="${corporate}/css/style-responsive.css" rel="stylesheet">
<link href="${corporate}/css/themes/red.css" rel="stylesheet"
	id="style-color">
<link href="${corporate}/css/custom.css" rel="stylesheet">
<!-- Theme styles END -->

<!-- for slider-range -->
<link href="${plugins}/rateit/src/rateit.css" rel="stylesheet"
	type="text/css">
</head>
<!-- Head END -->