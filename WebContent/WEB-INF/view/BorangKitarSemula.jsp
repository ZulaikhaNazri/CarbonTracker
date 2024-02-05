<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<title>Carbon Tracker</title>
<meta content="" name="description">
<meta content="" name="keywords">
<link href="/CarbonTracker/assets/img/favicon.png" rel="icon">
<link href="/CarbonTracker/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

<link href="https://fonts.gstatic.com" rel="preconnect">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="/CarbonTracker/assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="/CarbonTracker/assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet">
<link href="/CarbonTracker/assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="/CarbonTracker/assets/vendor/quill/quill.snow.css" rel="stylesheet">
<link href="/CarbonTracker/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
<link href="/CarbonTracker/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
<link href="/CarbonTracker/assets/vendor/simple-datatables/style.css" rel="stylesheet">
<link href="/CarbonTracker/assets/css/style.css" rel="stylesheet">
</head>
<body>

	<!-- ======= Header ======= -->
	<header id="header" class="header fixed-top d-flex align-items-center">

		<div class="d-flex align-items-center justify-content-between">
			<a href="index.html" class="logo d-flex align-items-center"> <img
				src="assets/img/logo.png" alt=""> <span
				class="d-none d-lg-block">CarbonTracker</span>
			</a> <i class="bi bi-list toggle-sidebar-btn"></i>
		</div>
		<!-- End Logo -->


		<nav class="header-nav ms-auto">
			<ul class="d-flex align-items-center">

				<li class="nav-item dropdown pe-3"><a
					class="nav-link nav-profile d-flex align-items-center pe-0"
					href="#" data-bs-toggle="dropdown"> <img
						src="assets/img/profile-img.jpg" alt="Profile"
						class="rounded-circle"> <span
						class="d-none d-md-block dropdown-toggle ps-2">Zulaikha
							Nazri</span>
				</a>
				<!-- End Profile Iamge Icon -->

					<ul
						class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
						<li class="dropdown-header">
							<h6>Zulaikha Nazri</h6> <span>Web Designer</span>
						</li>
						<li>
							<hr class="dropdown-divider">
						</li>

						<li><a class="dropdown-item d-flex align-items-center"
							href="#"> <i class="bi bi-box-arrow-right"></i> <span>Sign
									Out</span>
						</a></li>

					</ul>
					<!-- End Profile Dropdown Items --></li>
				<!-- End Profile Nav -->

			</ul>
		</nav>
		<!-- End Icons Navigation -->

	</header>
	<!-- End Header -->

	<!-- ======= Sidebar ======= -->
	<aside id="sidebar" class="sidebar">

		<ul class="sidebar-nav" id="sidebar-nav">

			<li class="nav-item"><a class="nav-link collapsed "
				href="UserIndex.jsp"> <i class="bi bi-grid"></i> <span>Laman
						Utama</span>
			</a></li>
			<!-- End Dashboard Nav -->

			<li class="nav-item"><a class="nav-link"
				data-bs-target="#components-nav" data-bs-toggle="collapse" href="#">
					<i class="bi bi-graph-up"></i><span>Analisis Karbon</span><i
					class="bi bi-chevron-down ms-auto"></i>
			</a>
				<ul id="components-nav" class="nav-content collapse "
					data-bs-parent="#sidebar-nav">
					<li><a href="components-alerts.html"> <i
							class="bi bi-circle"></i><span>Analisis Karbon Keseluruhan</span>
					</a></li>
					<li><a href="BorangAir.jsp"> <i class="bi bi-circle"></i><span>Penggunaan
								Air</span>
					</a></li>
					<li><a href="components-badges.html"> <i
							class="bi bi-circle"></i><span>Penggunaan Elektrik</span>
					</a></li>
					<li><a href="BorangKitarSemula.jsp"> <i
							class="bi bi-circle"></i><span>Kegunaan Bahan Kitar Semula</span>
					</a></li>
				</ul></li>
			<!-- End Components Nav -->

			<li class="nav-item"><a class="nav-link collapsed"
				href="RekodBulanan.jsp"> <i class="bi bi-folder2"></i> <span>Rekod
						Bulanan</span>
			</a></li>
			<!-- End Profile Page Nav -->

			<li class="nav-item"><a class="nav-link collapsed"
				href="RekodPenyertaan.jsp"> <i class="bi bi-calendar-month"></i>
					<span>Rekod Penyertaan</span>
			</a></li>
			<!-- End F.A.Q Page Nav -->

			<li class="nav-item"><a class="nav-link collapsed"
				href="pages-contact.html"> <i class="bi bi-person"></i> <span>Profile</span>
			</a></li>
			<!-- End Contact Page Nav -->


		</ul>

	</aside>
	<!-- End Sidebar-->

	<main id="main" class="main">

		<div class="pagetitle">
			<h1>Penggunaan Bahan Kitar Semula</h1>
			<nav>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="UserIndex.jsp">Laman
							Utama</a></li>
					<li class="breadcrumb-item">Analisis Karbon</li>
					<li class="breadcrumb-item active">Penggunaan Bahan Kitar
						Semula</li>
				</ol>
			</nav>
		</div>
		<!-- End Page Title -->

		<section class="section dashboard">
    <div class="row">
        <div class="col-lg-8">
            <div class="row">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Pilih :</h5>
                        <button type="button" class="btn btn-outline-primary active">Borang Penggunaan Bahan Kitar Semula</button>
                        <button type="button" class="btn btn-outline-primary"><a href="RekodRecycle/">Rekod Penggunaan Bahan Kitar Semula</a></button>
                    </div>
                </div>
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Borang Penggunaan Bahan Kitar Semula</h5>

                        <!-- General Form Elements -->
                        <c:if test="${currentView ne 'update' and currentView ne 'getById' }">
                        <form action="<c:url value='RekodRecycle/add'/>" method="post">
                            <div class="row mb-3">
                                <label for="inputText" class="col-sm-2 col-form-label">Tarikh :</label>
                                <div class="col-sm-10">
                                    <input type="text" name="tarikh" class="form-control">
                                </div>
                                </div>
                            <div class="row mb-3">
                                <label for="inputText" class="col-sm-2 col-form-label">Jumlah Penggunaan Bahan Kitar Semula(kg):</label>
                                <div class="col-sm-10">
                                    <input type="text" name="jumlah_recycle" class="form-control">
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label for="inputText" class="col-sm-2 col-form-label">Jumlah Bayaran Penggunaan (RM):</label>
                                <div class="col-sm-10">
                                    <input type="text" name="jumlah_bayaran" class="form-control">
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label class="col-sm-2 col-form-label"></label>
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-primary">Hantar Borang</button>
                                </div>
                            </div>
                        </form>
                        </c:if>
                        <!-- End General Form Elements -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

	</main>
	<!-- End #main -->

	<!-- ======= Footer ======= -->
	<footer id="footer" class="footer">
		<div class="copyright">
			&copy; Copyright <strong><span>NiceAdmin</span></strong>. All Rights
			Reserved
		</div>
		<div class="credits">
			<!-- All the links in the footer should remain intact. -->
			<!-- You can delete the links only if you purchased the pro version. -->
			<!-- Licensing information: https://bootstrapmade.com/license/ -->
			<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
			Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
		</div>
	</footer>
	<!-- End Footer -->

	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a>

	<!-- Vendor JS Files -->
	<script src="/CarbonTracker/assets/vendor/apexcharts/apexcharts.min.js"></script>
	<script src="/CarbonTracker/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="/CarbonTracker/assets/vendor/chart.js/chart.umd.js"></script>
	<script src="/CarbonTracker/assets/vendor/echarts/echarts.min.js"></script>
	<script src="/CarbonTracker/assets/vendor/quill/quill.min.js"></script>
	<script src="/CarbonTracker/assets/vendor/simple-datatables/simple-datatables.js"></script>
	<script src="/CarbonTracker/assets/vendor/tinymce/tinymce.min.js"></script>
	<script src="/CarbonTracker/assets/vendor/php-email-form/validate.js"></script>

	<!-- Template Main JS File -->
	<script src="/CarbonTracker/assets/js/main.js"></script>

</body>
</html>
