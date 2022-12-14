<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>BaseBall Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">
<link href="/css/style.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/boards">Blog</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">

					<c:choose>
							<li class="nav-item"><a class="nav-link" href="/stadium/saveForm">경기장 등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/stardium">경기장 목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/team">팀 목록 </a></li>
							<li class="nav-item"><a class="nav-link" href="/team/saveForm">팀 등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/player">선수 목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/player/saveForm">선수 등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/">팀 별 포지션 목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/">퇴출된 선수 목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/">퇴출 사유 등록</a></li>
					</c:choose>



				</ul>
			</div>
		</div>
	</nav>